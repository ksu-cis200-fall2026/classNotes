import java.util.*;

public class Nov12 {
    public static void main(String[] args) {
        //create a TreeSet of type Person
        //add a few
        TreeSet<Person> people = new TreeSet<Person>();

        people.add(new Person("Adam", 18));
        people.add(new Person("Adam", 10));
        people.add(new Person("Bob", 25));
        people.add(new Person("Aaron", 28));
        people.add(new Person("Bob", 25));
        
        //print everything
        for (Person p : people) {
            System.out.println(p);
        }
    }
}