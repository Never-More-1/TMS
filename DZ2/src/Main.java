import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Task 1-----------------------------------------
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        switch (month) {
            case 12: case 1: case 2:
                System.out.print("Зима");
                break;
            case 3: case 4: case 5:
                System.out.print("Весна");
                break;
            case 6: case 7: case 8:
                System.out.print("Лето");
                break;
            case 9: case 10: case 11:
                System.out.print("Осень");
                break;
            default:
                System.out.print("Некорректный месяц");
                scanner.close();
        }
//Task 2-----------------------------------------
//        Scanner scanner = new Scanner(System.in);
//        int month = scanner.nextInt();
//        if (month == 12 || month == 1 || month == 2) {
//            System.out.print("Зима");
//        } else if (month == 3 || month == 4 || month == 5) {
//            System.out.print("Весна");
//        } else if (month == 6 || month == 7 || month == 8) {
//            System.out.print("Лето");
//        } else if (month == 9 || month == 10 || month == 11) {
//            System.out.print("Осень");
//        } else {
//            System.out.print("Некорректный месяц");
//        }
//        scanner.close();
//Task 3-----------------------------------------
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        if (number % 2 == 0) {
//            System.out.print("Четное");
//        } else {
//            System.out.print("Неетное");
//        }
//Task 4-----------------------------------------
//        Scanner scanner = new Scanner(System.in);
//        int temperature = scanner.nextInt();
//        if (temperature > -5) {
//            System.out.print("Тепло");
//        } else if (temperature <= -5 && temperature > -20) {
//            System.out.print("Нормально");
//        } else {
//            System.out.print("Холодно");
//        }
//        scanner.close();
//Task 5-----------------------------------------
//        for (int i = 1; i < 100; i++) {
//            if (i % 2 != 0) {
//                System.out.print(i + " ");
//            }
//        }
//Task 6-----------------------------------------
//        for (int i = 5; i > 0; i--) {
//            System.out.print(i + " ");
//        }
//Task 7-----------------------------------------
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        int sum = 0;
//        for (; number > 0; number--) {
//            sum += number;
//        }
//        System.out.print(sum);
//        scanner.close();
//Task 8-----------------------------------------
//        int i = 7;
//        while (i <= 98){
//            System.out.print(i + " ");
//            i += 7;
//        }
//Task 9-----------------------------------------
//        for (int i = 0; i != -50; i -= 5){
//            System.out.print(i + " ");
//        }
//Task 10-----------------------------------------
//        for (int i = 10; i <= 20; i ++) {
//            System.out.print(i*i + " ");
//        }
//Task 11-----------------------------------------
//        for (int i = 0; i <= 8; i++) {
//            if (i == 2 || i == 5) {
//                System.out.print("* " + "\n");
//                continue;
//            }
//            System.out.print("* ");
//        }
//Task 12-----------------------------------------
//        int a = 1;
//        int b = 1;
//        int c;
//        System.out.print(a + " " + b + " ");
//        for (int i = 0; i < 9; i++) {
//            c = a + b;
//            a = b;
//            b = c;
//            System.out.print(c + " ");
//        }
    }
}
