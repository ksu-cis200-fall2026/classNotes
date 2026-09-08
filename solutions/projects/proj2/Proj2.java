/**
 * Prints travel time based on trip distance and other constraints
 *
 * @author Julie Thornton
 * @version Project 2
 */

import java.util.*;

public class Proj2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //get distance
        System.out.print("Enter distance in miles: ");
        int miles = Integer.parseInt(s.nextLine());

        if (miles < 0) {
            System.out.println("Error: distance should be nonnegative");
            return;
        }

        //get speed factor
        System.out.print("Enter your speed factor, where 0 is slowest and 9 is fastest: ");
        int speed = Integer.parseInt(s.nextLine());

        if (speed < 0 || speed > 9) {
            System.out.println("Error: speed factor should be 0-9. Assuming speed factor of 5.");
            speed = 5;
        }

        //calculate mph based on speed factor
        //min 55, then speed*10 is the percent additional mph between 55 and 80
        double mph = 55 + ((speed/10.0) * 25);

        //ask if round trip
        System.out.print("Are you traveling round trip? (y/n) ");
        char round = (s.nextLine()).toLowerCase().charAt(0);

        if (round == 'y') {
            miles *= 2;
        }
        else if (round != 'n') {
            System.out.printf("Invalid input: %c. Assuming a one-way trip.%n", round);
        }

        //get max driving hours per day
        System.out.print("Enter max driving hours per day: ");
        int maxHrs = Integer.parseInt(s.nextLine());

        if (maxHrs <= 0 || maxHrs >= 24) {
            System.out.println("Error: max driving hours must be between 1-24. Assuming 8 max hours per day.\n");
            maxHrs = 8;
        }

        int maxSec = maxHrs*60*60;

        //calculate days, hours, minutes, seconds of trip
        int totalSec = (int)(miles/mph * 60 * 60);

        int days = totalSec/maxSec;
        totalSec = totalSec % maxSec;

        int hours = totalSec/(60*60);
        totalSec = totalSec % (60*60);

        int mins = totalSec/60;
        totalSec = totalSec % 60;

        int secs = totalSec;

        System.out.printf("%nTotal driving time for %d miles at %.2f mph: ", miles, mph);

        System.out.printf("%d day", days);
        if (days != 1) System.out.print("s");

        System.out.printf(", %d hour", hours);
        if (hours != 1) System.out.print("s");

        System.out.printf(", %d minute", mins);
        if (mins != 1) System.out.print("s");
        
        System.out.printf(", %d second", secs);
        if (secs != 1) System.out.print("s");
        System.out.println();
    }
}