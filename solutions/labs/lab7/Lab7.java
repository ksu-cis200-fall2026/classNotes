import java.util.*;

public class Lab7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] arr = new int[10];
        int pos = 0;

        System.out.println("Enter a list of up to 10 temperatures separated by spaces, terminating with -1: ");

        for (int i = 0; i < arr.length; i++) {
            int num = s.nextInt();

            if (num == -1) break;

            arr[pos] = num;
            pos++;
        }

        System.out.println("\nHere are the temperatures that were below freezing (32 degrees):");
        for (int i = 0; i < pos; i++) {
            if (arr[i] < 32) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.println();

        //this could be combined with an earlier loop for efficiency
        double sum = 0;
        int count = 0;
        for (int i = 0; i < pos; i++) {
            if (arr[i] >= 32) {
                sum += arr[i];
                count++;
            }
        }

        double avg = sum/count;
        System.out.printf("The average temperature at or above freezing was %.2f degrees%n", avg);
    }
}