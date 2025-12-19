package ClassesAndObjects;

public class Constructors {
    static class Student {
        String name;
        int roll;

        //non -parameterized constructor
        Student() {
            System.out.println("Constructor is called");
        }

        //parameterized constructor
        Student(String name, int roll) {
            this.name = name;
            this.roll = roll;
        }

        //copy constructor
        Student(Student s) {
            this.name = s.name;
            this.roll = s.roll;
        }
    }
}
