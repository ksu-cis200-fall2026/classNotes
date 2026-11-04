//should extend Shirt
public class PoloShirt {
    //don't need these fields
    private ShirtColor color;
    private int count;
    
    public PoloShirt() {
        //call super 
        color = ShirtColor.Black;
        count = 1;
    }

    //should stay, override setColor in Shirt
    public void setColor(ShirtColor newColor) {
        //only black and purple allowed
        if (newColor == ShirtColor.Black || newColor == ShirtColor.Purple) {
            color = newColor;
        }
        //otherwise don't change the color
    }

    //different from Shirt, keep to override
    public void setCount(int c) {
        if (c >= 1 && c <= 5) {
            count = c;
        }
        //don't change count unless new value is 1-5
    }

    //override getUnitCost

    //get rid of orderCost, because that should be the same as in Shirt

    public double orderCost() {
        double unitCost = 24.99;

        return count*unitCost;
    }

    //override getName

    //git rid of toString, use the one from Shirt

    public String toString() {
        return String.format("Polo shirt order, color: %s, count: %d, cost: $%.2f", color, count, orderCost());
    }
}