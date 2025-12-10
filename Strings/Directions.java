package Strings;

public class Directions {
    public static int shortestPath(String s) {
        int x = 0;
        int y = 0;
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'N') {
                y++;
            } else if(ch == 'S') {
                y--;
            } else if(ch == 'E') {
                x++;
            } else {
                x--;
            }
        }
        return (int) Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
    }
    public static void main(String[] args) {
        String s = "WNEENESENNN";
        System.out.println(shortestPath(s));
    }
}
