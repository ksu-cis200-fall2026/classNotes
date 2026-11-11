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
        if (name.equals(elem.name)) {
            //names are the same
            //compare the ages

            //if this person's age is less than the parameter's age
            if (age < elem.age) {
                //says that this person comes before elem
                return -1;
            }
            else if (age > elem.age) {
                //says that this person comes after elem
                return 1;
            }
            else {
                //names AND ages are equal
                return 0;
            }
        }
        else {
            //the names are NOT the same, so return how they compare
            return name.compareTo(elem.name);
        }
    }
    
    //sort first by name (alphabetically)
    //if same name, sort by age (youngest to oldest)
}