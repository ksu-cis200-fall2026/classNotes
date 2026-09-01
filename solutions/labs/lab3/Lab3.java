import java.util.*;

public class Lab3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of pizzas (0-10): ");
        int pizzas = s.nextInt();
        System.out.println();

        if (pizzas >= 0 && pizzas <= 10) {
            double preTax;

            if (pizzas <= 4) {
                preTax = 12.99*pizzas;
            }
            else {
                preTax = 12.99*4 + 9.99*(pizzas-4);
            }

            double tip = preTax * 0.2;
            double tax = preTax * 0.095;
            double overall = preTax + tip + tax;

            System.out.printf("Pre-tax total: $%.2f%n", preTax);
            System.out.printf("Tip amount: $%.2f%n", tip);
            System.out.printf("Overall total, including tax and tip: $%.2f%n", overall);
        }
        else {
            System.out.println("Error: number of pizzas must be 0-10");
        }
    }
}
