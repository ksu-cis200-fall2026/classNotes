public class Week11 {
    public static void main(String[] args) {
        Person s = new Student("Bob", 20, "ECE", 3.4);
        s.birthday();
        System.out.printf("Category: %s%n", s.getType());
        System.out.println(s);
        if (((Student)s).honorRoll()) {
            System.out.println("Honor roll");
        }

        //or:
        if (s instanceof Student) {
            Student stud = (Student) s;
            if (stud.honorRoll()) {
                System.out.println("Honor roll");
            }
        }

        //NO! not all people are students
        //Student s1 = new Person("Bill", 14);
        

        //create Person/Student/Employee objects

        //store all together
    }
}