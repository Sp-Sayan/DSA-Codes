/*
 * https://leetcode.com/problems/maximum-subarray/
 */

public class MaxSubArraySum {

    public static void kadaneSum(int[] nums) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            maxSum = currSum > maxSum ? currSum : maxSum;
            currSum = currSum < 0 ? 0 : currSum;
        }
        System.out.println("Kadane: " + maxSum);
    }

    // PREFIX SUM TC - O(n^2)
    public static void calcMaxSumPrefix(int[] nums) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int[] prefix = new int[nums.length];

        prefix[0] = nums[0];

        // calculating the prefix array
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = i; j < nums.length; j++) {
                int end = j;
                // finding subarray sum using prefix array
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                maxSum = currSum > maxSum ? currSum : maxSum;
            }

        }
        System.out.println("prefix: " + maxSum);
    }

    public static void main(String[] args) {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        calcMaxSumPrefix(arr);
        kadaneSum(arr);
    }
}