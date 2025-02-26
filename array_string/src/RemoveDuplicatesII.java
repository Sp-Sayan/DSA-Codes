/*
https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/?envType=study-plan-v2&envId=top-interview-150
 */


public class RemoveDuplicatesII {
    public static int removeDuplicates(int[] nums) {
        int lastUnique = nums[0];
        int count = 1,pos = 1;
        //start from 2nd element
        for(int i = 1;i<nums.length;i++){
            //check to overwrite one element at max twice
            if(nums[i] == lastUnique && count<2){
                nums[pos] = nums[i];
                pos++;
                count++;
            }
            //if element is not same as last element move new element to nums[pos]
            else if(nums[i] != lastUnique){
                nums[pos] = nums[i];
                pos++;
                count = 1;
                lastUnique = nums[i];
            }

        }
        return pos;
    }
}
