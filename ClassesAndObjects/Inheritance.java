package ClassesAndObjects;

public class Inheritance {
    static class Animal {
        String color;
        void eat() {
            System.out.println("eats");
        }
    }

    //single
    static class Fish extends Animal {
        int fins;
        void swims() {
            System.out.println("swims");
        }
    }

    //Multilevel
    static class Cat extends Animal {
        int legs;
    }

    //Multi level
    static class Mammal extends Animal {
        int legs;
    }

    static class Dog extends Mammal {
        String breed;
    }
}
