/**
 * Represents a grocery order of different items
 * 
 * @version Project 10
 * @author Julie Thornton
 */

import java.util.*;

public class GroceryOrder {
    private ArrayList<GroceryItem> items;
    private Random r;

    /**
     * Creates a new (empty) grocery order
     */
    public GroceryOrder() {
        items = new ArrayList<GroceryItem>();
        r = new Random();
    }

    /**
     * Adds a new item to this grocery order
     * 
     * @param item A new item to add to the order
    */
    private void addItem(GroceryItem item) {
        items.add(item);
    }

    /**
     * Creates a random grocery order
    */
    public void createRandomOrder() {
        items.clear();

        //generate 5-10 items
        int count = r.nextInt(6)+5;

        for (int i = 0; i < count; i++) {
            //generate 0-5 for item type
            int whichItem = r.nextInt(6);

            GroceryItem item;

            if (whichItem == 0) {
                Apple a = new Apple();

                //randomly count of 1-10
                int itemCount = r.nextInt(10) + 1;
                a.setCount(itemCount);
                item = a;
            }
            else if (whichItem == 1) {
                TortillaChips c = new TortillaChips();

                 //randomly low salt
                int saltNum = r.nextInt(2);
                if (saltNum == 1) {
                    c.updateSalt(true);
                }

                item = c;
            }
            else if (whichItem == 2) {
                //randomly glazed
                int frostNum = r.nextInt(2);
                boolean frost = false;
                if (frostNum == 1) frost = true;

                Donut d = new Donut(frost);

                //randomly count of 1-12
                int itemCount = r.nextInt(12) + 1;
                d.setCount(itemCount);
                item = d;
            }
            else if (whichItem == 3) {
                item = new Eggs();
            }
            else if (whichItem == 4) {
                //randomly organic
                int orgNum = r.nextInt(2);
                boolean org = false;
                if (orgNum == 1) org = true;

                Orange o = new Orange(org);

                //randomly count of 1-5
                int itemCount = r.nextInt(5) + 1;
                o.setCount(itemCount);
                item = o;
            }
            else  {
                //randomly hot
                int hotNum = r.nextInt(2);
                boolean hot = false;
                if (hotNum == 1) hot = true;

                item = new RotisserieChicken(hot);
            }

            addItem(item);
        }
    }

    /**
     * Creates a standard grocery order
    */
    public void createStandardOrder() {
        items.clear();

        //8 apples
        Apple a = new Apple();
        a.setCount(8);
        addItem(a);

        //low salt chips
        TortillaChips t = new TortillaChips();
        t.updateSalt(true);
        addItem(t);

        //12 plain donuts
        Donut d = new Donut(false);
        d.setCount(12);
        addItem(d);

        //3 glazed donuts
        d = new Donut(true);
        d.setCount(3);
        addItem(d);

        //3 containers of eggs
        addItem(new Eggs());
        addItem(new Eggs());
        addItem(new Eggs());

        //5 organic oranges
        Orange o = new Orange(true);
        o.setCount(5);
        addItem(o);

        //1 hot rotisserie chicken, 1 cold rotisserie chicken
        addItem(new RotisserieChicken(true));
        addItem(new RotisserieChicken(false));
    }

    /**
     * Gets the order total before any discounts
     * 
     * @return The (pre-discount) order total
    */
    public double getTotal() {
        double total = 0; 
        for (GroceryItem item : items) {
            total += item.getFullPrice();
        }
        return total;
    }

    /**
     * Gets the order total after any discounts
     * 
     * @return The (after discount) order total
    */
    public double getDiscountedTotal() {
        double total = 0; 
        for (GroceryItem item : items) {
            if (item instanceof DiscountedItem) {
                DiscountedItem d = (DiscountedItem) item;
                total += d.getDiscountPrice();
            }
            else {
                total += item.getFullPrice();
            }
        }
        return total;
    }

    /**
     * Gets the overall savings after applying discounts
     * 
     * @return The savings after applying discounts
    */
    public double getSavings() {
        return getTotal() - getDiscountedTotal();
    }

    /**
     * Gets a list of all grocery items
     * 
     * @return All grocery items
    */
    public ArrayList<GroceryItem> getAllItems() {
        return items;
    }

    /**
     * Gets a list of all countable grocery items
     * 
     * @return All countable grocery items
    */
    public ArrayList<CountableItem> getAllCountableItems() {
        ArrayList<CountableItem> filtered = new ArrayList<CountableItem>();
        for (GroceryItem item : items) {
            if (item instanceof CountableItem) {
                CountableItem c = (CountableItem) item;
                filtered.add(c);
            }
        }
        return filtered;
    }

    /**
     * Gets a list of all discounted grocery items
     * 
     * @return All discounted grocery items
    */
    public ArrayList<DiscountedItem> getAllDiscountedItems() {
        ArrayList<DiscountedItem> filtered = new ArrayList<DiscountedItem>();
        for (GroceryItem item : items) {
            if (item instanceof DiscountedItem) {
                DiscountedItem d = (DiscountedItem) item;
                filtered.add(d);
            }
        }
        return filtered;
    }
}