import java.util.*;
import java.io.*;

public class Lab17 {
	public static void main(String[] args) {
		StudentView v = new StudentView();

		if (args.length != 1) {
			v.printError("Run as: java Lab7 studentFilename");
			return;
		}

		Course c = new Course();

		try {
			Scanner inFile = new Scanner(new File(args[0]));
			while (inFile.hasNext()) {
				Student s = readNextStudent(inFile.nextLine());
				c.addStudent(s);
			}
			inFile.close();
		}
		catch (Exception ex) {
			v.printError("Error reading from input file");
			return;
		}

			
		String m = v.getMajor();
		v.printWithMajor(c.getStudentsWithMajor(m), m);
		
		v.printHonorRoll(c.getHonorRoll());
	}

	private static Student readNextStudent(String line) {
		String[] pieces = line.split(",");

		return new Student(pieces[0], pieces[1], Double.parseDouble(pieces[2]));
	}
}