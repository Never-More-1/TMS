package parsers;

import model.Author;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class SaxMain {

    public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();

            XMLHandler handler = new XMLHandler();
            parser.parse(new File("src\\main\\java\\resources\\data.xml"), handler);

            Author author = handler.getAuthor();

            String fileName = author.getFirstName() + "_" + author.getLastName() + "_" + author.getTitle() + ".txt";

            try (FileWriter writer = new FileWriter(fileName)) {
                for (String line : author.getLines()) {
                    writer.write(line + "\n");
                }
                System.out.println("Файл успешно создан: " + fileName);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static class XMLHandler extends DefaultHandler {
        private String currentElement = "";
        private StringBuilder currentText = new StringBuilder();
        private String firstName = "";
        private String lastName = "";
        private String title = "";
        private List<String> lines = new ArrayList<>();
        private Author author;

        public Author getAuthor() {
            return author;
        }

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            currentElement = qName;
            currentText.setLength(0);
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            String text = currentText.toString().trim();

            switch (qName) {
                case "firstName":
                    firstName = text;
                    break;
                case "lastName":
                    lastName = text;
                    break;
                case "title":
                    title = text;
                    break;
                case "line":
                    lines.add(text);
                    break;
            }

            currentElement = "";
        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            if (!currentElement.isEmpty()) {
                currentText.append(ch, start, length);
            }
        }

        @Override
        public void endDocument() throws SAXException {

            author = new Author(firstName, lastName, title, lines);
        }
    }
}