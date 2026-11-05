package Task3;

import java.util.Scanner;

public class Program {
    public static final VerticalParabola P =
            new VerticalParabola(-2, -5, 15.0 / 64);
    public static final Line L1 = new Line(-2, 3, -3.0 / 8);
    public static final Line L2 = new Line(-2, 3, 1.0 / 4);

    public static SimpleColor getColor(double x, double y) {
        if (P.isPointAboveParabola(x, y)
                || x < -2 && L1.isPointAboveLine(x, y)) {
            return SimpleColor.GRAY;
        }
        if (x < -2 && L2.isPointAboveLine(x, y)) {
            return SimpleColor.YELLOW;
        }
        return SimpleColor.BLUE;
    }

    public static void printColorForPoint(double x, double y) {
        System.out.printf("(%.1f, %.1f) -> %s%n",
                x, y, getColor(x, y));
    }

    public static void main(String[] args) {
        printColorForPoint(0, 0);
        printColorForPoint(-9, 4);
        printColorForPoint(0, -5);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input X: ");
        double x = scanner.nextDouble();
        System.out.print("Input Y: ");
        double y = scanner.nextDouble();
        printColorForPoint(x, y);
    }
}