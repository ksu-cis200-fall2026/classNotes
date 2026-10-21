public class Week9 {
    public static void main(String[] args) {
        //find area of circle with radius 2.5

        //first with "general" class/object
        Circle c1 = new Circle(2.5);
        System.out.printf("Area: %.2f%n", c1.area());
        System.out.println(c1);

        //--> how to get back the radius?
        System.out.printf("Radius: %.2f%n", c1.getRadius());


        //then with CircleStatic
        //find area of circle with radius 2.5
        System.out.printf("Area: %.2f%n", CircleStatic.area(2.5));


        //how to hold 5 circles?
        Circle[] shapes = new Circle[5];
        //null
        
        //how to make first circle have radius 4?
        shapes[0] = new Circle(4);
        shapes[1] = new Circle(3);
        shapes[2] = new Circle(14);
        shapes[3] = new Circle(2);
        shapes[4] = new Circle(0);

        for (int i = 0; i < shapes.length; i++) {
            System.out.printf("Area: %.2f%n", shapes[i].area());
        }
    }
}