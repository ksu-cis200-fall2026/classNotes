public class Shirt {
    protected ShirtColor color;
    protected int count;
    
    public Shirt(ShirtColor c) {
        color = c;
        count = 1;
    }

    public void setCount(int c) {
        if (c > 0) {
            count = c;
        }
        //don't change count unless new value is positive
    }

    public void setColor(ShirtColor newColor) {
        color = newColor;
    }

    public double unitCost() {
        double unitCost = 0;
        switch (color) {
            case White:
            case Black:
            case Gray:
                unitCost = 14.99;
                break;
            default:
                unitCost = 16.99;
                break;
        }

        return unitCost;
    }

    public double orderCost() {
        return count*unitCost();
    }

    public String getName() {
        return "Shirt";
    }

    public String toString() {
        return String.format("%s order, color: %s, count: %d, cost: $%.2f", getName(), color, count, orderCost());
    }
}