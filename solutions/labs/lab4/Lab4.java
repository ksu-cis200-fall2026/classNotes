import java.util.*;

public class Lab4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter initial odometer mileage: ");
        double initMileage = s.nextDouble();

        System.out.print("Enter number of readings: ");
        int num = s.nextInt();

        double curMileage = initMileage;
        double totalGallons = 0;
        double mpg;

        for (int i = 0; i < num; i++) {
            System.out.printf("%nEnter odometer reading #%d: ", (i+1));
            double newMileage = s.nextDouble();
            System.out.printf("Enter gallons of gas purchased: ");
            double gallons = s.nextDouble();

            mpg = (newMileage-curMileage)/gallons;
            System.out.printf("Fuel economy from reading #%d: %.2f mpg%n", (i+1), mpg);

            curMileage = newMileage;
            totalGallons += gallons;
        }

        mpg = (curMileage-initMileage)/totalGallons;

        System.out.printf("%nOverall fuel economy: %.2f mpg%n", mpg);
    }
}