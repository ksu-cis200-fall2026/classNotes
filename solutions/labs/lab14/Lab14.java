import java.util.*;

public class Lab14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Point p1 = new Point(-2, 7);

        System.out.print("Enter x-coordinate: ");
        double x = s.nextDouble();
        System.out.print("Enter y-coordinate: ");
        double y = s.nextDouble();

        Point p2 = new Point(x, y);

        System.out.println("\nBoth points:");
        p1.print();
        p2.print();

        Point mid = p1.midpoint(p2);

        System.out.println("\nMidpoint:");
        mid.print();

        System.out.println();
        System.out.printf("Quadrant for first point: %d%n", p1.quadrant());
        System.out.printf("Quadrant for second point: %d%n", p2.quadrant());
        System.out.printf("Quadrant for midpoint: %d%n", mid.quadrant());
    }
}