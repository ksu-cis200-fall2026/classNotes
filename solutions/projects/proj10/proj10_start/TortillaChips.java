public class TortillaChips {
    private boolean lowSalt = false;

    public void updateSalt(boolean isLow) {
        lowSalt = isLow;
    }

    public String getName() {
        StringBuilder build = new StringBuilder();
        if (lowSalt) build.append("Low Salt ");
        build.append("Tortilla Chips");
        return build.toString();
    }

    public double getDiscountPrice() {
        //on sale for 3.99
        return 3.99;
    }

    public double getFullPrice() {
        return 5.49;
    }

    public String toString() {
        return String.format("%s, discount price: $%.2f", getName(), getDiscountPrice());
    }
}