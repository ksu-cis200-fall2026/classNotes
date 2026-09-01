import java.util.*;

public class Chips {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of bags of chips: ");
        int chips = s.nextInt();

        //input validation
        //is chips a good input?
        if (chips > 0 && chips <= 10) {
            //am I buying an even number of bags?
            double price;
            if (chips % 2 == 0) {
                price = (chips/2) * 5.99;
            }
            else {
                //chips is odd
                price = (chips/2) * 5.99 + 5.99;
            }

            //Total price: $11.98
            System.out.printf("Total price: $%.2f%n", price);
        }
        else {
            //bad input
            System.out.println("Invalid - can buy between 1-10 bags");
        }

        //2 bags - $5.99
        //3 bags - $5.99 for the first two plus $5.99 for the third
        //4 bags - $5.99 for the first two, $5.99 for the second two
        //5 bags $5.99 for the first two, $5.99 for the second two, plus $5.99 for the last

        

        /*
            bags of chips are buy one get one free at the store.
            Full price is $5.99 each.

            Customers are limited to 10 bags total.

            (is there any other input that would be invalid?)
        */

    }
}