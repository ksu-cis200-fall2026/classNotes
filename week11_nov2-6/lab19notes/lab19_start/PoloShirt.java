
//should extend Shirt
public class PoloShirt extends Shirt {
    //these fields should go away
    private ShirtColor color;
    private int count;
    
    //keep it with no parameters
    public PoloShirt() {
        //need to call super
        color = ShirtColor.Black;
        count = 1;
    }

    //keep setColor, will override from Shirt
    public void setColor(ShirtColor newColor) {
        //only black and purple allowed
        if (newColor == ShirtColor.Black || newColor == ShirtColor.Purple) {
            color = newColor;
        }
        //otherwise don't change the color
    }

    //leave this method here
    //will override from Shirt
    public void setCount(int c) {
        if (c >= 1 && c <= 5) {
            count = c;
        }
        //don't change count unless new value is 1-5
    }

    //override unit cost
    public double getUnitCost() {
        return 24.99;
    }

    //get rid of orderCost (inherited from Shirt)

    //delete this method
    public double orderCost() {
        double unitCost = 24.99;

        return count*unitCost;
    }

    //need to override getName to return "Polo shirt"

    //toString goes away
    public String toString() {
        return String.format("Polo shirt order, color: %s, count: %d, cost: $%.2f", color, count, orderCost());
    }
}