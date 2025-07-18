import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //task1-----------------------------------------------------------------------------------------------------------
//        Scanner scanner = new Scanner(System.in);
//        String str1 = scanner.next();
//        int maxLength = str1.length();
//        String maxStr = str1;
//        int minLength = str1.length();
//        String minStr = str1;
//        for (int i = 0; i < 2; i++) {
//            String str = scanner.next();
//            if (str.length() > maxLength) {
//                maxLength = str.length();
//                maxStr = str;
//            } else if (str.length() < minLength) {
//                minLength = str.length();
//                minStr = str;
//            }
//
//        }
//        System.out.println("Самая длинная строка: " + maxStr + ". Её длинна: " + maxLength);
//        System.out.println("Самая короткая строка: " + maxStr + ". Её длинна: " + maxLength);
//task2-----------------------------------------------------------------------------------------------------------
//        Scanner scanner = new Scanner(System.in);
//        String[] arr = new String[3];
//        for (int i = 0; i < 3; i++) {
//            String str = scanner.nextLine();
//            arr[i] = str;
//        }
//        System.out.print("Неотсортированный массив: ");
//        for (String s: arr) {
//            System.out.print(s + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if (arr[j].length() > arr[j + 1].length()) {
//                    String temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        System.out.print("Отсортированный массив: ");
//        for (String s: arr) {
//            System.out.print(s + " ");
//        }
//task3-----------------------------------------------------------------------------------------------------------
//        Scanner scanner = new Scanner(System.in);
//        String[] arr = new String[3];
//        int size = 0;
//        for (int i = 0; i < 3; i++) {
//            String str = scanner.nextLine();
//            size += str.length();
//            arr[i] = str;
//        }
//        int averageSize = size/3;
//        System.out.println("Средняя длина: " + averageSize);
//        System.out.print("Строки с длинной меньше средней: ");
//        for (int i = 0; i < 3; i++) {
//            if (arr[i].length() < averageSize){
//                System.out.print(arr[i] + " длина " + arr[i].length());
//            }
//        }
//task4-----------------------------------------------------------------------------------------------------------
//        Scanner scanner = new Scanner(System.in);
//        int size = 3;
//        String[] strArray = new String[size];
//
//        for (int i = 0; i < size; i++) {
//            strArray[i] = scanner.next();
//        }
//
//        for (int i = 0; i < size; i++) {
//            String currentStr = strArray[i];
//            boolean hasDuplicate = false;
//            for (int j = 0; j < currentStr.length(); j++) {
//                for (int k = j + 1; k < currentStr.length(); k++) {
//                    if (currentStr.charAt(j) == currentStr.charAt(k)) {
//                        hasDuplicate = true;
//                        break;
//                    }
//                }
//                if (hasDuplicate) break;
//            }
//            if (!hasDuplicate) {
//                System.out.println(currentStr + " has all unique characters");
//            }
//        }
//task5-----------------------------------------------------------------------------------------------------------
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        StringBuilder output = new StringBuilder();
//
//        for (int i = 0; i < input.length(); i++) {
//            char currentChar = input.charAt(i);
//            output.append(currentChar).append(currentChar);
//        }
//
//        System.out.println(output.toString());
//task6-----------------------------------------------------------------------------------------------------------
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] strArray = input.replaceAll("[!.,?:()]", "").toLowerCase().split(" ");
        System.out.print("Введите номер слова в предложении: ");
        int index = scanner.nextInt();
        System.out.println();
        if (index > strArray.length) {
            System.out.println("Ошибка!!! Количество слов в предложении: " + strArray.length + ". Введите другой номер слова в предложении");
            return;
        }
        String word = strArray[index - 1];
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                System.out.println("Слово не является палиндромом :(");
                return;
            }
            left++;
            right--;
        }
        System.out.println("Слово является палиндромом :)");
    }
}