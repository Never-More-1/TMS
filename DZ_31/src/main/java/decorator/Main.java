package decorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        printInfo(coffee);

        Coffee milkCoffee = new MilkDecorator(new SimpleCoffee());
        printInfo(milkCoffee);

        Coffee milkSugarCoffee = new SugarDecorator(new MilkDecorator(new SimpleCoffee()));
        printInfo(milkSugarCoffee);

        Coffee allInOne = new SugarDecorator(new MilkDecorator(new SugarDecorator(new SimpleCoffee())));
        printInfo(allInOne);
    }

    static void printInfo(Coffee coffee) {
        System.out.println(coffee.getDescription() + " - " + coffee.getCost() + " руб.");
    }
}
//Декоратор — это структурный паттерн проектирования,
//который позволяет динамически добавлять объектам новую функциональность,
//оборачивая их в полезные «обёртки».