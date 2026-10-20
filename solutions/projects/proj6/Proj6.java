/**
 * Project 6 plays a text-based Wordle game with game statistics
 * 
 * @author Julie Thornton
 * @version Project 6
 */

//got list of allowed guesses, puzzle words from https://github.com/Kinkelin/WordleCompetition/tree/main

import java.util.*;
import java.io.*;

public class Proj6 {
    public static Scanner s;
    public static Random r;
    public static final String PUZZLE_FILE = "puzzles.txt";
    public static final String ALLOWED_FILE = "allowed.txt";
    public static final String STATS_FILE = "stats.txt";

    /**
     * Prints the Wordle game introduction
     */
    public static void printIntro() {
        System.out.println("Welcome to text-based Wordle! You get 6 tries to guess a five-letter word.");
        System.out.println("Each guess must be a valid English word.");
        System.out.println("After each guess, you will get feedback for each letter in your guess:");
        System.out.println("\t\"G\" means that letter appears at that position in the correct word.");
        System.out.println("\t\"Y\" means that letter appears at a different position in the correct word.");
        System.out.println("\t\"B\" means that letter does not appear in the correct word.");
        System.out.println();
    }

    /**
     * Reads the words from a given input file
     * 
     * @param filename The name of the words file (first line: number of words in the file)
     * @return An array with all the words from the given file
     */
    public static String[] readWords(String filename) throws IOException {
        Scanner reader = new Scanner(new File(filename));

        String[] words = new String[Integer.parseInt(reader.nextLine())];
        for (int i = 0; i < words.length; i++) {
            words[i] = reader.nextLine();
        }
        reader.close();

        return words;
    }

    /**
     * Determines whether a word is in a given array
     * 
     * @param words An array of words to search
     * @param str A word to look for
     * @return Whether str is in words
     */
    public static boolean inList(String[] words, String str) {
        for (int i = 0 ; i < words.length; i++) {
            if (str.equals(words[i])) return true;
        }

        return false;
    }

    /**
     * Gets a new Wordle puzzle, either from the user (if cheat mode is selected)
     * or a random puzzle from the given array
     * 
     * @param words An array of potential puzzle words
     * @return A puzzle entered by the user, if the user selected cheat mode and entered a word in the words array.
     *      Otherwise, returns a random word from the words array.
     */
    public static String getPuzzle(String[] words) {
        int puzzleNumber = r.nextInt(words.length);
        String correct =  words[puzzleNumber];

        System.out.print("Do you want to enter \"cheat mode\", where you enter the correct word ahead of time? (y/n) ");
        char mode = (s.nextLine().toLowerCase()).charAt(0);
        if (mode == 'y') {
            System.out.print("Enter the correct word: ");
            String input = s.nextLine().toLowerCase();

            if (!inList(words, input)) {
                System.out.printf("%s is not a valid puzzle word. %n%n", input);
                System.out.printf("Your correct word will be %s instead.%n%n", correct);
            }
            else {
                correct = input;
            }
        }

        return correct;
    }

    /**
     * Gets a new guess from the user
     * 
     * @param list1 The first array of allowable guess words
     * @param list2 The second array of allowable guess words
     * @param count Which number guess this is
     * @return The guess entered by the user, if it was found in either list1 or list2
     *      Otherwise, returns "".
     */
    public static String getGuess(String[] list1, String[] list2, int count) {
        System.out.printf("Enter guess #%d: ", count+1);
        String guess = s.nextLine().toLowerCase();

        if (!inList(list1, guess) && !inList(list2, guess)) {
            System.out.printf("%s is not a valid word%n%n", guess);
            guess = "";
        }

        return guess;
    }

    /**
     * Creates a string with all the characters in the parameter with a " " inserted between each character
     * 
     * @param guess A word
     * @return A new string containing all characters in guess with a " " inserted between each of its letters
     */
    public static String buildSpaced(String guess) {
        //build spaced word
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < guess.length(); i++) {
            build.append(guess.charAt(i) + " ");
        }
        return build.toString();
    }

    /**
     * Prints Wordle feedback (G/Y/B) for each letter in a user's guess. A G means that 
     * guess letter appears at exactly that position in the correct word. A Y means that
     * guess letter appears at a different position in the correct word. A B means that guess
     * letter does not appear in the correct word.
     * 
     * @param guess The user's guess
     * @param correct The correct puzzle word
     */
    public static void printFeedback(String guess, String correct) {
        char[] feedback = new char[guess.length()];
        boolean[] used = new boolean[guess.length()];
        String spaced = buildSpaced(guess);

        //find the correct letter/correct spot (G), mark that spot as used
        for (int i = 0; i < guess.length(); i++) {
            if (guess.charAt(i) == correct.charAt(i)) {
                feedback[i] = 'G';
                used[i] = true;
            }
        }

        //now go back and find the correct letters/wrong spots (Y)
        //if guess has x occurrences of the letter and correct has y occurrences, and x > y, only
        //the first y occurrences in guess should get marked as Y (or G)
        for (int i = 0; i < guess.length(); i++) {
            if (feedback[i] == 'G') continue;

            boolean matched = false;
            for (int j = 0; j < correct.length(); j++) {
                if (guess.charAt(i) == correct.charAt(j) && !used[j]) {
                    //only possible if i != j

                    matched = true;

                    //prevents us from matching the same correct letter against a different (duplicate)
                    //letter in guess
                    used[j] = true;
                    break;
                }
            }

            if (matched) feedback[i] = 'Y';
            else feedback[i] = 'B';
        }

        System.out.println("Feedback: ");
        System.out.println("\t" + buildSpaced(guess));
        
        System.out.print("\t");
        for (int i = 0; i < feedback.length; i++) {
            System.out.print(feedback[i] + " ");
        }
        System.out.println("\n");
    }

    /**
     * Prints the end of game information for Wordle
     * 
     * @param correct The correct puzzle word
     * @param count The number of guesses (1-6) it took the user to correctly guess the word.
     *      If the user did not guess the word within 6 guesses, count will be 7.
     */
    public static void printEndGame(String correct, int count) {
        if (count < 6) {
            System.out.printf("Correct, the answer is %s. It took you %d guesses.%n", correct, count);
        }
        else {
            System.out.printf("You are out of guesses. The answer was %s.%n", correct);
        }
    }

    /**
     * Gets a menu option from the user (p = play, s = statistics, q = quit)
     * 
     * @return A menu option from the user
     */
    public static char getOption() {
        System.out.print("Enter (p)lay, (s)tatistics, or (q)uit: ");
        return s.nextLine().toLowerCase().charAt(0);
    }

    /**
     * Plays a new Wordle game
     * 
     * @param puzzles An array of possible puzzle words
     * @param allowed An array of possible guess words (that are not also puzzle words)
     * @return The number of guesses needed for the user to guess the puzzle word for the game
     *      (1-6 means the user won the game, and 7 means the user lost the game.)
     */
    public static int playGame(String[] puzzles, String[] allowed) {
        String correct = getPuzzle(puzzles);
        System.out.println();

        int numGuesses = 0;
        while (numGuesses < 6) {
            String guess = getGuess(puzzles, allowed, numGuesses);
            if (guess.length() > 0) {
                printFeedback(guess, correct);
                numGuesses++;
                if (guess.equals(correct)) {
                    break;
                }
                else if (numGuesses == 6) {
                    //marker for losing game
                    numGuesses = 7;
                }
            }
        }

        printEndGame(correct, numGuesses);

        return numGuesses;
    }

    /**
     * Gets the player's history from an input file
     * 
     * @return A size-2 array whose first element is the number of games the user has played
     *      and whose second element is how many of those games the user won
     */
    public static int[] getHistory() throws IOException {
        File f = new File(STATS_FILE);
        int games, wins;
        if (!f.exists()) {
            //create history file
            PrintWriter writer = new PrintWriter(STATS_FILE);
            writer.close();

            f = new File(STATS_FILE);
            games = 0;
            wins = 0;
        }
        else {
            Scanner reader = new Scanner(f);
            games = reader.nextInt();
            wins = reader.nextInt();
            reader.close();
        }

        return new int[]{games, wins};
    }

    /**
     * Prints the game statistics for the player
     * 
     * @param games How many games the user has played (historically and across the run of this program)
     * @param wins How many of those games the user won
     */
    public static void printStats(int games, int wins) {
        double perc = ((double)wins)/games;
        System.out.printf("%nYou have won %d out of %d games. Your winning percentage is %.2f%%%n%n", wins, games, perc);
    }

    /**
     * Updates the player statistics file to reflect the current number of games and wins
     * 
     * @param games The most up-to-date count of how many overall games the user has played
     *      (historically and across the run of this program)
     * @param wins How many of those games the user won
     */
    public static void updateHistory(int games, int wins) throws IOException {
        PrintWriter writer = new PrintWriter(STATS_FILE);
        writer.println(games + " " + wins);
        writer.close();
    }

    /**
     * Controls the flow of the program by repeatedly letting the user play a new Wordle game,
     * print winning statistics, or quit
     */
    public static void main(String[] args) throws IOException {
        s = new Scanner(System.in);
        r = new Random();
        
        printIntro();

        String[] allowed = readWords(ALLOWED_FILE);
        String[] puzzles = readWords(PUZZLE_FILE);
        int[] stats = getHistory();
        int games = stats[0];
        int wins = stats[1];

        char option;
        do {
            option = getOption();
            switch(option) {
                case 'p':
                    int score = playGame(puzzles, allowed);
                    if (score <= 6) wins++;
                    
                    games++;
                    break;
                case 's':
                    printStats(games, wins);
                    break;
                case 'q': 
                    updateHistory(games, wins);
                    break;
                default:
                    System.out.printf("%c is an invalid menu option.%n", option);
            }
        } while (option != 'q');
    }
}