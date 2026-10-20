public class Circle {
    //fields
    //visibility type name;
    private double radius;

    //constructor takes information for all the fields
    public Circle(double r) {
        //initialize my fields
        radius = r;
    }

    //methods
    public double area() {
        return 3.14*radius*radius;
    }

    public double circumference() {
        return 2*3.14*radius;
    }
}

//what does a circle need?


