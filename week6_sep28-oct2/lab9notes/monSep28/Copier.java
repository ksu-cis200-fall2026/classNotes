import java.util.*;
import java.io.*;

public class Copier {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        //ask user for name of file
        System.out.print("Enter name of input file: ");
        String input = s.nextLine();

        //connect to the input file
        Scanner inFile = new Scanner(new File(input));

        //connect to the output file
        PrintWriter outFile = new PrintWriter("copy_" + input);

        //read every line from input
            //write it to the output

        while (inFile.hasNext()) {
            //read a line
            String line = inFile.nextLine();
            //print it out
            outFile.println(line);
        }

        outFile.close();
        inFile.close();

        //"copy_test.txt"
        //create output file named copy_origName
        //that is a duplicate of original file

    }
}