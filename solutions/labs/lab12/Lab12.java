import java.util.*;

public class Lab12 {
    public static final int SIZE = 3;
    public static Scanner s;

    public static char[][] createBoard() {
        char[][] board = new char[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = '_';
            }
        }

        return board;
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%c ", board[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean isFull(char[][] board) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == '_') return false;
            }
        }

        return true;
    }

    public static int getMove(char turn, String type) {
        System.out.printf("%c, enter %s: ", turn, type);
        return s.nextInt();
    }

    public static boolean isValid(char[][] board, int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '_';
    }

    public static boolean isWinner(char[][] board, char turn) {
        for (int i = 0; i < 3; i++) {
            //did they win on a row?
            if (board[i][0] == board[i][1] && board[i][0] == board[i][2] && board[i][0] == turn) {
                return true;
            }

            //did they win on a column?
            if (board[0][i] == board[1][i] && board[0][i] == board[2][i] && board[0][i] == turn) {
                return true;
            }
        }

        //did they win on a / diagonal?
        if (board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] == turn) {
            return true;
        }

        //did they win on a \ diagonal?
        if (board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] == turn) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        s = new Scanner(System.in);
        char[][] board = createBoard();

        printBoard(board);

        //current turn
        char turn = 'X';

        //has someone won?
        boolean winner = false;

        while (!isFull(board)) {
            System.out.println();

            int row = getMove(turn, "row");
            int col = getMove(turn, "column");
            System.out.println();

            //validate the user input
            if (isValid(board, row, col)) {
                //put in their piece
                board[row][col] = turn;

                printBoard(board);

                //did they win?
                winner = isWinner(board, turn);
                if (winner) break;
                else {
                    //switch whose turn
                    if (turn == 'X') turn = 'O';
                    else turn = 'X';
                }
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