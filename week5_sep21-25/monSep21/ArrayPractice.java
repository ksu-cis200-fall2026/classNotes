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

       int[] vals = new int[6];
       System.out.print("Enter 6 numbers: ");
       for (int i = 0; i < vals.length; i++) {
            vals[i] = s.nextInt();
       }

       System.out.println("Reversed:");
       for (int i = vals.length-1; i >= 0; i--) {
            System.out.println(vals[i]);
       }

        /*
            Get 6 numbers from the user, all in a line.

            Print them in reverse.
        */
    }
}