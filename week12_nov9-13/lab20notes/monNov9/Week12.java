import java.util.*;
import javax.swing.*;

public class Week12 {
    public static void main(String[] args) {
        //previous Circle example with resizeable array
        //make 10 circles, with random radius
        //from 2-10

        ResizeableArray r = new ResizeableArray();
        Random rand = new Random();
        for (int i = 0; i < r.size(); i++) {
            Circle c = (Circle) r.get(i);
            if (c.area() >= 5 && c.area() <= 10) {
                System.out.println(c);
            }
        }

        //change to use ArrayList
        //enhanced for loop


       //can we create an object of an interface type?

       //how can we use the interface type?

      //using message dialog, input dialog

    }
}