import java.util.function.Consumer;
import java.util.function.Function;

public class Task4 {
    public static void main(String[] args) {
        final double COURSE = 0.297;
        Consumer<String> convertBYNToUSD = str -> {
            String[] sum = str.split(" ");
            double convert = Double.parseDouble(sum[0]) * COURSE;
            System.out.println(convert);
        };
        convertBYNToUSD.accept("1500 BYN");
    }
}
