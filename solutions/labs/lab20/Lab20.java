import java.util.*;
import java.io.*;

public class Lab20 {
	public static void main(String[] args) {
		View type;
		
		if (args.length != 0 && args[0].equals("--dialog")) {
			type = new DialogView();
		}
		else {
			type = new ConsoleView();
		}
		
		Course c = new Course();
		StudentView v = new StudentView(type);

		String filename = v.getFilename();

		try {
			Scanner inFile = new Scanner(new File(filename));
			while (inFile.hasNext()) {
				Student s = readNextStudent(inFile.nextLine());
				c.addStudent(s);
			}
			inFile.close();
		}
		catch (Exception ex) {
			v.displayError("Error reading from input file");
			return;
		}
			
		String m = v.getMajor();
		v.displayWithMajor(c.getStudentsWithMajor(m), m);
		
		v.displayHonorRoll(c.getHonorRoll());
	}

	private static Student readNextStudent(String line) {
		String[] pieces = line.split(",");

		return new Student(pieces[0], pieces[1], Double.parseDouble(pieces[2]));
	}
}