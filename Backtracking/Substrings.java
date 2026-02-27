package Backtracking;

public class Substrings {
    public static void printSubstrings(String s, String ans, int i) {
        if (i == s.length()) {
            System.out.println(ans);
            return;
        }
        printSubstrings(s, ans + s.charAt(i), i + 1);
        printSubstrings(s, ans, i + 1);
    }
    
    public static void main(String[] args) {
        printSubstrings("abc", "", 0);
    }
}
