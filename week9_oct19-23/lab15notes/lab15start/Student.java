public class Student {
	private String name;
	private String major;
	private double gpa;
	
	//YOU DO THIS
	//Write a constructor that takes information for each field and initializes them
	public Student(String n, String m, double g) {
		name = n;
		major = m;
		gpa = g;
	}

	//YOU DO THIS
	//Write "getter" methods for each field
	//still need major, GPA

	public String getName() {
		return name;
	}

	public String toString() {
		//YOU DO THIS
		//Return a string representation for this student of the form:
		//John Doe, Computer Science, GPA: 3.85

		//delete below line when done
		return "";
	}
}