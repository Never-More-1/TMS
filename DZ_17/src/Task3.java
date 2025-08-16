import java.util.function.Function;

public class Task3 {
    public static void main(String[] args) {
        final double COURSE = 0.297;
        Function<String, Double> convertBYNToUSD = str -> {
            String[] sum = str.split(" ");
            double convert = Double.parseDouble(sum[0]) * COURSE;
            return convert;
        };
        System.out.println(convertBYNToUSD.apply("1500 BYN"));
    }
}
