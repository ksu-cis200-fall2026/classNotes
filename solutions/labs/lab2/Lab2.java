import java.util.*;

public class Lab2 { 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of donuts needed: ");
        int donuts = s.nextInt();

        //we can assume that the input is a positive whole number
        int boxes = (donuts-1)/12 + 1;
    
        System.out.printf("Boxes needed: %d%n", boxes);

        int total = boxes*12;
        int leftover = total - donuts;

        System.out.printf("Total donuts: %d, %d of which aren't needed%n", total, leftover);
        System.out.println();

        double cost = boxes*11.99;
        System.out.printf("Subtotal: $%.2f%n", cost);

        //NOTE: The Mon/Wed section also did the tax and total cost calculations below:
        //This was removed for the Tues/Thurs section
        double tax = cost*0.0915;
        System.out.printf("Tax (9.15%%): $%.2f%n", tax);

        double owed = cost+tax;
        System.out.printf("Total purchase: $%.2f%n", owed);
    }
}