package adapter;

public class Main {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rPeg = new RoundPeg(5);
        if (hole.fits(rPeg)) {
            System.out.println("Круглый колышек с радиусом " + rPeg.getRadius() + " подходит к круглому отверстию с радиусом " + hole.getRadius() + " .");
        }else {
            System.out.println("Радиус колышка слишком велик.");
        }
        SquarePeg sPeg = new SquarePeg(2);

        SquarePegAdapter sPegAdapter = new SquarePegAdapter(sPeg);
        if (hole.fits(sPegAdapter)) {
            System.out.println("Квадратный колышек с длинной стороны " + sPeg.getSide() + " подходит к круглому отверстию с радиусом " + hole.getRadius() + " .");
        }else {
            System.out.println("Длина стороны колышка слишком велика.");
        }
    }
}
