import java.util.*;

public class Week10 {
    public static void main(String[] args) {
        //controller
        //call back and forth between model and view

        //Create a ConsoleOps object
        ConsoleOps ops = new ConsoleOps();

        //Create an Adder object
        Adder add = new Adder();

        //get 5 numbers from user
        for (int i = 0; i < 5; i++) {
            try {
                int val = ops.getInteger();
                add.addNumber(val);
            }
            catch(NumberFormatException ex) {
                ops.displayError("input not a number");
            }
        }

        //print sum
        int result = add.getSum();
        ops.printInteger(result, "The sum is: ");

        //what could crash?

        //how to handle?
    }
}