package Recursion;

public class RemoveDuplicates {
    public static void removeDuplicates(String s, int i, StringBuilder sb, boolean vis[]) {
        if(i == s.length()) {
            System.out.print(sb.toString());
            return;
        }
        char c = s.charAt(i);
        if(vis[c-'a'] == true) {
            removeDuplicates(s, i+1, sb, vis);
        }
        if(vis[c-'a'] == false) {
            vis[c-'a'] = true;
            removeDuplicates(s, i+1, sb.append(c), vis);
        }
    }
    public static void main(String[] args) {
        String s = "appnnacollege";
        boolean vis[] = new boolean[26];
        removeDuplicates(s, 0, new StringBuilder(), vis);
    }
}
