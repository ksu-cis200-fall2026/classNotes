import java.util.*;

public class Lab21 {
    public static void main(String[] args) {
        //Shape s = new Shape();

        //ArrayList<Type> name = new ArrayList<Type>();

        TreeSet<Shape> shapes = new TreeSet<Shape>();

        Circle c = new Circle(2.5);
        Rectangle r = new Rectangle(3.5,4.5);

        shapes.add(c);
        shapes.add(r);
        shapes.add(new Circle(5.5));
        shapes.add(new Rectangle(8,10));
        shapes.add(new RightTriangle(4,2));
        shapes.add(new Rectangle(1,3));
        shapes.add(new Square(2));
        shapes.add(new RightTriangle(2,5));

        for (Shape s : shapes) {
            System.out.printf("%s area: %.2f%n", s.name(), s.area());
        }


    }
}