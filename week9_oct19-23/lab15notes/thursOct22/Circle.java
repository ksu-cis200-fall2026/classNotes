public class Circle {
    //fields
    private double radius;

    //constructor
    public Circle(double r) {
        radius = r;
    }

    //add "getter" method for field
    public double getRadius() {
        return radius;
    }

    //operations (circumference, area)
    public double circumference() {
        return 2*3.14*radius;
    }

    public double area() {
        return 3.14*radius*radius;
    }

    public String toString() {
        return "Circle, radius " + radius;
    }
}