import java.util.*;

public class StudentView {
    private View view;

    public StudentView(View type) {
        view = type;
    }

    public void displayHonorRoll(ArrayList<Student> students) {
        StringBuilder build = new StringBuilder();
        
        build.append("\nHonor roll:\n");

        for (int i = 0; i < students.size(); i++) {
            Student cur = students.get(i);

            build.append(cur.toString() + "\n\n");
        }

        view.displayResult(build.toString());
    }

    public void displayWithMajor(ArrayList<Student> students, String major) {
        StringBuilder build = new StringBuilder();
        
        build.append(String.format("Students with major %s: %n", major));

        for (int i = 0; i < students.size(); i++) {
            Student cur = students.get(i);

            build.append(cur.toString() + "\n\n");
        }

        view.displayResult(build.toString());
    }

    public String getMajor() {
        return view.getInput("Enter major to search for: ");
    }

    public String getFilename() {
        return view.getInput("Enter student information filename: ");
    }

    public void displayError(String msg) {
        view.displayResult(msg);
    }
}