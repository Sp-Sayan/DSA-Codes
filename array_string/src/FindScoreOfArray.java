/*
https://leetcode.com/problems/find-score-of-an-array-after-marking-all-elements/?envType=daily-question&envId=2024-12-13
 */


public class FindScoreOfArray {

    //TLE EXCEEDED
    public long findScore(int[] nums) {
        long score = 0;
        int idx = -1,max = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++){
            //System.out.println("i " + i);

            idx = findSmallest(nums);
            //System.out.println("idx " + idx);
            if(nums[idx] != max)
                score += nums[idx];
            nums[idx] = max;
            if(idx == 0)
                nums[idx+1] = max;
            else if(idx == nums.length-1)
                nums[idx-1] = max;
            else{
                nums[idx+1] = max;
                nums[idx-1] = max;
            }

        }
        return score;
    }
    public int findSmallest(int[] nums){
        //System.out.println(Arrays.toString(nums));
        int start =0;
        int end = nums.length-1;
        while(start <= end){
            if(nums[start] < nums[end])
                end--;
            else if(nums[start]> nums[end])
                start++;
            else
                end--;

            if(start == end)
                return start;
        }
        return -1;
    }
}
