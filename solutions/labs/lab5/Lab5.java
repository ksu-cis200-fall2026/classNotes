import java.util.*;

public class Lab5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        int total = 0;
        do {
            //roll a dice
            int roll = r.nextInt(6) + 1;
            System.out.printf("You rolled %d%n", roll);

            //did they roll a 1?
            if (roll == 1) {
                total = 0;
                break;
            }
            else {
                total = total + roll;
            }

            //if they still haven't won, do they want to go again?
            if (total < 20) {
                System.out.printf("Game total: %d points%n", total);
                System.out.print("\nPress Enter to roll again: ");
                s.nextLine();
            }
        } while (total < 20);

        //print end of game stuff
        if (total >= 20) {
            System.out.printf("\nFinal score: %d points. You win!%n", total);
        }
        else {
            System.out.printf("\nFinal score: %d points. You lose.%n", total);
        }
    }
}