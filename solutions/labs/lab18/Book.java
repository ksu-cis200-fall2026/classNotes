public class Book {
    protected String title;
    protected String author;
    protected int year;
    protected int pages;

    public Book(String t, String a, int y, int p) {
        title = t;
        author = a;
        year = y;
        pages = p;
    }

    public double price() {
        //2015 or older: $9.99 for up to 300 pages, 
            //$0.25 for each additional partial 100 pages

        //newer than 2015: $14.99 for up to 300 pages,
            //$0.25 for each additional partial 100 pages

        double p;
        if (year > 2015) {
            p = 14.99;
        } 
        else {
            p = 9.99;
        }

        if (pages > 300) {
            int numHund = (pages-300)/100 + 1;
            p += 0.25 * numHund;
        }

        return p;
    }

    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append("Title: " + title + "\n");
        build.append("Author: " + author + "\n");
        build.append("Year of publication: " + year + "\n");
        build.append("Page count: " + pages + "\n");
        build.append(String.format("Price: $%.2f%n", price()));

        return build.toString();
    }
}