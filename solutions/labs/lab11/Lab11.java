import java.util.*;
import java.io.*;

public class Lab11 {
    public static void main(String[] args) throws IOException {
        Scanner inFile = new Scanner(new File("lab11nums.txt"));

        //for each line of numbers in the file, 
            // print the sum and the range
        //afterwards, print the overall sum

        int lineNum = 1;
        int totalSum = 0;
        while (inFile.hasNext()) {
            String line = inFile.nextLine();
            int[] arr = toIntArray(line);
            int sum = getSum(arr);
            int range = getRange(arr);

            System.out.printf("Line %d: sum %d, range %d%n", lineNum, sum, range);
            totalSum += sum;
            lineNum++;
        }
        System.out.println();
        System.out.printf("Overall sum: %d%n", totalSum);

        inFile.close();
    }

    public static int[] toIntArray(String str) {
        String[] pieces = str.split("\\s+");

        int[] nums = new int[pieces.length];
        for (int i = 0; i < pieces.length; i++) {
            nums[i] = Integer.parseInt(pieces[i]);
        }

        return nums;
    }

    public static int getSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        return sum;
    }

    public static int getRange(int[] nums) {
        if (nums.length == 0) return 0;

        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }

        return max-min;
    }
}