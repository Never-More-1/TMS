import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Figure figures[] = new Figure[5];
        figures[0] = new Triangle(3.14, 2.71, 6.02);
        figures[1] = new Triangle(9, 73, 5);
        figures[2] = new Rectangle(5, 8);
        figures[3] = new Circle(99);
        figures[4] = new Circle(1.3);


        double totalPerimeter = 0;
        for (Figure figure : figures) {
            totalPerimeter += figure.calculatePerimeter();
        }
        System.out.println("Сумма периметров: " + totalPerimeter);
    }
}