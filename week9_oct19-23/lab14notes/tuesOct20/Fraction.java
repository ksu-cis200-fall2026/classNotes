//what does a fraction need?
//2/3
public class Fraction {
    //fields
    private int num;
    private int denom;

    //constructor
    //take information for the fields
    public Fraction(int n, int d) {
        //initialize the fields
        num = n;
        denom = d;
    }

    //print method
    //0.666667
    public void print() {
        System.out.printf("%d/%d%n", num, denom);
    }

    //plus
    public Fraction plus(Fraction other) {
        //num, denom (this is for the first fraction)
        //other.num, other.denom (this is for the second fraction)
        int commonDenom = denom*other.denom;
        int newNum = num*other.denom + other.num*denom;

        Fraction added = new Fraction(newNum, commonDenom);
        return added;
    }
}