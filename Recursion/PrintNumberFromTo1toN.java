package Recursion;

public class PrintNumberFromTo1toN {
    public static void printDec(int n) {
        if(n==1) {
            System.out.print(1+" ");
            return;
        }
        printDec(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        printDec(10);
    }
}
