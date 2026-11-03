//long-sleeved or not, come in packs of 2

public class ButtonUpShirt {
    private ShirtColor color;
    private int count;
    private boolean longSleeved;
    
    public ButtonUpShirt(ShirtColor c) {
        color = c;
        count = 2;
        longSleeved = false;
    }

    public void makeLongSleeved() {
        longSleeved = true;
    }

    //any color is allowed
    public void setColor(ShirtColor newColor) {
        color = newColor;
    }

    //come in packs of 2, so count must be even
    //don't change it if it's not
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