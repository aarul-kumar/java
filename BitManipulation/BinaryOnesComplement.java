package BitManipulation;

public class BinaryOnesComplement {
    public static int onesComplement(int a) {
        return ~a;
    }
    public static void main(String[] args) {
        System.out.println(onesComplement(5));
    }
}
