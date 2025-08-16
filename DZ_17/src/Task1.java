import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату рождения в формате mm-dd-yyyy(дата рождения должна быть не позже " + LocalDate.now() + ")");
        String birthdayDate = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMddyyyy");
        LocalDate date = LocalDate.parse(birthdayDate, formatter);
        if (date.isAfter(LocalDate.now())){
            System.out.println("Вы еще не родились)");
            return;
        }
        System.out.println(date);
        date = date.plusYears(100);
        System.out.println(date);
    }
}