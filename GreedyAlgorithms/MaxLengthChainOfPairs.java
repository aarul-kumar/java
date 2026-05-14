package GreedyAlgorithms;

import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChainOfPairs {
    public static int maxLengthChainOfPairs(int pair[][]) {
        Arrays.sort(pair, Comparator.comparingInt(o -> o[1]));
        int maxLength = 1;
        int lastEnd = pair[0][1];
        for (int i = 1; i < pair.length; i++) {
            if (pair[i][0] > lastEnd) {
                maxLength++;
                lastEnd = pair[i][1];
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int pair[][] = {{ 5, 24 },
                        { 39, 60 },
                        { 5, 28 },
                        { 27, 40 },
                        { 50, 90 } };
        System.out.println(maxLengthChainOfPairs(pair));
    }
}
