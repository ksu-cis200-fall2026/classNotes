/**
 * RationalNumber represents a number that can be written as a fraction
 * 
 * @author Julie Thornton
 * @version Project 9
 */

public class RationalNumber extends RealNumber {
    private int numer;
    private int denom;

    /**
     * Constructs a new RationalNumber
     * 
     * @param n The numerator of the new RationalNumber
     * @param d The denominator of the new RationalNumber
     */
    public RationalNumber(int n, int d) {
        super(n/(double)d);
        
        numer = n;
        denom = d;
        reduce();
    }

    /**
     * Uses the Euclidean algorithm to reduce this number to lowest terms
     */
    private void reduce() {
        //Euclidean algorithm

        if (numer == 0) {
            denom = 1;
            return;
        }
    
        int a = Math.max(numer, denom);
        int b = Math.min(numer, denom);
        int rem = a%b;

        while (rem != 0) {
            a = b;
            b = rem;
            rem = a%b;
        }

        //b is gcd
        numer /= b;
        denom /= b;

        if (numer < 0 && denom < 0) {
            numer *= -1;
            denom *= -1;
        }
        else if (numer >= 0 && denom < 0) {
            numer *= -1;
            denom *= -1;
        }
    }

    /**
     * Returns this RealNumber plus another RealNumber
     * 
     * @param other Another RealNumber to add to this one
     * @return The sum of this RealNumber plus other, represented in the most specific type possible
     */
    public RealNumber plus(RealNumber n) {
        if (n instanceof RationalNumber) {
            RationalNumber r = (RationalNumber) n;

            int newNum = numer*r.denom + r.numer*denom;
            int newDenom = denom*r.denom;

            return new RationalNumber(newNum, newDenom);
        }
        else {
            return super.plus(n);
        }
    }

    /**
     * Returns this RealNumber minus another RealNumber
     * 
     * @param other Another RealNumber to subtract from this one
     * @return The difference of this RealNumber minus other, represented in the most specific type possible
     */
    public RealNumber minus(RealNumber n) {
        if (n instanceof RationalNumber) {
            RationalNumber r = (RationalNumber) n;

            int newNum = numer*r.denom - r.numer*denom;
            int newDenom = denom*r.denom;

            return new RationalNumber(newNum, newDenom);
        }
        else {
            return super.minus(n);
        }
    }

    /**
     * Returns this RealNumber times another RealNumber
     * 
     * @param other Another RealNumber to multiply by this one
     * @return The sum of this RealNumber times other, represented in the most specific type possible
     */
    public RealNumber times(RealNumber n) {
        if (n instanceof RationalNumber) {
            RationalNumber r = (RationalNumber) n;

            int newNum = numer*r.numer;
            int newDenom = denom*r.denom;

            return new RationalNumber(newNum, newDenom);
        }
        else {
            return super.times(n);
        }
    }

    /**
     * Gets the string representation of this RationalNumber
     * 
     * @param The string representation of this RationalNumber
     */
    public String toString() {
        return String.format("%d/%d", numer, denom);
    }
}