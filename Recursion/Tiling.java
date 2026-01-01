package Recursion;

public class Tiling {
    public static int tilingProblem(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        int ver = tilingProblem(n-1);
        int hor = tilingProblem(n-2);
        int totWays = ver + hor;
        return totWays;
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(3));
    }
}
