package GreedyAlgorithms;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static int fractionalKnapsact(int value[], int weight[], int W) {
        int ratio[][] = new int[value.length][2];
        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i] / weight[i];
        }
        Arrays.sort(ratio, Comparator.comparingInt(o -> o[1]));
        int capacity = W;
        int finalValue = 0;
        for (int i = value.length - 1; i >= 0; i--) {
            int idx = ratio[i][0];
            if (capacity >= weight[idx]) {
                capacity -= weight[idx];
                finalValue += value[idx];
            } else {
                finalValue += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        return finalValue;
    }
    public static void main(String[] args) {
        int[] value = { 60, 100, 120 };
        int[] weight = { 10, 20, 30 };
        int W = 50;
        System.out.println(fractionalKnapsact(value, weight, W));
    }
}
