import javax.swing.*;

public class DialogView implements View {
    public String getInput(String prompt) {
         return JOptionPane.showInputDialog(prompt);
    }

    public void displayResult(String result) {
        JOptionPane.showMessageDialog(null, result);
    }
}