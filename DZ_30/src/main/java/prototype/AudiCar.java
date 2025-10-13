package prototype;

public class AudiCar implements Car {
    private String name;

    public AudiCar(String name) {
        this.name = name;
    }

    public Car clone() {
        return new AudiCar(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
