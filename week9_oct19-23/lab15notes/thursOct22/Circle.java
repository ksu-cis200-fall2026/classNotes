public class Circle {
    //fields
    private double radius;

    //constructor
    public Circle(double r) {
        radius = r;
    }

    //operations (circumference, area)
    public double circumference() {
        return 2*3.14*radius;
    }

    public double area() {
        return 3.14*radius*radius;
    }
}