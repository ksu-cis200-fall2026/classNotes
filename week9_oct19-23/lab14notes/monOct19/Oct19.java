import java.util.*;

public class Oct19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //radius 3.5 circle
        //create a NEW OBJECT
        Circle c = new Circle(3.5);

        //print its area
        System.out.printf("Area: %.2f%n", c.area());

        //radius 4 circle
        Circle c2 = new Circle(4);

        //print its area
        System.out.printf("Area: %.2f%n", c2.area());

        //update references
        c = c2;
        System.out.printf("Area: %.2f%n", c.area());

        //fraction 1/2
        Fraction f1 = new Fraction(1, 2);

        //fraction 2/3
        Fraction f2 = new Fraction(2, 3);

        //add them together
        Fraction result = f1.plus(f2);
        result.print();
    }
}