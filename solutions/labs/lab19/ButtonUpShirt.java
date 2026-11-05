//long-sleeved or not, come in packs of 2

public class ButtonUpShirt extends Shirt {
    private boolean longSleeved;
    
    public ButtonUpShirt(ShirtColor c) {
        super(c);
        count = 2;
        longSleeved = false;
    }

    public void makeLongSleeved() {
        longSleeved = true;
    }

    //come in packs of 2, so count must be even
    //don't change it if it's not
    public void setCount(int c) {
        if (c > 0 && c % 2 == 0) {
            count = c;
        }
        //don't change count unless new value is positive and even
    }

    public double getUnitCost() {
        if (longSleeved) return 34.99;
        else return 29.99;
    }

    public String getName() {
        return "Button-up shirt";
    }
}