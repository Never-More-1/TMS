public class Dog extends Animal {
    @Override
    void voice() {
        System.out.println("Гав!");
    }

    @Override
    void eat(String food) {
        if (food.equals("Meat")) {
            System.out.println("Я люблю есть мясо");
        } else {
            System.out.println("Я не люблю есть " + food);
        }
    }
}
