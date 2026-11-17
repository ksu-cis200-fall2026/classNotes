import java.util.*;
import java.io.*;

public class Lab22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //YOU DO THIS

        //create a HashMap whose keys are student names and whose values are Student objects
        HashMap<String, Student> map = new HashMap<String, Student>();

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

                Student match = map.get(name);
                if (match == null) {
                    match = new Student(name);
                    map.put(name, match);
                }
                match.addScore(score);
            }

            inFile.close();
        }
        catch(IOException ioe) {
            System.out.println("Error reading input file");
        }

        //YOU DO THIS
        //Ask the user for a student name, and print their information
        //If the student isn't found, print an error instead
        System.out.print("Enter a name: ");
        String str = s.nextLine();
        Student lookup = map.get(str);

        if (lookup != null) {
            System.out.println(lookup);
        }
        else {
            System.out.printf("%s not found%n", str);
        }
        System.out.println();

        //YOU DO THIS
        //Find the student with the highest average, and print their information

        Student high = null;
        double highAvg = 0;
        for (String curName : map.keySet()) {
            Student cur = map.get(curName);
            if (cur.getAverage() > highAvg) {
                high = cur;
                highAvg = cur.getAverage();
            }
        }
        System.out.printf("Highest scoring student: %s%n", high);
    }
}