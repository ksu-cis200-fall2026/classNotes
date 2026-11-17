/**
 * Represents a bag of tortilla chips
 * 
 * @version Project 10
 * @author Julie Thornton
 */

public class TortillaChips implements DiscountedItem {
    private boolean lowSalt = false;

    public void updateSalt(boolean isLow) {
        lowSalt = isLow;
    }

    /**
     * Gets the name of this item
     * 
     * @return The name of this item
     */
    public String getName() {
        StringBuilder build = new StringBuilder();
        if (lowSalt) build.append("Low Salt ");
        build.append("Tortilla Chips");
        return build.toString();
    }

    /**
     * Gets the discounted price of this item
     * 
     * @return The discounted price
     */
    public double getDiscountPrice() {
        //on sale for 3.99
        return 3.99;
    }

    /**
     * Gets the full price of this item
     * 
     * @return The full price of this item
     */
    public double getFullPrice() {
        return 5.49;
    }

    /**
     * Gets a string representation of this item
     * 
     * @return The string representation of this item
     */
    public String toString() {
        return String.format("%s, discount price: $%.2f", getName(), getDiscountPrice());
    }
}