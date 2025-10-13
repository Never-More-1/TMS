package decorator;

class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + ", молоко";
    }

    public double getCost() {
        return coffee.getCost() + 30.0;
    }
}
