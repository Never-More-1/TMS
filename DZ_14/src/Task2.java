import java.io.*;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к документу: ");
        String filePath = scanner.nextLine();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath));
             BufferedWriter validWriter = new BufferedWriter(new FileWriter("D://valid-documents.txt"));
             BufferedWriter invalidWriter = new BufferedWriter(new FileWriter("D://invalid-documents.txt"))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {  // Чтение по строкам
                String docLine = line.trim();
                if (docLine.length() != 15) {
                    invalidWriter.write(docLine + " - " + "Длина номера документа должна быть 15 символов" + "\n");
                } else if (!docLine.matches("[A-Za-z0-9]+")) {
                    invalidWriter.write(docLine + " - " + "Номер документа должен содержать только цифры и буквы" + "\n");
                } else if (!(docLine.startsWith("docnum") || docLine.startsWith("contract"))) {
                    invalidWriter.write(docLine + " - " + "Номер документа должен начинаться с последовательности docnum или contract" + "\n");
                } else {
                    validWriter.write(docLine + "\n");
                }
            }
        } catch (IOException e) {
            System.out.println("Файл не найден!");
        }
    }
}
