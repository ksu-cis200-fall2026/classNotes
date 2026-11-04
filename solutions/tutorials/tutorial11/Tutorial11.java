import java.util.*;

public class Tutorial11 {
    public static void main(String[] args) {
        //Shape s = new Shape();

        //ArrayList<Type> name = new ArrayList<Type>();

        ArrayList<Shape> shapes = new ArrayList<Shape>();

        Circle c = new Circle(2.5);
        Rectangle r = new Rectangle(3.5,4.5);

        shapes.add(c);
        shapes.add(r);
        shapes.add(new Circle(5.5));
        shapes.add(new Rectangle(8,10));
        shapes.add(new Rectangle(1,3));

        for (int i = 0; i < shapes.size(); i++) {
            System.out.printf("%s area: %.2f%n", shapes.get(i).name(), shapes.get(i).area());
        }

        int[] nums = new int[5];
        //for each loop (enhanced for loop)
        //for (type name : collection)

        shapes.remove(0);
        System.out.println("After remove:");

        for (Shape s : shapes) {
            System.out.printf("%s area: %.2f%n", s.name(), s.area());
        }

        //if (str1.equals(str2))

        //if (arrayList.contains(item)) {

        //}

        if (shapes.contains(new Circle(5.5))) {
            System.out.println("found the circle");
        }

        //remove from ArrayList
        //type val = arrayListName.remove(index);


    }
}