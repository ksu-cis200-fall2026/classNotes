import java.util.*;

public class ConsoleView implements View {
    private Scanner s;

    public ConsoleView() {
        s = new Scanner(System.in);
    }

    public String getInput(String prompt) {
        System.out.print(prompt);
        return s.nextLine();
    }

    public void displayResult(String result) {
        System.out.println(result);
    }
}