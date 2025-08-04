import java.util.ArrayList;

public class Student {
    String name;
    int group, course;
    ArrayList<Integer> grade;

    public Student(String name, int groupNum, int courseNum, ArrayList<Integer> marks) {
        this.name = name;
        this.group = groupNum;
        this.course = courseNum;
        this.grade = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", groupNum=" + group +
                ", courseNum=" + course +
                ", marks=" + grade +
                '}';
    }

    public static void nextCourse(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); ) {
            Student student = students.get(i);
            double average = student.getAverageMark();
            if (average < 3.0) {
                students.remove(i);
            } else {
                student.setCourse(student.getCourse() + 1);
                i++;
            }
        }
    }

    public static void printStudents(ArrayList<Student> students, int course) {
        System.out.println("Студенты " + course + " курса:");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public double getAverageMark() {
        if (grade == null || grade.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int i = 0; i < grade.toArray().length; i++) {
            sum += grade.get(i);
        }
        return (double) sum / grade.size();
    }

    public String getName() {
        return name;
    }

    public int getGroupNum() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int courseNum) {
        this.course = courseNum;
    }

    public ArrayList<Integer> getMarks() {
        return grade;
    }
}