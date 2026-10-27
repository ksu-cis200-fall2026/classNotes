//model
public class Adder {
    private int sum;

    public Adder() {
        sum = 0;
    }

    public void addNumber(int n) {
        sum += n;
    }

    public int getSum() {
        return sum;
    }
}