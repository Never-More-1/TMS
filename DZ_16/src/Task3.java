import java.util.ArrayDeque;

public class Task3 {
    public static void main(String[] args) {
        ArrayDeque<String> stack = new ArrayDeque<>();
        String[] skobki = {"(", "[", "]", ")", "{"};

        boolean isBalanced = true;

        for (String bracket : skobki) {
            if (bracket.equals("(") || bracket.equals("[") || bracket.equals("{")) {
                stack.push(bracket);
            } else {
                String lastOpen = stack.pop();
                if (!(lastOpen.equals("(") && bracket.equals(")") || lastOpen.equals("[") && bracket.equals("]") || lastOpen.equals("{") && bracket.equals("}"))) {
                    isBalanced = false;
                    break;
                }
            }
        }

        if (!stack.isEmpty()) {
            isBalanced = false;
        }

        if (isBalanced) {
            System.out.println("Скобки сбалансированы");
        } else {
            System.out.println("Скобки несбалансированы");
        }
    }
}