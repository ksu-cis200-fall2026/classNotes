import java.util.*;
import java.io.*;

public class Copier {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        //ask user for name of file
        System.out.print("Enter name of input file: ");
        String input = s.nextLine();

        //connect to input file
        Scanner inFile = new Scanner(new File(input));
        PrintWriter outFile = new PrintWriter("copy_" + input);

        while (inFile.hasNext()) {
            String line = inFile.nextLine();
            outFile.println(line);
        }

        outFile.close();
        inFile.close();
        //create output file named copy_origName
        //that is a duplicate of original file

    }
}