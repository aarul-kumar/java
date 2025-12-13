package BitManipulation;

public class ClearRangeOfBits {
    public static int clearRangeOfBits(int n, int i, int j) {
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitmask = a|b;
        return n&bitmask;
    }
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(clearRangeOfBits(2515, 2, 7)));
    }
}
