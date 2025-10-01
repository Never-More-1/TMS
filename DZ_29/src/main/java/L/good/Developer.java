package L.good;

public class Developer extends Teacher{
    void eat() {
        System.out.println("Я могу есть!");
    }

    void think() {
        System.out.println("Я могу думать!");
    }

    void teach() {
        System.out.println("Я могу учить!");
    }

    void writeCode() {
        System.out.println("Я могу писать код!");
    }
}
//Этот код соответствует принципу  подстановки Барбары Лисков, т.к. дочерние классы могут выполнять
//функционал родительских классов.