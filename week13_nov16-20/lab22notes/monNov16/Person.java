public class Person {
    private String name;
    private int age;

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public int getAge() {
        return age;
    }

    public void birthday() {
        age++;
    }

    public String toString() {
        return String.format("Name: %s, age: %d%n", name, age);
    }
}