import java.util.*;

public class Grid {
    public static void main(String[] args) {
        //7 rows, 3 columns
        double[][] grid = new double[7][3];

        //outer loop through rows
            //inner loop through cols

        for (int i = 0; i < grid.length; i++) {
            double cur = i+1;
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = cur;
                cur+=0.1;
            }
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.printf("%.2f ", grid[i][j]);
            }
            System.out.println();
        }

        /*
            Create a 7x3 array of doubles.

            Initialize first row to be: 1.0, 1.1, 1.2
            Initialize the second row to be: 2.0, 2.1, 2.2
            ...etc.


            Then print array
        */
    }
}