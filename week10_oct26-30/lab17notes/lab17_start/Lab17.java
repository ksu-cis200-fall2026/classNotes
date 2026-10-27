import java.util.*;
import java.io.*;

public class Lab17 {
	public static void main(String[] args) {
		//YOU DO THIS
		//Create Course and StudentView objects

		if (args.length != 1) {
			//YOU DO THIS
			//Call your printError method to display an error that the input file wasn't provided
			//Exit the program
		}

		//YOU DO THIS
		//Read the student input file (which is at args[0])
			//Use a try/catch block to TRY:
				//Connecting to the file
				//Reading each line
				//Getting a new Student object with the information on the current line (call readNextStudent)
				//Adding the new Student to your course
				//Closing the file when you are done
			//If any problems occur (i.e., you enter the catch block), call your printError method and exit the program
			//It is OK if you catch a general Exception here to cover different types of file problems

		//YOU DO THIS
		//Let the user pick a major
		//Display all students matching that major
		//Display all students on the honor roll

		
		//NOTE: this file should contain NO print statements or user input statements
	}

	//This method is finished
	//It will take comma-separated student information like "Bob Jones,CS,3.7"
	//And return a new Student object with that information
	private static Student readNextStudent(String line) {
		String[] pieces = line.split(",");

		return new Student(pieces[0], pieces[1], Double.parseDouble(pieces[2]));
	}
}