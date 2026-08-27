import java.util.*;

public class Pizza {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of pizzas: ");
        int pizzas = s.nextInt();

        System.out.print("Enter number of people: ");
        int people = s.nextInt();

        int totalSlices = pizzas*8;
        int slicesEach = totalSlices/people;
        int leftover = totalSlices % people;

        double cost = pizzas*12.99;

        //Everyone gets xx slices with xx leftover
        //Cost: $x.xx

        System.out.printf("Everyone gets %d with %d leftover%n", slicesEach, leftover);
        System.out.printf("Cost: $%.2f%n", cost);

        /*
            Example: pizzas have 8 slices. 
            Get #pizzas, #people. 

            Print how many slices everyone can have, 
            how many are leftover.

            Suppose pizzas are $12.99 each, print total
        */
    }
}