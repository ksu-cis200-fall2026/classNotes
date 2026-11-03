public class Week11 {
    public static void main(String[] args) {
        //want to store 3 different people all together
        Person[] people = new Person[3];

            //Bob, age 30
        people[0] = new Person("Bob", 20);

            //Jane, age 20, ECE major, 3.4 GPA
        people[1] = new Student("Jane", 20, "ECE", 3.4);

            //Bill, age 18, PHYS major, 3.6 GPA
        people[2] = new Student("Bill", 18, "PHYS", 3.6);

        //how many students on the honor roll?
        int count = 0;

        //print everyone
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
            //is the current person a student?
            if (people[i] instanceof Student) {
                Student stud = (Student)people[i];
                //if they are, count if they are on the honor roll
                if (stud.honorRoll()) {
                    count++;
                }
            } 
        }
            //also print each type
            //also print "honor roll" for students on honor roll
    }
}