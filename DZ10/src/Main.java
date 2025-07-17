import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Tom","Grand", 575);
        User user2 = new User("Tom","Grand", 575);
        User user3 = new User("Alex","Kent", 312);
        System.out.println(user1.equals(user2));
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user1.toString());
        System.out.println(user2.toString());
        System.out.println();
        System.out.println(user1.equals(user3));
        System.out.println(user1.hashCode());
        System.out.println(user3.hashCode());
        System.out.println(user1.toString());
        System.out.println(user3.toString());
    }
}