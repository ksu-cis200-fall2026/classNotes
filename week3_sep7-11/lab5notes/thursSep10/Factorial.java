/**
 * Project 2 finds ....
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

        //validate input
        if (num >= 1) {
            //find the factorial of the input number

            int product = 1;
            for (int cur = num; cur >= 1; cur--) {
                product = product*cur;
            }

            //5! = 5*4*3*2*1
            //print: 5! = 120
            System.out.printf("%d! = %d%n", num, product);
        }
        else {
            System.out.println("Error - input must be a positive whole number");
        }
    }
}