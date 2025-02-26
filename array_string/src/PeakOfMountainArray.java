/*
https://leetcode.com/problems/find-peak-element/description/
 */

public class PeakOfMountainArray {

    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};
        System.out.println(findPeakElement(arr));
    }

    public static int findPeakElement(int[] nums) {
        int ll = 0;
        int ul = nums.length -1;
        int mid = ll + (ul-ll)/2;

        while(ll < ul){

            if(mid == 0){
                return (nums[mid] > nums[ul])? mid: ul;
            }
            else if(mid == nums.length-1){
                return mid;
            }
            else{
                if(nums[mid] < nums[mid+1] && nums[mid+1]>nums[mid-1])
                    ll = mid+1;
                else if(nums[mid] < nums[mid-1] && nums[mid+1] <nums[mid-1] )
                    ul = mid - 1;
                else
                    return mid;
            }

            mid = (ul+ll)/2;

        }
        return mid;
    }
}
