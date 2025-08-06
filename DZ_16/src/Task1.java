import java.util.HashMap;

public class Task1 {
    public static void main(String[] args) {
        String[] wordMultiple = {"a", "b", "c", "a", "d"};
        HashMap<String, Boolean> map = new HashMap();

        for (String word : wordMultiple) {
            if (map.containsKey(word)) {
                map.replace(word, true);
            } else {
                map.put(word, false);
            }
        }
        System.out.println(map);
    }
}
