public class Point {
    private double _x;
    private double _y;

    public Point(double x, double y) {
        _x = x;
        _y = y;
    }

    public void print() {
        System.out.printf("(%.2f, %.2f)%n", _x, _y);
    }

    public Point midpoint(Point another) {
        double newX = (_x + another._x)/2;
        double newY = (_y + another._y)/2;

        return new Point(newX, newY);
    }

    public int quadrant() {
        if (_x >= 0) {
            if (_y >= 0) return 1;
            else return 4;
        }
        else {
            if (_y >= 0) return 2;
            else return 3;
        }
    }
}