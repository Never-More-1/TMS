import java.util.LinkedHashSet;
import java.util.Scanner;



public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String input = scanner.nextLine();
        input = input.replaceAll(" ", "");
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            linkedHashSet.add(String.valueOf(ch));
        }

        System.out.println(linkedHashSet);
    }
}
