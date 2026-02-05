/*
https://leetcode.com/problems/trionic-array-i/?envType=daily-question&envId=2026-02-04
 */

public class TrionicOne {
    public boolean isTrionic(int[] nums) {

        boolean isDecreasing = true;
        int start = 0, end = nums.length-1;

        //for 1st increasing part
        while(start < nums.length-2 && nums[start] < nums[start+1]){
            start++;
        }
        //for the last increasing part
        while(end > start && nums[end] > nums[end-1]){
            end--;
        }
        //for decreasing part
        for(int i = start; i< end; i++){
            if(nums[i] <= nums[i+1]){
                isDecreasing = false;
                break;
            }
        }


        //start = 0, end = nums.length ----> decreasing array
        //start = nums.length, end = 0 ------> increasing array

        return isDecreasing && (start > 0 && start < end) && (end < nums.length-1 && end > start);

    }
}
