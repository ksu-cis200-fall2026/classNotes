import java.util.*;

public class Lab8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //get how many rows and columns
        System.out.print("Enter number of rows: ");
        int rows = s.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = s.nextInt();

        int[][] grid = new int[rows][cols];

        //read rest of input buffer
        s.nextLine();

        int nextNum = 1;
        System.out.println("Original array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = nextNum;
                nextNum++;
                System.out.printf("%d\t", grid[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        char input;
        do {
            System.out.print("Press 'a' to left-shift rows, or press 'q' to quit: ");
            input = (s.nextLine().toLowerCase()).charAt(0);

            if (input == 'a') {
                //left shift
                for (int i = 0; i < rows; i++) {
                    int temp = grid[i][0];
                    for (int j = 0; j < cols-1; j++) {
                        grid[i][j] = grid[i][j+1];
                    }
                    grid[i][cols-1] = temp;
                }

                System.out.println("Updated array: ");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        System.out.printf("%d\t", grid[i][j]);
                    }
                    System.out.println();
                }
                System.out.println();
            }
            else if (input != 'q') {
                System.out.println("Error: invalid input");
            }
        } while (input != 'q');
    }
}