public class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double len, double wid) {
        length = len;
        width = wid;
    }

    public double area() {
        return length*width;
    }

    public double perimeter() {
        return 2*length + 2*width;
    }

    public String name() {
        return "Rectangle";
    }
}