public class Textbook extends Book {
    protected boolean electronicAccess;
    protected boolean used;

    public Textbook(String n, String t, int y, int p, boolean u) {
        super(n, t, y, p);

        used = u;
        electronicAccess = false;
    }

    public boolean addElectronicAccess() {
        //only eligible for new books published after 2020
        if (!used && year > 2020) {
            electronicAccess = true;
            return true;
        }
        else {
            return false;
        }
    }

    public double price() {
        //$149.99 for new books older than 2020
        //$199.99 for new books since 2020

        //used books get a 30% discount

        //electronic access adds $50

        double price = 0;

        if (year > 2020) {
            price = 199.99;
        }
        else {
            price = 149.99;
        }

        if (used) price *= 0.7;

        //only possible on non-used (new) books anyway
        if (electronicAccess) price += 50;

        return price;
    }

    public String toString() {
        StringBuilder build = new StringBuilder(super.toString());
        if (used) build.append("Used\n");
        else build.append("New\n");

        if (electronicAccess) build.append("Includes electronic access\n");

        return build.toString();
    }
}