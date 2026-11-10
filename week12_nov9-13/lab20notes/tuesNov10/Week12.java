import java.util.*;
import javax.swing.*;

public class Week12 {
    public static void main(String[] args) {
        //previous Circle example with resizeable array
        //make 10 circles, with random radius
        //from 2-10
        /*
        Random rand = new Random();
        ArrayList<Circle> r = new ArrayList<Circle>();
        for (int i = 0; i < 10; i++) {
            int radius = r.nextInt(8)+2;
            Circle c = new Circle(radius);
            r.add(c);
        }

        for (int i = 0; i < r.size(); i++) {
            Circle c = r.get(i);
            if (c.area() >= 5 && c.area() <= 10) {
                System.out.println(c);
            }
        }



        //change to use ArrayList
        //enhanced for loop

        for (Circle c : r) {
            if (c.area() >= 5 && c.area() <= 10) {
                System.out.println(c);
            }
        }

        //can we create an object of an interface type?
        //NO! Nameable is not a class, can't create a new object
        //Nameable n = new Nameable();

        Nameable n = new Circle(4.2);
        System.out.println(n.getName());
        */

        //how can we use the interface type?

        //using message dialog, input dialog
        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, "Hello " + name);
    }
}