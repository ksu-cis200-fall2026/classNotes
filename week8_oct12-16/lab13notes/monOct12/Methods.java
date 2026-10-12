import java.util.*;

public class Methods {
    public static void main(String[] args) {
        //command-line args: word number
        //java Methods name age

        if (args.length == 2) {
            //print 1st letter of name
            System.out.printf("First letter: %c%n", args[0].charAt(0));
            //print one more than age
            System.out.printf("One more than age: %d%n", Integer.parseInt(args[1]) + 1);

        }
        else {
            System.out.println("Error. Run as: java Methods name age");
        }

        
        //print error if one or both not provided
    }
}