import java.util.*;
public class Hangman {
    //global variables
    public static Scanner s;

    public static char[] initializePuzzle(int len) {
        char[] guessed = new char[len];
        for (int i = 0; i < guessed.length; i++) {
            guessed[i] = '_';
        }

        return guessed;
    }

    public static void printPuzzle(char[] puzzle) {
        System.out.print("\nCurrent puzzle: ");
        for (int i = 0; i < puzzle.length; i++) {
            System.out.printf("%c ", puzzle[i]);
        }
    }

    public static boolean getGuess(String correct, char[] puzzle) {
        System.out.print("Enter a letter: ");
        char guess = s.nextLine().toLowerCase().charAt(0);

        boolean correctGuess = false;
        for (int i = 0; i < correct.length(); i++) {
            if (correct.charAt(i) == guess && puzzle[i] == '_') {
                puzzle[i] = guess;
                correctGuess = true;
            }
        } 

        return correctGuess;
    }

    public static boolean solved(char[] puzzle) {
        boolean wordGuessed = true;
        for (int i = 0; i < puzzle.length; i++) {
            if (puzzle[i] == '_') {
                wordGuessed = false;
                break;
            }
        }

        return wordGuessed;
    }

    public static void main(String[] args) {
        //initialize global variables
        s = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = s.nextLine();

        //initialize puzzle
        char[] guessed = initializePuzzle(word.length());

        int max = 6;
        boolean wordGuessed = false;
        while (max > 0 && !wordGuessed) {
            //printPuzzle
            printPuzzle(guessed);

            System.out.println("\nAttempts left: " + max);
            max--;

            //getGuess (and applying)
            boolean correctGuess = getGuess(word, guessed);

            if (!correctGuess) {
                System.out.println("Wrong guess!");
            } else {
                System.out.println("Correct guess!");
            }

            //solved
            wordGuessed = solved(guessed);
        }

        if (wordGuessed) {
            System.out.println("\nCongratulations! You guessed the word: " + word);
        } else {
            System.out.println("\nGame Over! The word was: " + word);
        }
    }
}