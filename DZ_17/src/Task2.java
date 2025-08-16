import java.util.function.Predicate;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = {1, 0, -7, 9, -9};

        Predicate<Integer> isPositive = num -> num >= 0;
        for (int num : numbers) {
            if (isPositive.test(num)) System.out.print(" " + num);
        }
    }
}