package Strings;

public class Capitalize {
    public static String capitalize(String s) {
        StringBuilder sb = new StringBuilder();
        char ch = Character.toUpperCase(s.charAt(0));
        sb.append(ch);
        
        for(int i=1; i<s.length(); i++) {
            if(s.charAt(i)==' ') {
                sb.append(" ");
                i++;
                sb.append(Character.toUpperCase(s.charAt(i)));
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "hi, i am aarul";
        System.out.println(capitalize(s));
    }
}
