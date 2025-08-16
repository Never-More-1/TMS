import java.util.Scanner;
import java.util.function.Supplier;

public class Task5 {
    public static void main(String[] args) {
        Supplier<String> reverse = () -> {
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            scanner.close();
            return new StringBuilder(line).reverse().toString();
        };

        System.out.println(reverse.get());
    }
}
