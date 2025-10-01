package L.bad;

public class Developer extends Person{
    void eat() {
        System.out.println("Я могу есть!");
    }

    void think() {
        System.out.println("Я могу думать!");
    }

    public String writeCode() {
        return "Я могу писать код!";
    }
}
