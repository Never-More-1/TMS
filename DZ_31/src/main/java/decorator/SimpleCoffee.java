package decorator;

class SimpleCoffee implements Coffee {
    public String getDescription() {
        return "Кофе";
    }

    public double getCost() {
        return 100.0;
    }
}
