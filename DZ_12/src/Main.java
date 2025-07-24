import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        task1--------------------------------------------------------------------
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("([A-Z]{2,7})");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
//        task2--------------------------------------------------------------------
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        Pattern docNumber = Pattern.compile("(\\d{4}-)+\\d{2}");
//        Pattern email = Pattern.compile("([A-Za-z0-9]+@[A-Za-z0-9]+\\.[A-Za-z]{2,6})");
//        Pattern phoneNumber = Pattern.compile("(\\+\\([0-9]{2}\\)[0-9]{7})");
//        Matcher docMatcher = docNumber.matcher(input);
//        Matcher emailMatcher = email.matcher(input);
//        Matcher phoneMatcher = phoneNumber.matcher(input);
//        while (docMatcher.find()) {
//            System.out.println("Document number: " + docMatcher.group());
//        }
//        while (emailMatcher.find()) {
//            System.out.println("Email: " + emailMatcher.group());
//        }
//        while (phoneMatcher.find()) {
//            System.out.println("Phone number: " + phoneMatcher.group());
//        }
    }
}