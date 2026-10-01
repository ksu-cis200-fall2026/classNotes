import java.util.*;
import java.io.*;

public class Lab10 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter name of HTML file: ");
        String htmlFile = s.nextLine();
        System.out.print("Enter name of output file: ");
        String resultFile = s.nextLine();

        Scanner inFile = new Scanner(new File(htmlFile));
        PrintWriter outFile = new PrintWriter(resultFile);

        while (inFile.hasNext()) {
            String line = inFile.nextLine();

            //This assumes image elements are not split across multiple lines
            //Assumes there is only one image element per line
            //Assumes "src=" doesn't have any spaces around the =
            
            int index = line.indexOf("<img");

            if (index >= 0) {
                index = line.indexOf("src=", index);
                int openQuote = line.indexOf("\"", index+1);
                int closeQuote = line.indexOf("\"", openQuote+1);

                if (index >= 0 && openQuote >= 0 && closeQuote >= 0) {
                    String img = line.substring(openQuote+1, closeQuote);
                    outFile.println(img);
                }
            }
        }

        inFile.close();
        outFile.close();
    }
}