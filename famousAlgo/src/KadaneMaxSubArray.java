/*
https://leetcode.com/problems/maximum-subarray/
 */


public class KadaneMaxSubArray {
    public int maxSubArray(int[] nums) {

        //KADANE
        int currSum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            currSum += nums[i];
            max = (currSum> max)? currSum: max;
            if(currSum < 0)
                currSum = 0;
        }

        return max;
    }
}
