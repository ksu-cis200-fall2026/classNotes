import java.util.*;

public class Week10 {
    public static void main(String[] args) {
        //create ConsoleOps object
        ConsoleOps ops = new ConsoleOps();

        //get 5 numbers from user, print sum
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            //the line below might crash
            try {
                int num = ops.getInteger();
                sum += num;
            }
            catch(NumberFormatException ex) {
                ops.displayError("input should be an int");
            }
        }

        ops.printInteger(sum, "Sum is: ");

        //what could crash?

        //how to handle?
    }
}