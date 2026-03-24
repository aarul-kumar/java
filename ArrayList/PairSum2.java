package ArrayList;

import java.util.ArrayList;

public class PairSum2 {
    public static void pairSum2(ArrayList<Integer> list, int target) {
        int n = list.size();
        int lp = 0;
        int rp = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                rp = i;
                lp = i + 1;
                break;
            }
        }
        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                System.out.println(list.get(lp) + " " + list.get(rp));
                break;
            } else if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            } else if (list.get(lp) + list.get(rp) > target) {
                rp = (n + rp - 1) % n;
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;

        pairSum2(list, target);
    }
}
