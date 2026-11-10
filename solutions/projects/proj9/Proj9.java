/**
 * Project 9 does operations on real, rational, and integer numbers
 * 
 * @author Julie THornton
 * @version Project 9
 */

import java.util.*;

public class Proj9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter an expression (press Enter to quit): ");
        String line = s.nextLine();
        while (line.length() != 0) {
            int plusIndex = line.indexOf("+");
            int minusIndex = line.indexOf("-");
            int timesIndex = line.indexOf("*");
            
            if (!goodInput(plusIndex, minusIndex, timesIndex)) {
                System.out.println("Error. Should be exactly one operator (+, -, or *).");
            }
            else {
                char op;
                String piece1, piece2;
                if (plusIndex != -1) {
                    op = '+';
                    piece1 = line.substring(0, plusIndex).trim();
                    piece2 = line.substring(plusIndex+1).trim();
                }
                else if (minusIndex != -1) {
                    op = '-';
                    piece1 = line.substring(0, minusIndex).trim();
                    piece2 = line.substring(minusIndex+1).trim();
                }
                else {
                    //must be a *
                    op = '*';
                    piece1 = line.substring(0, timesIndex).trim();
                    piece2 = line.substring(timesIndex+1).trim();
                }

                try {
                    RealNumber num1 = createNumber(piece1);
                    RealNumber num2 = createNumber(piece2);
                    RealNumber result = doOperation(num1, num2, op);

                    System.out.printf("%s %c %s = %s%n", num1, op, num2, result);
                }
                catch (NumberFormatException nfe) {
                    System.out.printf("Error. One of %s or %s is not a number.%n", piece1, piece2);
                }
                catch (ArithmeticException ex) {
                    System.out.println("Error - division by 0.");
                }
            }

            System.out.print("\nEnter an expression (press Enter to quit): ");
            line = s.nextLine();
        } 
    }

    /**
     * Determines whether exactly one of the parameters is not -1
     * 
     * @param index1 An index value
     * @param index2 An index value
     * @param index3 An index value
     * @return True if exactly one of index1/index2/index3 is not -1, and false otherwise
     */
    public static boolean goodInput(int index1, int index2, int index3) {
        return index1 != -1 && index2 == -1 && index3 == -1 ||
            index1 == -1 && index2 != -1 && index3 == -1 ||
            index1 == -1 && index2 == -1 && index3 != -1;
    }

    /**
     * Turns a string into a new RealNumber object
     * 
     * @param str The string representation of a number (real, rational, or integer)
     * @return The most specific type of RealNumber representing str
     */
    public static RealNumber createNumber(String str) {
        int decIndex = str.indexOf(".");
        int slashIndex = str.indexOf("/");

        if (decIndex >= 0) {
            double val = Double.parseDouble(str);
            return new RealNumber(val);
        }
        else if (slashIndex >= 0) {
            String numS = str.substring(0,slashIndex).trim();
            String denomS = str.substring(slashIndex+1).trim();

            return new RationalNumber(Integer.parseInt(numS), Integer.parseInt(denomS));
        }
        else {
            return new IntegerNumber(Integer.parseInt(str));
        }
    }

    /**
     * Performs an operation on two numbers
     * 
     * @param num1 The first number
     * @param num2 The second number
     * @param op The operator (+, -, or *)
     * @return The result of num1 op num2, in the most specific type possible
     */
    public static RealNumber doOperation(RealNumber num1, RealNumber num2, char op) {
        switch(op) {
            case '+':
                return num1.plus(num2);
            case '-':
                return num1.minus(num2);
            case '*':
                return num1.times(num2);
        }

        //or throw an exception?
        return null;
    }
}
