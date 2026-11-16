import java.util.*;

public class Student {
    private String name;
    private ArrayList<Double> examScores;

    public Student(String n) {
        name = n;
        examScores = new ArrayList<Double>();
    }

    public void addScore(double s) {
        examScores.add(s);
    }

    public double getAverage() {
        double sum = 0;
        for (double d : examScores) {
            sum += d;
        }

        return sum/examScores.size();
    }

    public char getGrade() {
        double avg = getAverage();
        if (avg >= 90) return 'A';
        else if (avg >= 80) return 'B';
        else if (avg >= 70) return 'C';
        else if (avg >= 60) return 'D';
        else return 'F';
    }

    public String toString() {
        return String.format("%s, average: %.2f, grade: %c", name, getAverage(), getGrade());
    }
}