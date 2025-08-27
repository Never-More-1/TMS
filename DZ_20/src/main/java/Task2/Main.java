package Task2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int[] arrayForInsertion = {3, 4, 7, 4};
        int[] arrayForSelection = {0, 2, 9, 1, 5, 4, 67};
        int[] arrayForBubble = {3232, 14, 1111, 242};

        Thread bubbleThread = new Thread(new BubbleSort(arrayForBubble), "BubbleSort");
        Thread insertionThread = new Thread(new InsertionSort(arrayForInsertion), "InsertionSort");
        Thread selectionThread = new Thread(new SelectionSort(arrayForSelection), "SelectionSort");

        bubbleThread.start();
        insertionThread.start();
        selectionThread.start();

        bubbleThread.join();
        insertionThread.join();
        selectionThread.join();

        System.out.println("Сортировка пузырьком: " + Arrays.toString(arrayForBubble));
        System.out.println("Сортировка вставками: " + Arrays.toString(arrayForInsertion));
        System.out.println("Сортировка выбором:   " + Arrays.toString(arrayForSelection));

    }
}
