import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Map<Integer, String> employee = new HashMap<>();
        employee.put(1, "George");
        employee.put(9, "Dima");
        employee.put(4, "Sergey");
        employee.put(13, "Anna");
        employee.put(5, "Valeria");
        employee.put(8, "Kate");
        employee.put(2, "Hana");
        employee.put(16, "Maria");
        employee.put(7, "Roman");
        employee.put(12, "Nikita");
        employee.put(10, "Fedor");
        Set<Integer> allowedId = Set.of(1, 2, 5, 8, 9, 13);
        List<String> result = employee.entrySet().stream()
                .filter(worker -> allowedId.contains(worker.getKey()) && worker.getValue().length() % 2 != 0)
                .map(name -> new StringBuilder(name.getValue()).reverse().toString())
                .toList();
        System.out.println(result);
    }
}
