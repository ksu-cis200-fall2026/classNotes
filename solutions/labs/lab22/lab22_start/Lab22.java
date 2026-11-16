import java.util.*;
import java.io.*;

public class Lab22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //YOU DO THIS
        //create a HashMap whose keys are student names and whose values are Student objects


        try {
            Scanner inFile = new Scanner(new File("studentInfo.txt"));
            while (inFile.hasNext()) {
                String line = inFile.nextLine();
                String[] tokens = line.split(": ");

                String name = tokens[0];
                double score = Double.parseDouble(tokens[1]);

                //YOU DO THIS
                //add the score to the Student object in your HashMap whose name matches name
                //(Hint: first check if you've seen this name before. How would you tell?)


            }

            inFile.close();
        }
        catch(IOException ioe) {
            System.out.println("Error reading input file");
        }

        //YOU DO THIS
        //Ask the user for a student name, and print their information
        //If the student isn't found, print an error instead



        //YOU DO THIS
        //Find the student with the highest average, and print their information


    }
}