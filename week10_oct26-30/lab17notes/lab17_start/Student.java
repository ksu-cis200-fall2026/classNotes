//THIS CLASS IS FINISHED

public class Student {
	private String name;
	private String major;
	private double gpa;
	
	public Student(String n, String m, double g) {
		name = n;
		major = m;
		gpa = g;
	}

	public String getName() {
		return name;
	}

	public String getMajor() {
		return major;
	}

	public double getGPA() {
		return gpa;
	}

	public String toString() {
		return String.format("%s, %s, GPA: %.2f", name, major, gpa);
	}
}