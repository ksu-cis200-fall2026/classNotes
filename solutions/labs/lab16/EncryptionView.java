import java.util.*;

public class EncryptionView {
    private Scanner s;

    public EncryptionView() {
        s = new Scanner(System.in);
    }

    public String getMessage() {
        System.out.print("Enter message: ");
        return s.nextLine();
    }

    public int getKey() {
        System.out.print("Enter the key: ");
        return Integer.parseInt(s.nextLine());
    }

    public void printError() {
        System.out.println("Error: key should be an integer.");
    }

    public void printResult(String msg, String type) {
        System.out.printf("Result from %s: %s%n", type, msg);
    }
}