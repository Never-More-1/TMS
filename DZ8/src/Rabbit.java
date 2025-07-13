public class Rabbit extends Animal {
    @Override
    void voice() {
        System.out.println("Пищит!");
    }

    @Override
    void eat(String food) {
        if (food.equals("Grass")) {
            System.out.println("Я люблю есть травку");
        } else {
            System.out.println("Я не люблю есть " + food);
        }
    }
}
