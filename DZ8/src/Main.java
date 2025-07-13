public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal tiger = new Tiger();
        Animal rabbit = new Rabbit();
        dog.voice();
        tiger.voice();
        rabbit.voice();
        dog.eat("Grass");
        tiger.eat("Meat");
        rabbit.eat("Grass");
    }
}