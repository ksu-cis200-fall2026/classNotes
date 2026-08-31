import java.util.*;

public class Chips {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter how many bags of chips: ");
        int chips = s.nextInt();

        //validate the input
        if (chips <= 10 && chips > 0) {
            //put my price calculation
            double price;
            if (chips % 2 == 0) {
                //chips is even
                price = chips * (5.99/2);
            }
            else {
                //chips is odd
                price = (chips/2)*5.99 + 5.99;
            }
            //Total price: $11.98
            System.out.printf("Total price: $%.2f%n", price);
        }
        else {
            System.out.println("Error: chips should be between 0-10");
        }

        //if buying even number, pair them all up
        //otherwise, pair up the even portion plus full price for the extra

        
        /*
            bags of chips are buy one get one free at the store.
            Full price is $5.99 each.

            Customers are limited to 10 bags total.

            (is there any other input that would be invalid?)
        */

    }
}