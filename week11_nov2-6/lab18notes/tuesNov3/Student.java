//what should we do with Person?

public class Student extends Person {
    //want name, age, major, gpa
    private String major;
    private double gpa;

    public Student(String n, int a, String m, double g) {
        //calls Person constructor
        super(n, a);
        major = m;
        gpa = g;
    }

    public boolean honorRoll() {
        return gpa >= 3.5;
    }

    //what do we inherit? 
    //birthday, toString, getType

    //method overriding
    public String toString() {
        StringBuilder build = new StringBuilder();
        //we want the name, age, major, gpa
        //use super.toString to get the name and the age
        build.append(super.toString());
        build.append(String.format(" major: %s, gpa: %.2f", major, gpa));
        return build.toString();
    }

    //what do we want to change?
}