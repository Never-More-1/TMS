package springApp.model;

import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Component
public class User {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;
    private String age;
    private Timestamp created;
    private Timestamp updated;

    public  User (String username, String password, String firstName, String lastName) {
        this.name = firstName;
        this.age = lastName;
        this.created = new Timestamp(System.currentTimeMillis());
        this.updated = new Timestamp(System.currentTimeMillis());
    }

    public User(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String lastName) {
        this.age = lastName;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Timestamp getUpdated() {
        return updated;
    }

    public void setUpdated(Timestamp updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", lastName='" + age + '\'' +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}
