import java.util.*;

public class Week10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //make a ResizeableArray that can hold circles
        ResizeableArray arr = new ResizeableArray();

        double rad;
        do {
            System.out.print("Enter radius: ");
            rad = s.nextDouble();
            if (rad > 0) {
                //make a circle, store it in ResizeableArray
                Circle c = new Circle(rad);
                arr.add(c);
            }
        } while (rad > 0);

        /*
            print the circles that have an area between 10-20
        */
       for (int i = 0; i < arr.size(); i++) {
            Circle cur = (Circle) arr.get(i);
            if (cur.area() >= 10 && cur.area() <= 20) {
                System.out.println(cur);
            }
       }

    }
}