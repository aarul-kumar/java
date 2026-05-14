package GreedyAlgorithms;

import java.util.Arrays;
import java.util.Collections;

public class Chocola {
    public static int minCost(Integer costVer[], Integer costHor[]) {
        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());
        int h = 0;
        int v = 0;
        int hp = 1;
        int vp = 1;
        int cost = 0;
        while (h < costHor.length && v < costVer.length) {
            if (costHor[h] >= costVer[v]) {
                cost += (vp * costHor[h]);
                hp++;
                h++;
            } else {
                cost += (hp * costVer[v]);
                vp++;
                v++;
            }
        }
        while (h < costHor.length) {
            cost += (vp * costHor[h]);
            hp++;
            h++;
        }
        while (v < costVer.length) {
            cost += (hp * costVer[v]);
            vp++;
            v++;
        }
        return cost;
    }
    public static void main(String[] args) {
        Integer costVer[] = { 2, 1, 3, 1, 4 };
        Integer costHor[] = { 4, 1, 2 };
        System.out.println(minCost(costVer, costHor));
    }
}
