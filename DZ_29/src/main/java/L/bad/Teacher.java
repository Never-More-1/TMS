package L.bad;

public class Teacher extends Developer {
    void eat() {
        System.out.println("Я могу есть!");
    }

    void think() {
        System.out.println("Я могу думать!");
    }

    String writeCodeOnJava() {
        return null;
    }

    void teach() {
        System.out.println("Я могу учить!");
    }
}
//Этот код не соответствует принципу  подстановки Барбары Лисков, т.к. мы переписываем метод
//из родительского класса(возвращаем null).
//Класс-потомок должен производить такие же операции, как и класс-родитель.