package springApp.model;

import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
public class User {
    private int id;
    private String name;
    private int age;
    private LocalDateTime created;
    private LocalDateTime updated;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.created = LocalDateTime.now();
        this.updated = LocalDateTime.now();
    }

    public User() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}