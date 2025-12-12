package BitManipulation;

public class ClearLastiBit {
    public static int clearLastiBit(int n, int i) {
        int bitmask = (~0)<<i;
        return n&bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearLastiBit(15, 2));
    }
}
