public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public String toString() {
        return String.format("Name: %s, age: %d%n", name, age);
    }

    public int compareTo(Person elem) {
        //do they have the same name?
        if (name.equals(elem.name)) {
            if (age < elem.age) {
                //this person comes before elem
                return -1;
            }
            else if (age > elem.age) {
                //this person comes after elem
                return 1;
            }
            else {
                //they are equal
                return 0;
            }
        }
        //return however the names compare
        return name.compareTo(elem.name);
    }
    
    //sort first by name (alphabetically)
    //if same name, sort by age (youngest to oldest)
}