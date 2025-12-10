package Strings;

public class StringCompression {
    public static String stringCompression(String s) {
        String newStr = "";
        for(int i=0; i<s.length(); i++) {
            Integer count = 1;
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)) {
                count++;
                i++;
            }
            newStr += s.charAt(i);
            if(count > 1) {
                newStr += count.toString();
            }
        }
        return newStr;
    }
    public static void main(String[] args) {
        String s = "aaabbcccdd";
        System.out.println(stringCompression(s));
    }
}
