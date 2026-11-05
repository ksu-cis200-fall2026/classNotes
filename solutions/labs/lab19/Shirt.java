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

    public double getUnitCost() {
        double cost = 0;

        switch (color) {
            case White:
            case Black:
            case Gray:
                cost = 14.99;
                break;
            default:
                cost = 16.99;
                break;
        }

        return cost;
    }

    public double orderCost() {
        return count*getUnitCost();
    }

    public String getName() {
        return "Shirt";
    }

    public String toString() {
        return String.format("%s order, color: %s, count: %d, cost: $%.2f", getName(), color, count, orderCost());
    }
}