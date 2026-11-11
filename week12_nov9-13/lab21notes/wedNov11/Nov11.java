import java.util.*;

public class Nov11 {
    public static void main(String[] args) {
        //create a TreeSet of type Person
        //add a few
        TreeSet<Person> people = new TreeSet<Person>();

        //Bob, age 20
        people.add(new Person("Bob", 20));
        people.add(new Person("Bob", 21));
        people.add(new Person("Bob", 18));
        people.add(new Person("Alison", 10));
        people.add(new Person("Zach", 50));
        people.add(new Person("Bob", 20));
        
        //print everything
        //need to use enhanced for loop
        for (Person p : people) {
            System.out.println(p);
        }
    }
}