public class Donut {
    private boolean glazed;
    private int count;

    public Donut(boolean g) {
        glazed = g;
        count = 1;
    }

    public String getName() {
        if (glazed) return "Glazed Donut";
        else return "Plain Donut";
    }

   public void setCount(int num) {
        //only allow counts between 1-12
        if (num >= 1 && num <= 12) {
            count = num;
        }
    }

    public int getCount() {
        return count;
    }

    public double getUnitPrice() {
        if (glazed) return 1.49;
        else return 1.09;
    }

    public double getFullPrice() {
        return count*getUnitPrice();
    }

    public double getDiscountPrice() {
        //save 25% 
        return 0.75 * getFullPrice();
    }

    public String toString() {
        return String.format("%s, count: %d, discount price: $%.2f", getName(), getCount(), getDiscountPrice());
    }
}