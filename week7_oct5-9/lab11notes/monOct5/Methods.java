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
        //or loop is not a palindrome
        if(palindrome(word)) {
            System.out.printf("%s is a palindrome%n", word)
        }


        
        int[] another = {1,4,17,25,36,37,45};
        System.out.print("Enter a number to search for: ");
        int num = s.nextInt();

        //print something like: 17 is at index 2
        //or 5 is not found
        int result = getIndex(another, num);
        System.out.println(result);
    }

    //write a method to compute the absolute value (int)
    public static int absVal(int num) {
        //-4, absVal is 4
        //5, absVal is 5

        if (num < 0) {
            return -1*num;
        }

        return num;
    }


    //write a method to return whether a String 
    //is a palindrome
    //spelled same forwards and backwards racecar
    public static boolean palindrome(String str) {
        int front = 0;
        int back = str.length()-1;

        while(front < back) {
            if (str.charAt(front) != str.charAt(back)) {
                return false;
            }
            
            front++;
            back--;
        }

        //must be a palindrome
        return true;
    }    


    //write a method to return position of 
    //an element in an array (of integers)
    //{3,2,4}, looking for 4, return 2

    public static int getIndex(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                return i;
            }
        }

        return -1;
    }
}