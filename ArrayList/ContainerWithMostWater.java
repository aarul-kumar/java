package ArrayList;
import java.util.*;

public class ContainerWithMostWater {
    public static int mostWater(ArrayList<Integer> list) {
        int lp = 0;
        int rp = list.size() - 1;
        int maxWater = 0;

        while (lp < rp) {
            if (list.get(lp) < list.get(rp)) {
                lp++;
            } else {
                rp--;
            }
            int ht = Math.min(list.get(lp), list.get(rp));
            int wt = rp - lp;
            int currWater = ht * wt;
            maxWater = Math.max(maxWater, currWater);
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        System.out.println(mostWater(list));

    }
}
