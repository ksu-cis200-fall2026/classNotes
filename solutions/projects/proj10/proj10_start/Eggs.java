public class Eggs {
    public String getName() {
        return "Dozen Eggs";
    }

    public double getFullPrice() {
        return 3.99;
    }

    public double getDiscountPrice() {
        //on sale for 2.19
        return 2.19;
    }

    public String toString() {
        return String.format("%s, price: $%.2f", getName(), getDiscountPrice());
    }
}