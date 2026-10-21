public class Course {
	private Student[] roster;
	private int size;
	
	public Course(int capacity) {
		roster = new Student[capacity];
		size = 0;
	}
	
	public void addStudent(String name, String major, double gpa) {
		//YOU DO THIS
		//Create a Student object representing the parameter information
		Student s = new Student(name, major, gpa);

		//Add the Student to your roster array
		roster[size] = s;
		size++;

		//If the array is full, do nothing (don't add the student)
	}
	
	public void printStudentsWithMajor(String m) {
		//YOU DO THIS
		//Print the information (use toString()) for all students in the course whose
		//major matches the parameter

		//loop through the roster (Student array)
			//see if the current student has major m
				//print that student (using their toString)
	}
	
	public void printHonorRoll() {
		//YOU DO THIS
		//Print the information (use toString()) for all students in the course who are on the honor roll
		//(GPA at least 3.5)

		//loop through the array (up to size)
			//get roster[i]'s gpa, see if over 3.5
	}
}