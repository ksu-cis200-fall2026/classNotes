import java.util.*;

public class Lab6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number that is >10: ");
            int num = Integer.parseInt(s.nextLine());

            if (num <= 10) {
                System.out.printf("Error: %d is not >10%n%n", num);
            }
            else {
                sum += num;
                int start = num;
                if (start % 2 == 0) {
                    start--;
                }
                
                System.out.println();
                System.out.println("The odd numbers <= " + num + " are: ");
                for (int j = start; j >= 1; j-=2) {
                    System.out.println(j);
                }
                System.out.println();
            }
        }
        System.out.println("The sum of the 5 numbers entered that are >10 is: " + sum);
    }
}
