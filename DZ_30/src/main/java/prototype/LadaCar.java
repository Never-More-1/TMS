package prototype;

public class LadaCar implements Car {
    private String name;

    public LadaCar(String name) {
        this.name = name;
    }

    public Car clone() {
        return new LadaCar(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
