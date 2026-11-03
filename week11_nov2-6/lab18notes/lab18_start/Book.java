public class Book {
    //Fields for the title, author, publication year, and number of pages
    protected String title;
    protected String author;
    protected int year;
    protected int pages;

    //constructor to initialize fields

    //A price method
    //  Books published <= 2015:  
    //      $9.99 for up to 300 pages
    //      An extra $0.25 for going over 300 pages,
    //      An extra $0.25 for going over 400 pages, etc. 
    // Books published more recently than 2015:
    //   base price $14.99, same page extras
    public double getPrice() {
        double basePrice = 0;
        //use an if-statement to pick correct base price from year

        double extra = 0;
        if (pages > 300) {
            extra = ((pages-300)/100 + 1) * 0.25;
        }

        //return extra + base price
    }

    //toString has:
    //title, author, publication year, page count, and price
}