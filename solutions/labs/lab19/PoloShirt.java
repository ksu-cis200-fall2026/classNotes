public class PoloShirt extends Shirt {
    public PoloShirt() {
        super(ShirtColor.Black);
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

    public double getUnitCost() {
        return 24.99;
    }

    public String getName() {
        return "Polo shirt";
    }
}