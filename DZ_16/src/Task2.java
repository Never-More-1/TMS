import java.util.HashMap;

public class Task2 {
    public static void main(String[] args) {
        String[] pairs = {"ada", "bih", "cat", "ada", "dog"};
        HashMap<String, String> map = new HashMap();

        for (int i = 0; i < pairs.length; i++) {
            String str = pairs[i];
            String firstChar = String.valueOf(str.charAt(0));
            String lastChar = String.valueOf(str.charAt(str.length() - 1));
            map.put(firstChar, lastChar);
        }
        System.out.println(map);
    }
}
