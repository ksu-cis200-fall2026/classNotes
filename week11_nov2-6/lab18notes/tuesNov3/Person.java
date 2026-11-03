public class Person {
    //what to change about these?
    protected String name;
    protected int age;

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public String getType() {
        return "Person";
    }

    public String toString() {
        return String.format("%s, age %d", name, age);
    }

    public void birthday() {
        age++;
    }
}