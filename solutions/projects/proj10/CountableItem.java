public interface CountableItem extends GroceryItem {
    void setCount(int num);

    int getCount();

    double getUnitPrice();
}