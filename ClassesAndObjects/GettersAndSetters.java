package ClassesAndObjects;

public class GettersAndSetters {
    static class Pen {
        private String color;
        private int tip;

        String getColor() {
            return this.color;
        }

        int getTip() {
            return this.tip;
        }

        void setColor(String newColor) {
            this.color = newColor;
        }

        void setTip(int tip) {
            this.tip = tip;
        }
    }
    public static void main(String[] args) {
        Pen P1 = new Pen();
        P1.setColor("blue");
        System.out.println(P1.getColor());
        P1.setTip(5);
        System.out.println(P1.getTip());
    }
}
