import java.util.*;

public class ArrayPractice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /*
        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = 2*(i+1);
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        */

       int[] ages = new int[6];
       System.out.print("Enter ages: ");
       for (int i = 0; i < ages.length; i++) {
            ages[i] = s.nextInt();
       }

       System.out.println("Teenagers:");
       for (int i = 0; i < ages.length; i++) {
            if (ages[i] >= 13 && ages[i] < 20) {
                System.out.println(ages[i]);
            }
       }

        /*
            Get 6 ages from the user, all in a line.

            Print the ages that are teenagers
        */
    }
}