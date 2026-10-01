import java.util.*;

public class Numbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a list of numbers separated by commas: ");
        String line = s.nextLine();

        //like: 12,4,-3.2,5
        int start = 0;
        int index = 0;
        double sum = 0;
        do {
            index = line.indexOf(",", start);
            double num;
            if (index == -1) {
                num = Double.parseDouble(line.substring(start));
            }
            else {
                num = Double.parseDouble(line.substring(start,index));
            }
            sum += num;
            start = index+1;
        } while(index != -1);

        System.out.println("Sum is: " + sum);
        

        //don't use split

        //goal: print sum of numbers

    }
}