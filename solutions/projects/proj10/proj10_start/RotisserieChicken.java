public class RotisserieChicken {
    private boolean hot;

    public RotisserieChicken(boolean h) {
        hot = h;
    }

    public String getName() {
        if (hot) return "Hot Rotisserie Chicken";
        else return "Rotisserie Chicken";
    }

    public double getFullPrice() {
        if (hot) return 7.49;
        else return 6.49;
    }

    public String toString() {
        return String.format("%s, price: $%.2f", getName(), getFullPrice());
    }
}