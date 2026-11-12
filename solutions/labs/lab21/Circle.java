public class Circle implements Shape {
    private double radius;
    public static final double PI = 3.14;

    public Circle(double r) {
        radius = r;
    }

    public double area() {
        return PI*radius*radius;
    }

    public double perimeter() {
        return 2*PI*radius;
    }

    public String name() {
        return "Circle";
    }

    public int compareTo(Shape s) {
        if (s instanceof Circle) {
            Circle c = (Circle) s;

            if (radius < c.radius) return -1;
            else if (radius > c.radius) return 1;
            else return 0;
        }
        else return name().compareTo(s.name());
    }
}