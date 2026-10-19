//what does a fraction need?
public class Fraction {
    //fields
    private int num;
    private int denom;

    //constructor
    public Fraction(int n, int d) {
        num = n;
        denom = d;
    }

    //plus
    public Fraction plus(Fraction other) {
        //num is numerator of first fraction (calling object)
        //denom is denominator of first fraction (calling object)
        //other.num is the numerator of the second fraction
        //other.denom is the denominator of the second fraction
    
        int commonDenom = denom*other.denom;
        int newNum = num*other.denom + other.num*denom;

        Fraction result = new Fraction(newNum, commonDenom);
        return result;
    }

    public void print(){
        System.out.printf("%d/%d%n", num, denom);
    }
}