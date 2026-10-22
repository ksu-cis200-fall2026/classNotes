import java.util.*;

public class Lab15 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		//YOU DO THIS
		//Create a Course object that can hold 10 students
		Course c = new Course(10);
		
		//Loop to ask the user for information for 6 students
			//for each one, get the name, major, and gpa
			//add each student to the Course object

		for (int i = 0; i < 6; i++) {
			System.out.print("Enter name: ");
			String name = s.nextLine();
			System.out.print("Enter major: ");
			String major = s.nextLine();
			System.out.print("Enter GPA: ");

			//if use nextDouble, will need to do a s.nextLine() afterwards to clear the input buffer
			double gpa = Double.parseDouble(s.nextLine());

			System.out.println();
			c.addStudent(name, major, gpa);
		}
			
		//Ask the user to enter a major
		System.out.print("Enter major to search for: ");
		//Print all students with that major (use your Course object)
		String m = s.nextLine();
		c.printStudentsWithMajor(m);
		
		//Print all students on the honor roll (use your Course object)
		System.out.println("\nHonor roll:");
		c.printHonorRoll();

	}
}