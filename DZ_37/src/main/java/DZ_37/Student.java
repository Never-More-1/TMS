package DZ_37;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope(BeanDefinition.SCOPE_SINGLETON)
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Component ("beanStudent")
public class Student {
    private String name = "Dima";
    private int age = 21;
    private Lectures lectures;

    @Autowired
    public Student(Lectures lectures){
        this.lectures = lectures;
    }
    @PostConstruct
    public void init() {
        System.out.println("Construct");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroy");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Lectures getLectures() {
        return lectures;
    }
}
