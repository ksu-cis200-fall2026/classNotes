/**
 * Project 4 calculates statistics based on a given set of temperatures
 * 
 * @author Julie Thornton
 * @version Project 4
 */

import java.util.*;

public class Proj4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.print("Enter starting date (m/d/y): ");
        String start = s.nextLine();

        String[] pieces = start.split("/");
        int[] startDate = new int[pieces.length];
        for (int i = 0; i < pieces.length; i++) {
            startDate[i] = Integer.parseInt(pieces[i]);
        }

        //handle leap year
        if (startDate[2] % 4 == 0 && (startDate[2] % 100 != 0 || startDate[2] % 400 == 0)) {
            daysInMonth[1] = 29;
        }

        int curDay = startDate[1];
        int curMonth = startDate[0];
        int curYear = startDate[2];

        if (curMonth < 1 || curMonth > 12) {
            System.out.printf("Error: %d is an invalid month number. Please run again with a valid date.%n", curMonth);
            return;
        }
        if (curDay < 1 || curDay > daysInMonth[curMonth-1]) {
            System.out.printf("Error: %d is an invalid day number for month %d. Please run again with a valid date.%n", curDay, curMonth);
            return;
        }

        //could enforce other requirements if wanted
        if (curYear < 0) {
            System.out.printf("Error: %d is an invalid year. Please run again with a year value between 1850-2100.%n", curYear);
            return;
        }

        System.out.print("Enter time span in days: ");
        int days = Integer.parseInt(s.nextLine());

        if (days < 2 || days > 10) {
            System.out.println("Error: invalid time span. Please rerun with a time span between 2-10.");
        }
        
        String[] dates = new String[days];
        for (int i = 0; i < days; i++) {
            dates[i] = curMonth + "/" + curDay + "/" + curYear;

            if (curDay == daysInMonth[curMonth-1]) {
                if (curMonth == 12) {
                    curYear++;
                    curMonth = 1;
                }
                else {
                    curMonth++;
                }
                curDay = 1;
            }
            else {
                curDay++;
            }
        }

        int[] lows = new int[days];
        int[] highs = new int[days];

        System.out.printf("Enter low temperature readings from %s to %s, separated by spaces: ", dates[0], dates[days-1]);
        for (int i = 0; i < days; i++) {
            lows[i] = s.nextInt();
        }

        boolean outOfOrder = false;
        System.out.printf("Enter high temperature readings from %s to %s, separated by spaces: ", dates[0], dates[days-1]);
		for (int i = 0; i < days; i++) {
			highs[i] = s.nextInt();

            if (highs[i] < lows[i]) {
                outOfOrder = true;
            }
		}

        System.out.println();
        if (outOfOrder) {
            System.out.println("Error: at least one date had a high reading less than its low reading.");
            System.out.println("The high and low inputs for these dates have been swapped.");
        }
        System.out.println("Summary:");
        for (int i = 0; i < days; i++) {
            if (highs[i] < lows[i]) {
                int temp = highs[i];
                highs[i] = lows[i];
                lows[i] = temp;
            }
            System.out.printf("%s. High: %d degrees, low: %d degrees%n", dates[i], highs[i], lows[i]);
        }

        //this portion could be done as part of the summary to be more efficient
        int maxRangeIndex = 0;
        int minRangeIndex = 0;
        int biggestSwing = 0;
        int swingLow = 0;
        int swingHigh = 0;
        int swing = 0;
        for (int i = 0; i < days; i++) {
            if (highs[i] - lows[i] > highs[maxRangeIndex] - lows[maxRangeIndex]) {
                maxRangeIndex = i;
            }

            if (highs[i] - lows[i] < highs[minRangeIndex] - lows[minRangeIndex]) {
                minRangeIndex = i;
            }

            if (i > 0) {
                if (highs[i-1] - lows[i] > swing) {
                    swingLow = i;
                    swingHigh = i-1;
                    swing = highs[i-1] - lows[i];
                }
                if (highs[i] - lows[i-1] > swing) {
                    swingLow = i-1;
                    swingHigh = i;
                    swing = highs[i] - lows[i-1];
                }
            }
        }

        System.out.println();
        System.out.printf("Date with biggest temperature range: %s, from %d to %d degrees (range of %d degrees)%n", dates[maxRangeIndex], lows[maxRangeIndex], highs[maxRangeIndex], highs[maxRangeIndex]-lows[maxRangeIndex]);
        System.out.printf("Date with smallest temperature range: %s, from %d to %d degrees (range of %d degrees)%n", dates[minRangeIndex], lows[minRangeIndex], highs[minRangeIndex], highs[minRangeIndex]-lows[minRangeIndex]);
        
        if (swingLow > swingHigh) {
            System.out.printf("Biggest temperature swing: %d degrees, from %d degrees on %s to %d degrees on %s%n", swing, highs[swingHigh], dates[swingHigh], lows[swingLow], dates[swingLow]);
        }
        else {
            System.out.printf("Biggest temperature swing: %d degrees, from %d degrees on %s to %d degrees on %s%n", swing, lows[swingLow], dates[swingLow], highs[swingHigh], dates[swingHigh]);
        }
    }
}