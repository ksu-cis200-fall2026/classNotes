public class PoloShirt {
    private ShirtColor color;
    private int count;
    
    public PoloShirt() {
        color = ShirtColor.Black;
        count = 1;
    }

    public void setColor(ShirtColor newColor) {
        //only black and purple allowed
        if (newColor == ShirtColor.Black || newColor == ShirtColor.Purple) {
            color = newColor;
        }
        //otherwise don't change the color
    }

    public void setCount(int c) {
        if (c >= 1 && c <= 5) {
            count = c;
        }
        //don't change count unless new value is 1-5
    }

    public double orderCost() {
        double unitCost = 24.99;

        return count*unitCost;
    }

    public String toString() {
        return String.format("Polo shirt order, color: %s, count: %d, cost: $%.2f", color, count, orderCost());
    }
}