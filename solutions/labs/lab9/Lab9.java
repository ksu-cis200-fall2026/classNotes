import java.util.*;
import java.io.*;

//Name reformatter

public class Lab9 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter text file name: ");
        String filename = s.nextLine();

        Scanner inFile = new Scanner(new File(filename));

        while (inFile.hasNext()) {
            String line = inFile.nextLine();

            String[] names = line.split("\\s+");
            StringBuilder build = new StringBuilder();

            if (names.length >= 3) {
                build.append(names[names.length-1]);
                build.append(", ");
                build.append(names[0]);
                build.append(" ");
                build.append(names[1].charAt(0));
                build.append(".");
            }
            else if (names.length == 2) {
                build.append(names[1]);
                build.append(", ");
                build.append(names[0]);
            }
            else if (names.length == 1) {
                build.append(names[0]);
            }
            System.out.println(build.toString());
        }

        inFile.close();
    }
}