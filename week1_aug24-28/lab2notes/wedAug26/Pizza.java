import java.util.*;

public class Pizza {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /*
        Example: pizzas have 8 slices. 
        Get #pizzas, #people. 

        Print how many slices everyone can have, 
        how many are leftover.

        Suppose pizzas are $12.99 each, print total.
        */

       System.out.print("Enter number of pizzas: ");
       int pizzas = s.nextInt();
       System.out.print("Enter number of people: ");
       int people = s.nextInt();

       //how many total slices there are
       int total = pizzas*8;
       int slices = total / people;
       int leftover = total % people;

       //Everyone gets ?? slices with ?? leftover
       System.out.printf("Everyone gets %d slices with %d leftover%n", slices, leftover);

       double price = pizzas*12.99;

       //Total: $25.98
       System.out.printf("Total: $%.2f%n", price);
    }
}