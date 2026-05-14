package GreedyAlgorithms;

import java.util.Arrays;

public class MinAbsoluteDifferencePair {
    public static int minAbsoluteDifferencePair(int arr1[], int arr2[]) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int val = 0;
        for (int i = 0; i < arr1.length; i++) {
            val += Math.abs(arr1[i] - arr2[i]);
        }
        return val;
    }
    public static void main(String[] args) {
        int A[] = { 4, 1, 8, 7 };
        int B[] = { 2, 3, 6, 5 };
        System.out.println(minAbsoluteDifferencePair(A, B));
    }
}
