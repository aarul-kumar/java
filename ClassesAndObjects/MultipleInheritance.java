package ClassesAndObjects;

public class MultipleInheritance {
    interface Herbivore {
        void eatPlants();
    }
    interface Carnivore {
        void eatMeat();
    }
    static class Bear implements Herbivore, Carnivore {
        public void eatPlants() {
            System.out.println("Bear eat plants");
        }
        public void eatMeat() {
            System.out.println("Bear eat meat");
        }
    }

    public static void main(String[] args) {
        Bear b = new Bear();
        b.eatPlants();
        b.eatMeat();
    }
}
