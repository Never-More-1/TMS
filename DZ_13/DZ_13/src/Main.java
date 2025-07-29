import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин: ");
        String login = scanner.nextLine();
        System.out.println("Введите пароль: ");
        String password = scanner.nextLine();
        System.out.println("Подтвердите пароль: ");
        String confirmPassword = scanner.nextLine();
        boolean result = User.logInCheck(login, password, confirmPassword);
        System.out.println(result);
    }
}