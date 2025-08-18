import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        Optional<Integer> sum = numbers.stream()
                .distinct()
                .filter(num -> num % 2 == 0)
                .reduce(Integer::sum);
        System.out.println(sum);
    }
}