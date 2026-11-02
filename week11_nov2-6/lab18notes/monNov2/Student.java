//what should we do with Person?

public class Student  {
    //want name, age, major, gpa
    private String name;
    private int age;
    private String major;
    private double gpa;

    public Student(String n, int a, String m, double g) {
        name = n;
        age = a;
        major = m;
        gpa = g;
    }

    public boolean honorRoll() {
        return gpa >= 3.5;
    }

    //what do we inherit? 

    //what do we want to change?
}