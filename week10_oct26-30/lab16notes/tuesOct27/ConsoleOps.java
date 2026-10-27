import java.util.*;

//view
public class ConsoleOps {
    private Scanner s;

    public ConsoleOps() {
        s = new Scanner(System.in);
    }

    public int getInteger() {
        System.out.print("Enter an integer: ");
        return Integer.parseInt(s.nextLine());
    }

    public void printInteger(int num, String msg) {
        System.out.printf("%s: %d%n", msg, num);
    }

    public void displayError(String msg) {
        System.out.printf("Error: %s%n", msg);
    }
}