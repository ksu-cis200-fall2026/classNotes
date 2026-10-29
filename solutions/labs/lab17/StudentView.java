import java.util.*;

public class StudentView {
    private Scanner s;

    public StudentView() {
        s = new Scanner(System.in);
    }

    public void printHonorRoll(ResizeableArray students) {
        System.out.println("\nHonor roll:");

        for (int i = 0; i < students.size(); i++) {
            Student cur = (Student) students.get(i);

            System.out.println(cur);
            System.out.println();
        }
    }

    public void printWithMajor(ResizeableArray students, String major) {
        System.out.printf("Students with major %s: %n", major);

        for (int i = 0; i < students.size(); i++) {
            Student cur = (Student) students.get(i);

            System.out.println(cur);
            System.out.println();
        }
    }

    public String getMajor() {
        System.out.print("Enter major to search for: ");
		return s.nextLine();
    }

    public void printError(String msg) {
        System.out.println(msg);
    }
}