//what should we do with Person?

public class Student extends Person {
    //want name, age, major, gpa
    private String major;
    private double gpa;

    public Student(String n, int a, String m, double g) {
        //the first line must be a call to "super"
        //which is the parent constructor
        super(n, a);
        major = m;
        gpa = g;
    }

    public boolean honorRoll() {
        return gpa >= 3.5;
    }

    //what do we inherit? 
    //birthday, toString, getType

    //what do we want to change?
    //override getType
    public String getType() {
        return "Student";
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(super.toString());
        result.append(String.format("major: %s, gpa: %.2f", major, gpa));
        return result.toString();
    }
}