import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Дмитрий", 250701, 3, new ArrayList<>(List.of(3, 5, 4))));
        students.add(new Student("Артем", 250702, 3, new ArrayList<>(List.of(3, 2, 2))));
        students.add(new Student("Ольга", 250701, 2, new ArrayList<>(List.of(5, 5, 5))));

        System.out.println();
        System.out.println("Список студентов до проверки среднего балла:");

        for (int i = 0; i < students.toArray().length; i++) {
            System.out.println(students.get(i));
        }

        Student.nextCourse(students);

        System.out.println();
        System.out.println("Список студентов после проверки среднего балла:");

        for (int i = 0; i < students.toArray().length; i++) {
            System.out.println(students.get(i));
        }

        System.out.println();
        Student.printStudents(students, 3);
    }
}
