/**
 * This is my project description.
 * 
 * @author Julie Thornton
 * @version Project 2
 */

import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //get user input number
        System.out.print("Enter a whole number: ");
        int num = s.nextInt();

        //validate
        if (num >= 1) {
            //find the factorial of the input number

            //what number we are ready to multiply on
            int cur = num;

            //the product so far
            int product = 1;

            while (cur >= 1) {
                product = product * cur;

                //step down to the next number
                cur--;
            }

            //print:
            //5! = 120
            System.out.printf("%d! = %d%n", num, product);
        }
        else {
            System.out.println("Please run again with a positive integer");
        }
        

        //5! = 5*4*3*2*1
        //1! = 1
        //how to add input validation?
    }
}