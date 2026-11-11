public class Person {
    private String name;
    private int age;

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public String toString() {
        return String.format("Name: %s, age: %d%n", name, age);
    }
    
    //sort first by name (alphabetically)
    //if same name, sort by age (youngest to oldest)
}