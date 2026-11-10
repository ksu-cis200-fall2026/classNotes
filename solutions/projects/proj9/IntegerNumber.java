/**
 * IntegerNumber represents a whole number
 * 
 * @author Julie Thornton
 * @version Project 9
 */

public class IntegerNumber extends RationalNumber {
    //could make RationalNumber's numer protected and
    //use that value instead
    private int num;

    /**
     * Constructs a new IntegerNumber
     * 
     * @param n The underlying value of this IntegerNumber
     */
    public IntegerNumber(int n) {
        super(n, 1);
        
        num = n;
    }

    /**
     * Returns this RealNumber plus another RealNumber
     * 
     * @param other Another RealNumber to add to this one
     * @return The sum of this RealNumber plus other, represented in the most specific type possible
     */
    public RealNumber plus(RealNumber n) {
        if (n instanceof IntegerNumber) {
            IntegerNumber i = (IntegerNumber) n;

            return new IntegerNumber(num + i.num);
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
        if (n instanceof IntegerNumber) {
            IntegerNumber i = (IntegerNumber) n;

            return new IntegerNumber(num - i.num);
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
        if (n instanceof IntegerNumber) {
            IntegerNumber i = (IntegerNumber) n;

            return new IntegerNumber(num * i.num);
        }
        else {
            return super.times(n);
        }
    }

    /**
     * Gets the string representation of this IntegerNumber
     * 
     * @param The string representation of this IntegerNumber
     */
    public String toString() {
        return String.format("%d", num);
    }
}