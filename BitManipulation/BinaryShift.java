package BitManipulation;

public class BinaryShift {
    public static int binaryLeftShift(int n, int a) {
        return n<<a;
    }
    public static int binaryRightShift(int n, int a) {
        return n>>a;
    }
    public static int binaryLeftShiftShortcut(int n, int a) {
        return (int)(n*Math.pow(2, a));
    }
    public static int binaryRightShiftShortcut(int n, int a) {
        return (int)(n/Math.pow(2, a));
    }
    public static void main(String[] args) {
        System.out.println(binaryLeftShift(5, 2));
        System.out.println(binaryRightShift(5, 2));
        System.out.println(binaryLeftShiftShortcut(5, 2));
        System.out.println(binaryRightShiftShortcut(5, 2));
    }
}
