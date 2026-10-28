import java.util.*;

public class Week10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ResizeableArray arr = new ResizeableArray();

        double rad;
        do {
            System.out.print("Enter radius (0 or negative to quit): ");
             rad = s.nextDouble();
            if (rad > 0) {
                Circle c = new Circle(rad);
                arr.add(c);
            }
        } while(rad > 0);

        for (int i = 0; i < arr.size(); i++) {
            Circle cir = (Circle) arr.get(i);
            if (cir.area() >= 5 && cir.area() <= 10) {
                System.out.println(cir);
            }
        }


        /*
            Make ResizeableArray of Circles
            User enters info for as many as they want
            They enter radius of 0 to quit

            Afterward, print the ones that have an area between 5-10
        */
    }
}