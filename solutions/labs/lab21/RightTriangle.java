public class RightTriangle implements Shape {
    private double base;
    private double height;

    public RightTriangle(double b, double h) {
        base = b;
        height = h;
    }

    public double area() {
        return base*height/2;
    }

    public double perimeter() {
        double hyp = Math.sqrt(base*base + height*height);

        return base + height + hyp;
    }

    public String name() {
        return "Right Triangle";
    }

    public int compareTo(Shape s) {
        if (s instanceof RightTriangle) {
            RightTriangle r = (RightTriangle) s;

            if (base < r.base) return -1;
            else if (base > r.base) return 1;
            else return 0;
        }
        else return name().compareTo(s.name());
    }
}