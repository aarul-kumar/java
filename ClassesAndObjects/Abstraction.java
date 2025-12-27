package ClassesAndObjects;

public class Abstraction {
    abstract class Animal {
        void eat() {
            System.out.println("eats");
        }
        abstract void walk();
    }

    class Horse extends Animal {
        void walk() {
            System.out.println("Walks on 4 legs");
        }
    }

    class Bird extends Animal {
        void walk() {
            System.out.println("walk on 2 legs");
        }
    }
}
