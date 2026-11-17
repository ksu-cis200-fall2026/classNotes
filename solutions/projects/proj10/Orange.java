/**
 * Represents an Orange
 * 
 * @version Project 10
 * @author Julie Thornton
 */

public class Orange implements CountableItem {
    private int count;
    private boolean organic;

    /**
     * Creates a new orange
     * 
     * @param o Whether this orange is organic
     */
    public Orange(boolean o) {
        organic = o;
        count = 1;
    }

    /**
     * Gets the name of this item
     * 
     * @return The name of this item
     */
    public String getName() {
        if (organic) return "Organic Orange";
        else return "Orange";
    }

    /**
     * Updates the count of this item
     * 
     * @param num The new count of this item
     */
    public void setCount(int num) {
        //only allow counts between 1-5
        if (num >= 1 && num <= 5) {
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
        if (organic) return 1.49;
        else return 0.89;
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
     * Gets a string representation of this item
     * 
     * @return The string representation of this item
     */
    public String toString() {
        return String.format("%s, count: %d, price: $%.2f", getName(), getCount(), getFullPrice());
    }
}