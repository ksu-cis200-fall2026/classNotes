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

    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle c = (Circle) obj;

            if (radius == c.radius) return true;
            else return false;
        }
        else {
            return false;
        }
    }
}