package DynamicProgramming;

import java.util.Arrays;

public class ClimbingStair {
    public static int climbingStairRecursion(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        return climbingStairRecursion(n - 1) + climbingStairRecursion(n - 2);
    }

    public static int climbingStairMemoization(int n, int dp[]) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        dp[n] = climbingStairMemoization(n - 1, dp) + climbingStairMemoization(n - 2, dp);
        return dp[n];
    }

    public static int climbingStairTabulation(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1];
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(climbingStairRecursion(n));
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(climbingStairMemoization(n, dp));
        System.out.println(climbingStairTabulation(n));
    }
}
