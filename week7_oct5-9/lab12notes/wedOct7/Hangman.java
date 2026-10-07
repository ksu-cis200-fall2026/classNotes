import java.util.*;
public class Hangman {
    //global variable
    public static Scanner s;

    public static char[] initializePuzzle(int len) {
        char[] guessed = new char[len];
        for (int i = 0; i < guessed.length; i++) {
            guessed[i] = '_';
        }

        return guessed;
    }

    public static void printPuzzle(char[] guessed) {
        System.out.print("\nCurrent puzzle: ");
        for (int i = 0; i < guessed.length; i++) {
            System.out.printf("%c ", guessed[i]);
        }
    }

    //guessed is "_ _ A _"
    public static boolean getGuess(char[] guessed, String correct) {
        //ge t a guess
        System.out.print("Enter a letter: ");
        char guess = s.nextLine().toLowerCase().charAt(0);

        //fill it in
        //did I make progress?
        boolean correctGuess = false;
        for (int i = 0; i < correct.length(); i++) {
            if (correct.charAt(i) == guess && guessed[i] == '_') {
                guessed[i] = guess;
                correctGuess = true;
            }
        }

        return correctGuess;
    }

    public static boolean solved(char[] guessed) {
        for (int i = 0; i < guessed.length; i++) {
            if (guessed[i] == '_') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        //first thing, initialize global variables
        s = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = s.nextLine();

        //initial puzzle
        char[] guessed = initializePuzzle(word.length());

        int max = 6;
        boolean wordGuessed = false;
        while (max > 0 && !wordGuessed) {
            //print puzzle
            printPuzzle(guessed);

            //get a guess, plug it in
            System.out.println("\nAttempts left: " + max);
            boolean correctGuess = getGuess(guessed, word);
            max--;

            if (!correctGuess) {
                System.out.println("Wrong guess!");
            } else {
                System.out.println("Correct guess!");
            }

            //is it solved
            wordGuessed = solved(guessed);
        }

        if (wordGuessed) {
            System.out.println("\nCongratulations! You guessed the word: " + word);
        } else {
            System.out.println("\nGame Over! The word was: " + word);
        }
    }
}