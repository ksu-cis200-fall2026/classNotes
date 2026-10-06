import java.util.*;

public class Methods {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] arr = {-3,5,-2,7,17,5};

        //update each array element to be its own absolute value
        for (int i = 0; i < arr.length; i++) {
            arr[i] = absVal(arr[i]);
        }


        System.out.print("Enter a word: ");
        String word = s.nextLine();

        //print something like: madam is a palindrome
        
        int[] another = {1,4,17,25,36,37,45};
        System.out.print("Enter a number to search for: ");
        int num = s.nextInt();

        //print something like: 17 is at index 2
        //or 5 is not found

        int result = getPos(another, num);
        if (result >= 0) {
            System.out.printf("%d is at index %d%n", num, result);
        }
        else {
            System.out.printf("%d is not found %n", num);
        }
    }

    //write a method to compute the absolute value (int)
    public static int absVal(int num) {
        //goal: find absolute value of num
        //-5, should be 5
        //4, should be 4

        if (num < 0) {
            return num*-1;
        }
        else {
            return num;
        }
    }


    //write a method to return whether a String 
    //is a palindrome
    //spelled same forwards and backwards racecar


    //write a method to return position of 
    //an element in an array (of integers)
    //{3,2,4}, looking for 4, return 2
    public static int getPos(int[] nums, int val) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                return i;
            }
        }

        //I didn't find it
        return -1;
    }

}