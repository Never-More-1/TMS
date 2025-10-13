package singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance("if i'm not change, that's great)");
        Singleton singleton2 = Singleton.getInstance("if i'm change, that's awful(");
        System.out.println(singleton1.value);
        System.out.println(singleton2.value);
    }
}
//Одиночка — это порождающий паттерн проектирования, который гарантирует,
//что у класса есть только один экземпляр, и предоставляет к нему глобальную точку доступа.