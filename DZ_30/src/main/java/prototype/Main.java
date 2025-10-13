package prototype;

public class Main {
    public static void main(String[] args) {
        Car audiPrototype = new AudiCar("Q7");
        Car ladaPrototype = new LadaCar("Vesta");

        Car clonedAudiCar = audiPrototype.clone();
        Car clonedLadaCar = ladaPrototype.clone();

        System.out.println("Audi " + clonedAudiCar.getName());
        System.out.println("Lada " + clonedLadaCar.getName());
    }
}
//Прототип — это порождающий паттерн,
//который позволяет копировать объекты любой сложности без привязки к их конкретным классам.