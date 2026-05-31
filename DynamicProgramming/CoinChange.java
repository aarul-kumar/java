package DynamicProgramming;

public class CoinChange {
    public static int tabulation(int coins[], int sum) {
        int dp[][] = new int[coins.length + 1][sum + 1];

        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 1;
        }

        for (int j = 1; j < dp[0].length; j++) {
            dp[0][j] = 0;
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (coins[i - 1] <= j) {
                    dp[i][j] = dp[i][j - coins[i - 1]] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }
    public static void main(String[] args) {
        int coins[] = { 2, 5, 3, 6 };
        int sum = 10;
        System.out.println(tabulation(coins, sum));
    }
}
