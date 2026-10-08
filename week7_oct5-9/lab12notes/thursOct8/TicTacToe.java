import java.util.*;

public class TicTacToe {
    //global Scanner for user input

    //createBoard: create/return array filled with '_' characters
    //public static char[][] initializePuzzle()

    //printBoard: takes board, prints the current game configuration
    //public static void printPuzzle(char[][] puzzle)

    //isFull: takes board, returns whether the board is full
    //public static boolean isFull(char[][] board)

    //getRow: takes current (char) turn, returns the user's row selection for that player
    //public static int getRow(char turn)

    //getCol: takes current (char) turn, returns the user's col selection for that player
    //public static int getCol(char turn)

    //isWinner: takes board and turn as parameters, returns whether that player won
    //public static boolean isWinner(char[][] board, char turn)

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /*play text-based Tic-Tac-Toe, with board like:

        _ _ _
        _ _ _
        _ _ _

        */

        //create board
        char[][] board = new char[3][3];

        //board.length: # rows
        //board[i].length

        //outer loop through rows
            //inner loop through columns
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = '_';
            }
        }
            
        //print the board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.printf("%c ", board[i][j]);
            }
            System.out.println();
        }

        //current turn
        char turn = 'X';

        //has someone won?
        boolean winner = false;

        //9 potential moves
        //this will become looping while the board isn't full
        int moves = 0;
        while (moves < 9) {
            System.out.println();

            //ask the current user for a move (row/col)
            System.out.printf("%c, enter row: ", turn);
            int row = s.nextInt();
            System.out.printf("%c, enter column: ", turn);
            int col = s.nextInt();
            System.out.println();

            //validate the user input
            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '_') {
                //put in their piece
                board[row][col] = turn;

                //print the board
                for (int i = 0; i < board.length; i++) {
                    for (int j = 0; j < board[i].length; j++) {
                        System.out.printf("%c ", board[i][j]);
                    }
                    System.out.println();
                }

                //did they win?

                for (int i = 0; i < 3; i++) {
                    //did they win on a row?
                    if (board[i][0] == board[i][1] && board[i][0] == board[i][2] && board[i][0] == turn) {
                        winner = true;
                    }

                    //did they win on a column?
                    if (board[0][i] == board[1][i] && board[0][i] == board[2][i] && board[0][i] == turn) {
                        winner = true;
                    }
                }

                //did they win on a / diagonal?
                //board[0][2], board[1][1], board[2][0]

                //did they win on a \ diagonal?
                //board[0][0], board[1][1], board[2][2]

                //leave game play loop if someone one
                if (winner) break;

                //switch whose turn
                if (turn == 'X') turn = 'O';
                else turn = 'X';

                moves++;
            }
            else {
                //must have been a bad move
                System.out.println("Bad move, go again.");
            }
        }

        //did someone win?
        if (winner) {
            System.out.printf("%c wins!%n", turn);
        }
        else {
            System.out.println("Tie game");
        }
    }
}