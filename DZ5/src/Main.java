import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Task 1-------------------------------------------------------------------------------
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter first size of array: ");
        int sizeOne = scanner.nextInt();
        System.out.println("Enter second size of array: ");
        int sizeTwo = scanner.nextInt();
        System.out.println(" ");
        int[][] twoDimArray = new int[sizeTwo][sizeTwo];
        //Заполнение
        for (int i = 0; i <= sizeOne - 1; i++) {
            for (int j = 0; j <= sizeTwo - 1; j++) {
                twoDimArray[i][j] = random.nextInt(10, 30);
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println(" ");
        }
        //
        System.out.println(" ");
        System.out.println("Enter number for sum: ");
        int sumNumber = scanner.nextInt();
        int sum = 0;
        System.out.println(" ");
        for (int i = 0; i <= sizeOne - 1; i++) {
            for (int j = 0; j <= sizeTwo - 1; j++) {
                twoDimArray[i][j] += sumNumber;
                sum += twoDimArray[i][j];
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("Sum of array values: " + sum);
        scanner.close();
//Task 2-------------------------------------------------------------------------------
//        Scanner scanner = new Scanner(System.in);
//        String[][] arrayChess = new String[8][8];
//        int flag = 1;
//        for (int i = 0; i <= arrayChess.length - 1; i++) {
//            for (int j = 0; j <= arrayChess.length - 1; j++) {
//                if (flag == 1) {
//                    arrayChess[i][j] = "W";
//                    System.out.print(arrayChess[i][j] + " ");
//                    flag = 0;
//                } else {
//                    arrayChess[i][j] = "B";
//                    System.out.print(arrayChess[i][j] + " ");
//                    flag = 1;
//                }
//            }
//            if (i % 2 == 0) {
//                flag = 0;
//            } else {
//                flag = 1;
//            }
//            System.out.println(" ");
//        }
//        scanner.close();
//Task 3-------------------------------------------------------------------------------
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter first size of array: ");
//        int n = scanner.nextInt();
//        System.out.println("Enter second size of array: ");
//        int m = scanner.nextInt();
//
//        int[][] array = new int[n][m];
//        int count = 1;
//
//        for (int i = 0; i < n; i++) {
//            if (i % 2 == 0) {
//                for (int j = 0; j < m; j++) {
//                    array[i][j] = count++;
//                }
//            } else {
//                for (int j = m - 1; j >= 0; j--) {
//                    array[i][j] = count++;
//                }
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        scanner.close();
    }
}