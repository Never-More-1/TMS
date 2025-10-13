package decorator;

class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + ", сахар";
    }

    public double getCost() {
        return coffee.getCost() + 10.0;
    }
}