import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//Task 1------------------------------------------------------
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println(array[i]);
        }
        System.out.println("");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
        scanner.close();
//Task 2------------------------------------------------------
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter array size: ");
//        int size = scanner.nextInt();
//        int[] array = new int[size];
//        for (int i = 0; i <= array.length - 1; i++) {
//            array[i] = (int) (Math.random() * 100);
//            System.out.println(array[i]);
//        }
//        int max = array[0];
//        int min = array[0];
//        for (int i = 0; i <= array.length - 1; i++) {
//            if (array[i] > max) {
//                max = array[i];
//            }
//            if (array[i] < min) {
//                min = array[i];
//            }
//        }
//        System.out.println("");
//        System.out.println("Max = " + max);
//        System.out.println("Min = " + min);
//Task 3------------------------------------------------------
//        int[] array = {-8, 10, -73, 52, 0};
//        int max_index = 0;
//        int min_index = 0;
//        for (int i = 0; i <= array.length - 1; i++) {
//            if (array[i] > array[max_index]) {
//                max_index = i;
//            }
//            if (array[i] < array[min_index]) {
//                min_index = i;
//            }
//            System.out.println(array[i]);
//        }
//        System.out.println("");
//        System.out.println("Max index = " + max_index);
//        System.out.println("Min index = " + min_index);
//Task 4------------------------------------------------------
//        int[] array = {18, 1, 0, 512, 0, 0, 0};
//        int count = 0;
//        for (int i = 0; i <= array.length - 1; i++) {
//            if (array[i] == 0) {
//                count++;
//            }
//            System.out.println(array[i]);
//        }
//        System.out.println("");
//        if (count != 0) {
//            System.out.println("Number of zeros: " + count);
//        } else {
//            System.out.println("There are no zeros in the array!");
//        }
//Task 5------------------------------------------------------
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter size of array: ");
//        int size = scanner.nextInt();
//        int[] array = new int[size];
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Enter element of array: ");
//            array[i] = scanner.nextInt();
//        }
//        System.out.println("");
//        int temp = 0;
//        for (int i = 0; i <= array.length - 1; i++) {
//            if (i <= array.length / 2) {
//                temp = array[i];
//                array[i] = array[array.length - 1 - i];
//                array[array.length - 1 - i] = temp;
//            }
//            System.out.println(array[i]);
//        }
//Task 6------------------------------------------------------
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter size of array: ");
//        int size = scanner.nextInt();
//        int[] array = new int[size];
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Enter element of array: ");
//            array[i] = scanner.nextInt();
//        }
//        System.out.println("");
//        boolean result = true;
//        for (int i = 0; i <= array.length - 1; i++) {
//            System.out.println(array[i]);
//        }
//        for (int i = 0; i <= array.length - 2; i++) {
//            if (array[i] > array[i + 1]) {
//                result = false;
//                break;
//            }
//        }
//        System.out.println("");
//        System.out.println(result);
//Task 7------------------------------------------------------
//        int[] array = {9, 9, 9};
//        int sum = 1;
//        int count = 0;
//        for (int i = 0; i <= array.length - 1; i++) {
//            if (array[i] == 9) {
//                count++;
//            }
//            sum += array[i] * (int) (Math.pow(10, array.length - 1 - i));
//            System.out.println(array[i]);
//        }
//        System.out.println(sum);
//        if (count == array.length) {
//            int size = count + 1;
//            int[] secondArray = new int[size];
//            for (int i = secondArray.length - 1; i >= 0; i--) {
//                secondArray[i] = sum % ((int) (Math.pow(10, 1))); //53.8
//                sum = sum / 10;
//            }
//            for (int i = 0; i <= secondArray.length - 1; i++) {
//                System.out.println(secondArray[i]);
//            }
//        } else {
//            for (int i = array.length - 1; i >= 0; i--) {
//                array[i] = sum % ((int) (Math.pow(10, 1))); //53.8
//                sum = sum / 10;
//            }
//            for (int i = 0; i <= array.length - 1; i++) {
//                System.out.println(array[i]);
//            }
//        }
    }
}