package Arrays;

public class MaxSubArraySum {
    public static int maxSubArraySum_bruteForce(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                currSum = 0;
                for(int k=i; k<=j; k++) {
                    currSum += arr[k];
                    maxSum = Math.max(maxSum, currSum);
                }
            }
        }
        return maxSum;
    }

    public static int maxSubArraySum_prefixArray(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1; i<prefix.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
            for(int j=0; j<prefix.length; j++) {
                int start = j;
                for(int k=j; k<prefix.length; k++) {
                    int end = k;
                    currSum = j == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                    maxSum = Math.max(maxSum, currSum);
                }
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(maxSubArraySum_prefixArray(arr));
    }
}
