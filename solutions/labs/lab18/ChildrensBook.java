public class ChildrensBook extends Book {
    protected boolean illustrated;
    protected boolean hardcover;

    public ChildrensBook(String n, String t, int y, int p, boolean i, boolean h) {
        super(n, t, y, p);

        illustrated = i;
        hardcover = h;
    }

    public double price() {
        //9.99 for non-illustrated non-hardcover
        //illustration adds $5 and hardcover adds $5

        double price = 9.99;

        if (illustrated) price += 5;
        if (hardcover) price += 5;

        return price;
    }

    public String toString() {
        StringBuilder build = new StringBuilder(super.toString());
        if (illustrated) build.append("Illustrated\n");

        if (hardcover) build.append("Hardcover\n");
        else build.append("Paperback\n");

        return build.toString();
    }
}