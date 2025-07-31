import java.io.FileReader;
import java.io.FileWriter;

public class Task1 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("D:\\romeo-and-juliet.txt")) {
            StringBuilder sb = new StringBuilder();
            int i;
            int maxWordLength = 0;
            int currentWordLength = 0;
            int longestWordStart = 0;
            int currentWordStart = 0;

            while ((i = fr.read()) != -1) {
                char c = (char) i;
                sb.append(c);

                if (Character.isLetterOrDigit(c)) {
                    if (currentWordLength == 0) {
                        currentWordStart = sb.length() - 1;
                    }
                    currentWordLength++;
                } else {
                    if (currentWordLength > maxWordLength) {
                        maxWordLength = currentWordLength;
                        longestWordStart = currentWordStart;
                    }
                    currentWordLength = 0;
                }
            }

            String longestWord = sb.substring(longestWordStart, longestWordStart + maxWordLength);
            try (FileWriter fw = new FileWriter("D:\\longest-word.txt")) {
                fw.write(longestWord);
                fw.flush();
                System.out.println("Запись в файл прошла успешно!");
                System.out.println("Самое длинное слово: " + longestWord);
                System.out.println("Длина: " + maxWordLength);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Файл не найден!");
        }
    }
}