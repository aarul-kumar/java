package DynamicProgramming;
import java.util.Arrays;
import java.util.HashSet;

public class LongestIncreasingSubsequence {
    public static int tabulation(int arr[]) {
        HashSet<Integer> hs = new HashSet<>();
        
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }

        int arr2[] = new int[hs.size()];
        int i = 0;
        for (int num : hs) {
            arr2[i] = num;
            i++;
        }

        Arrays.sort(arr2);

        int n = arr.length;
        int m = arr2.length;
        int dp[][] = new int[n + 1][m + 1];
        
        for (int j = 1; j < n+1; j++) {
            for (int k = 1; k < m+1; k++) {
                if (arr[j - 1] == arr2[k - 1]) {
                    dp[j][k] = dp[j - 1][k - 1] + 1;
                } else {
                    dp[j][k] = Math.max(dp[j - 1][k], dp[j][k - 1]);
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        int arr[] = { 50, 3, 10, 7, 40, 80 };
        System.out.println(tabulation(arr));
    }
}
