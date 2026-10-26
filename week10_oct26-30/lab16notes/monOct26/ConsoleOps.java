import java.util.*;

public class ConsoleOps {
    private Scanner s;

    public ConsoleOps() {
        s = new Scanner(System.in);
    }

    public int getInteger() {
        System.out.print("Enter an integer: ");
        return s.nextInt();
    }

    public void printInteger(int num, String msg) {
        System.out.printf("%s: %d%n", msg, num);
    }
}