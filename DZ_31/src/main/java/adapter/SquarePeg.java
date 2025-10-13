package adapter;

public class SquarePeg {
    double side;
    public SquarePeg(double side) {
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    public double setSquare() {
        double result = side*side;
        return result;
    }

}
