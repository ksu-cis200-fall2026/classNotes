import java.util.*;
public class Hangman {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = s.nextLine();

        char[] guessed = new char[word.length()];
        for (int i = 0; i < guessed.length; i++) {
            guessed[i] = '_';
        }

        int max = 6;
        boolean wordGuessed = false;
        while (max > 0 && !wordGuessed) {
            System.out.print("\nCurrent puzzle: ");
            for (int i = 0; i < guessed.length; i++) {
                System.out.printf("%c ", guessed[i]);
            }

            System.out.println("\nAttempts left: " + max);
            System.out.print("Enter a letter: ");
            char guess = s.nextLine().toLowerCase().charAt(0);
            max--;

            boolean correctGuess = false;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess && guessed[i] == '_') {
                    guessed[i] = guess;
                    correctGuess = true;
                }
            }

            if (!correctGuess) {
                System.out.println("Wrong guess!");
            } else {
                System.out.println("Correct guess!");
            }

            wordGuessed = true;
            for (int i = 0; i < guessed.length; i++) {
                if (guessed[i] == '_') {
                    wordGuessed = false;
                    break;
                }
            }
        }

        if (wordGuessed) {
            System.out.println("\nCongratulations! You guessed the word: " + word);
        } else {
            System.out.println("\nGame Over! The word was: " + word);
        }
    }
}