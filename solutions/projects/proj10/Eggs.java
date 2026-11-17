/**
 * Represents a dozen eggs
 * 
 * @version Project 10
 * @author Julie Thornton
 */

public class Eggs implements DiscountedItem {
    
    /**
     * Gets the name of this item
     * 
     * @return The name of this item
     */
    public String getName() {
        return "Dozen Eggs";
    }

    /**
     * Gets the full price of this item
     * 
     * @return The full price of this item
     */
    public double getFullPrice() {
        return 3.99;
    }

    /**
     * Gets the discounted price of this item
     * 
     * @return The discounted price
     */
    public double getDiscountPrice() {
        //on sale for 2.19
        return 2.19;
    }

    /**
     * Gets a string representation of this item
     * 
     * @return The string representation of this item
     */
    public String toString() {
        return String.format("%s, price: $%.2f", getName(), getDiscountPrice());
    }
}