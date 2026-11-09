import java.util.*;

//needed for dialogs
import javax.swing.*;

public class Week12 {
    public static void main(String[] args) {
        //previous Circle example with resizeable array
        //make 10 circles, with random radius
        //from 2-10

        /*
        ArrayList<Circle> r = new ArrayList<Circle>();

        //we add circles with radius 2-10, even numbers
        for (int i = 2; i <= 10; i+=2) {
            Circle c = new Circle(i);
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

        //NO! Nameable is not a class, can't create an object
        //Nameable n = new Nameable();

        Nameable n = new Circle();
        String name = n.getName();
        */

        //can we create an object of an interface type?

        //how can we use the interface type?

        //using message dialog, input dialog

        //a message dialog
        JOptionPane.showMessageDialog(null, "Hello, world!");

        //an input dialog
        String name = JOptionPane.showInputDialog("Enter name: ");

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter age: "));
    }
}