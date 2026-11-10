/**
 * RealNumber represents a number that can be placed on a number line
 * 
 * @author Julie Thornton
 * @version Project 9
 */

public class RealNumber {
    private double num;

    /**
     * Constructs a new RealNumber
     * 
     * @param n The underlying value of the number
     */
    public RealNumber(double n) {
        num = n;
    }

    /**
     * Gets the underlying value of this RealNumber
     * 
     * @return The value of this RealNumber
     */
    public double value() {
        return num;
    }

    /**
     * Returns this RealNumber plus another RealNumber
     * 
     * @param other Another RealNumber to add to this one
     * @return The sum of this RealNumber plus other
     */
    public RealNumber plus(RealNumber other) {
        return new RealNumber(num + other.num);
    }

    /**
     * Returns this RealNumber minus another RealNumber
     * 
     * @param other Another RealNumber to subtract from this one
     * @return The difference of this RealNumber minus other
     */
    public RealNumber minus(RealNumber other) {
        return new RealNumber(num - other.num);
    }

    /**
     * Returns this RealNumber times another RealNumber
     * 
     * @param other Another RealNumber to multiply by this one
     * @return The sum of this RealNumber times other
     */
    public RealNumber times(RealNumber other) {
        return new RealNumber(num * other.num);
    }

    /**
     * Gets the string representation of this RealNumber
     * 
     * @param The string representation of this RealNumber
     */
    public String toString() {
        return String.format("%.2f", num);
    }
}