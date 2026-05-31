package DynamicProgramming;

public class Knapsack01 {
    public static int recursion(int val[], int wt[], int W, int n) {
        if (W == 0 || n == 0) {
            return 0;
        }
        if (wt[n - 1] <= W) {
            int ans1 = val[n - 1] + recursion(val, wt, W - wt[n - 1], n - 1);
            int ans2 = recursion(val, wt, W, n - 1);
            return Math.max(ans1, ans2);
        } else {
            return recursion(val, wt, W, n - 1);
        }
    }

    public static int memoization(int val[], int wt[], int W, int n, int dp[][]) {
        if (W == 0 || n == 0) {
            return 0;
        }
        if (dp[n][W] != -1) {
            return dp[n][W];
        }
        if (wt[n - 1] <= W) {
            int ans1 = val[n - 1] + memoization(val, wt, W - wt[n - 1], n - 1, dp);
            int ans2 = memoization(val, wt, W, n - 1, dp);
            dp[n][W] = Math.max(ans1, ans2);
            return dp[n][W];
        } else {
            dp[n][W] = memoization(val, wt, W, n - 1, dp);
            return dp[n][W];
        }
    }

    public static int tabulation(int val[], int wt[], int W) {
        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];
        
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                int v = val[i - 1];
                int w = wt[i - 1];
                if (w <= j) {
                    dp[i][j] = Math.max(v + dp[i - 1][j - w], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][W];
    }
    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;
        int n = 5;
        System.out.println(recursion(val, wt, W, n));

        int dp[][] = new int[n + 1][W + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(memoization(val, wt, W, n, dp));
        System.out.println(tabulation(val, wt, W));
    }
}
