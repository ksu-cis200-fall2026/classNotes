/**
 * Represents a rotisserie chicken
 * 
 * @version Project 10
 * @author Julie Thornton
 */

public class RotisserieChicken implements GroceryItem {
    private boolean hot;

    /**
     * Creates a new rotisserie chicken
     * 
     * @param h Whether this chicken is hot
     */
    public RotisserieChicken(boolean h) {
        hot = h;
    }

    /**
     * Gets the name of this item
     * 
     * @return The name of this item
     */
    public String getName() {
        if (hot) return "Hot Rotisserie Chicken";
        else return "Rotisserie Chicken";
    }

    /**
     * Gets the full price of this item
     * 
     * @return The full price of this item
     */
    public double getFullPrice() {
        if (hot) return 7.49;
        else return 6.49;
    }

    /**
     * Gets a string representation of this item
     * 
     * @return The string representation of this item
     */
    public String toString() {
        return String.format("%s, price: $%.2f", getName(), getFullPrice());
    }
}