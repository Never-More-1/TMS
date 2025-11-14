package DZ_37;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("DZ_37")
public class SpringStart {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringStart.class);
        Student student = (Student) context.getBean("beanStudent");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getLectures());
        Student student2 = (Student) context.getBean("beanStudent");
        System.out.println(student2.getName());
        System.out.println(student2.getAge());
        System.out.println(student2.getLectures());
        ((AnnotationConfigApplicationContext)context).close();
    }
//    @Bean
//    public Student beanStudent() {
//        Student student = new Student();
//        System.out.println(student);
//        return student;
//    }
}