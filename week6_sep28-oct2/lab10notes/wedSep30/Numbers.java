import java.util.*;

public class Numbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a list of numbers separated by commas: ");
        String line = s.nextLine();

        //like: 12,4,-3.2,5

        //first use split
        /*
        String[] pieces = line.split(",");
        double sum = 0;
        for (int i = 0; i < pieces.length; i++) {
            sum += Double.parseDouble(pieces[i]);
        }
        System.out.println(sum);
        */

        //then don't

        //line is like: 12,4,-3.2,5
        //line is 13

        double sum = 0;
        int index = 0; //where to start looking for the comma
        boolean done = false;
        do {
            //grab the next piece
            int comma = line.indexOf(",", index);

            //did it find a comma?
            if (comma == -1) {
                //no more commas
                double num = Double.parseDouble(line.substring(index));
                sum += num;
                done = true;
            }
            else {
                double num = Double.parseDouble(line.substring(index, comma));
                sum += num;
            }
            index = comma+1;
        } while (done == false);

        System.out.println(sum);
    }
}