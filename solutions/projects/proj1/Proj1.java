/**
 * Prints hometown distance from Manhattan and age in a given year.
 *
 * @author Julie Thornton
 * @version Project 1
 */
import java.util.*;

public class Proj1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("My hometown is 130 miles away from Manhattan.");

        System.out.print("Enter a year: ");
        int year = s.nextInt();

        int age = year - 1982;
        System.out.printf("In %d I turned %d years old.%n", year, age);
    }
}
