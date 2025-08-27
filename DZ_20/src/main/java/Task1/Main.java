package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        if (size == 0){
            System.out.println("Размер массива не может быть равен нулю!");
            return;
        }
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Введите " + (i + 1) + " элемент: ");
            int element = scanner.nextInt();
            array[i] = element;
        }

        MinNumber minNumber = new MinNumber(array);
        MaxNumber maxNumber = new MaxNumber(array);

        minNumber.start();
        maxNumber.start();
        minNumber.join();
        maxNumber.join();

        System.out.println("Минимальный элемент: " + minNumber.getResult());
        System.out.println("Максимальный элемент: " + maxNumber.getResult());
    }
}
