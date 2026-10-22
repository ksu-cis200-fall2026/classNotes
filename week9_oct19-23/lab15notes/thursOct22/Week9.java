public class Week9 {
    public static void main(String[] args) {
        //find area of circle with radius 2.5
        Circle c = new Circle(2.5);
        System.out.printf("Radius: %.2f%n", c.getRadius());
        System.out.printf("Area: %.2f%n", c.area());

        //first with "general" class/object

        //then with CircleStatic
        System.out.printf("Area: %.2f%n", CircleStatic.area(2.5));

        //how to hold 5 circles?
        Circle[] shapes = new Circle[5];

        //"null" is a special value for objects
        //like 0. It means there is no object there.
        
        //make circles with radius 1-5
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = new Circle(i+1);
        }

        for (int i = 0; i < shapes.length; i++) {
            System.out.printf("%.2f%n", shapes[i].area());
            System.out.println(shapes[i]);
        }
    }
}