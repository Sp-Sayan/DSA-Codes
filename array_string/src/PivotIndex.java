/*
https://leetcode.com/problems/find-pivot-index/
 */

public class PivotIndex {
    public int pivotIndex(int[] nums) {


        int leftSum = 0;
        int rightSum = 0;

        //find sum of all elements
        for(int i = 0;i<nums.length;i++)
            rightSum += nums[i];

        //searching for pivot
        for(int i = 0; i< nums.length;i++){

            rightSum -= nums[i];        //we subtract the current element from rightsum to get the sum of right elements

            if(leftSum == rightSum)
                return i;

            leftSum += nums[i];         //we add the current element from leftsum to get the sum of left elements

        }

        return -1;
    }
}
