import java.util.Objects;

public class User implements Cloneable{
    private final String name;
    private final String surname;
    private final int id;

    User(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name ='" + name + '\'' +
                ", surname ='" + surname + '\'' +
                ", id= " + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(name, user.name) && Objects.equals(surname, user.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, id);
    }

}
