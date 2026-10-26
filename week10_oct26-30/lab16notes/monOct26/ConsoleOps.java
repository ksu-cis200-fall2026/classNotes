import java.util.*;

//this could be the View of a bigger application

public class ConsoleOps {
    private Scanner s;

    public ConsoleOps() {
        s = new Scanner(System.in);
    }

    public int getInteger() {
        System.out.print("Enter an integer: ");
        return Integer.parseInt(s.nextLine());
    }

    public void displayError(String msg) {
        System.out.println("Error: " + msg);
    }

    public void printInteger(int num, String msg) {
        System.out.printf("%s: %d%n", msg, num);
    }
}