package ClassesAndObjects;

public class Super {
    static class Parent {
        int x = 10;
    }

    static class Child extends Parent {
        int x = 20;
        void show() {
            System.out.println(x);
            System.out.println(super.x);
        }
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
