import java.util.*;

public class DiceGame {
    public static void main(String[] args) {
        //this is the dice game from lab 5

        //start a max score

        //how could we modify it to have a max score, have them go again?

        Scanner s = new Scanner(System.in);
        Random r = new Random();
        do {
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

            //see if total should be a new max score

            //print end of game stuff
            if (total >= 20) {
                System.out.printf("\nFinal score: %d points. You win!%n", total);
            }
            else {
                System.out.printf("\nFinal score: %d points. You lose.%n", total);
            }

            //ask if they wanted to go again
 
        } while (they want to keep going);
    }
}