//what to do with Book?

public class Textbook extends Book {
    //Fields for the title, author, publication year, 
    //number of pages, are optionally used, 
    //and optionally include electronic access 
    private boolean used;
    private boolean electronic;

    //only define used and electronic access here

    //constructor to initialize fields
    //(electronic access is always initially false)
    //don't pass electronic access as parameter to constructor
    //just take FIVE FIELDS - electronic access should be always set to false

    //method to add electronic acces
        //(ONLY if meet criteria: new and since 2020)
    public void buyElectronicAccess() {
        //if the book is new and published since 2020
            //electronicAccess = true
    }
    
    //Price
    //$199.99 as a base price if they are newer than 2020
    //$149.99 as a base price if they are older than that. 
    //Used textbooks get a 30% discount
    //Electronic access adds $50.00

    //Different toString
}