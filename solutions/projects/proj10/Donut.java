/**
 * Represents a Donut
 * 
 * @version Project 10
 * @author Julie Thornton
 */

public class Donut implements CountableItem, DiscountedItem {
    private boolean glazed;
    private int count;

    /**
     * Creates a new donut
     * 
     * @param g Whether this donut is glazed
     */
    public Donut(boolean g) {
        glazed = g;
        count = 1;
    }

    /**
     * Gets the name of this item
     * 
     * @return The name of this item
     */
    public String getName() {
        if (glazed) return "Glazed Donut";
        else return "Plain Donut";
    }

    /**
     * Updates the count of this item
     * 
     * @param num The new count of this item
     */
    public void setCount(int num) {
        //only allow counts between 1-12
        if (num >= 1 && num <= 12) {
            count = num;
        }
    }

    /**
     * Gets the count of this item
     * 
     * @return The count of this item
     */
    public int getCount() {
        return count;
    }

    /**
     * Gets the unit price of this item
     * 
     * @return The unit price of this item
     */
    public double getUnitPrice() {
        if (glazed) return 1.49;
        else return 1.09;
    }

    /**
     * Gets the full price of this item
     * 
     * @return The full price of this item
     */
    public double getFullPrice() {
        return count*getUnitPrice();
    }

    /**
     * Gets the discounted price of this item
     * 
     * @return The discounted price
     */
    public double getDiscountPrice() {
        //save 25% 
        return 0.75 * getFullPrice();
    }

    /**
     * Gets a string representation of this item
     * 
     * @return The string representation of this item
     */
    public String toString() {
        return String.format("%s, count: %d, discount price: $%.2f", getName(), getCount(), getDiscountPrice());
    }
}