import java.util.*;

public class Lab18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //make array of 5 books:
        //1) "Make Way for Ducklings", Robert McCloskey, 1941, illustrated, hard cover, 72 pages
        //2) "Introduction to Algorithms, 4th Edition", "Thomas Corman et al", used, 2022, 1312 pages
        //3) "The Hobbit", J.R.R Tolkien, 1937, 310 pages
        //4) "Fourth Wing", Rebecca Yarros, 2023, 517 pages
        //5) "Managerial Accounting, 17th Edition", Carl Warren et al, 2025, 800 pages, new, homework package

        //print all

        Book[] books = new Book[5];
        books[0] = new ChildrensBook("Make Way for Ducklings", "Robert McCloskey", 1941, 72, true, true);
        books[1] = new Textbook("Introduction to Algorithms, 4th Edition", "Thomas Corman et al", 2022, 1312, true);
        books[2] = new Book("The Hobbit", "J.R.R. Tolkien", 1937, 310);
        books[3] = new Book("Fourth Wing", "Rebecca Yarros", 2023, 517);
        Textbook t = new Textbook("Managerial Accounting, 17th Edition", "Carl Warren et al", 2025, 800, false);
        t.addElectronicAccess();
        books[4] = t;

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
    }
}