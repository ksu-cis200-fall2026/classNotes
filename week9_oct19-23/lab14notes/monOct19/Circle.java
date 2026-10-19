public class Circle {
    //what does a circle need?

    //fields
    private double radius;

    //constructor
    public Circle(double r) {
        radius = r;
    }

    //methods
    public double area() {
        return 3.14*radius*radius;
    }

    public double circumference() {
        return radius*2*3.14;
    }

    public void print() {
        System.out.printf("Radius %.2f, area %.2f%n", radius, area());
    }
}



