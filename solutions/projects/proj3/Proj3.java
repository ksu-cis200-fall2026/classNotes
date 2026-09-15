import java.util.*;

public class Proj3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a positive whole number: ");
        int num = s.nextInt();

        System.out.println();
        if (num <= 0) {
            System.out.println("Error: input must be positive");
            return;
        }
        else if (num == 1) {
            System.out.println("1 is neither prime nor composite");
            return;
        }

        System.out.printf("%d = ", num);

        boolean prime = true;
        int origNum = num;
        int factor = 2;
        int mostFactor = 1;
        int mostCount = 0;
        int curCount = 0;
        while (factor <= num) {
            if (num % factor == 0) {
                System.out.printf("%d ", factor);

                if (factor != origNum) {
                    prime = false;
                    
                }

                num /= factor;

                if (num != 1) {
                    System.out.print("* ");
                }

                curCount++;
            }
            else {
                if (curCount > mostCount) {
                    mostFactor = factor;
                    mostCount = curCount;
                }

                curCount = 0;

                factor++;
            }
        }

        if (curCount > mostCount) {
            mostFactor = factor;
            mostCount = curCount;
        }

        System.out.println();
        if (prime) {
            System.out.printf("%d is prime%n", origNum);
        }
        else {
            System.out.printf("Most common factor of %d is %d, which occurred %d time", origNum, mostFactor, mostCount);

            if (mostFactor > 1) {
                System.out.print("s");
            }
            System.out.println();
        }
    }
}