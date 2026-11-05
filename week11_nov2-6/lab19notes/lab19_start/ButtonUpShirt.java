//long-sleeved or not, come in packs of 2

//again, extend Shirt
public class ButtonUpShirt {
    //color and count should go away
    private ShirtColor color;
    private int count;

    //longSleeved should stay
    private boolean longSleeved;
    
    //don't change parameters to constructor
    public ButtonUpShirt(ShirtColor c) {
        color = c;
        count = 2;
        longSleeved = false;
    }

    public void makeLongSleeved() {
        longSleeved = true;
    }

    //any color is allowed
    //delete this method, want to use the parent version
    public void setColor(ShirtColor newColor) {
        color = newColor;
    }

    //come in packs of 2, so count must be even
    //don't change it if it's not
    //different than Shirt, want to override
    public void setCount(int c) {
        if (c > 0 && c % 2 == 0) {
            count = c;
        }
        //don't change count unless new value is positive and even
    }

    public double orderCost() {
        double unitCost = 29.99;

        if (longSleeved) unitCost = 34.99;

        return count*unitCost;
    }

    public String toString() {
        return String.format("Button-up shirt order, color: %s, count: %d, cost: $%.2f", color, count, orderCost());
    }
}