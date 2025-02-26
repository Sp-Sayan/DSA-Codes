/*
https://leetcode.com/problems/find-in-mountain-array/description/
 */

public class SearchInRotatedSortedArray {

    public static void main(String[] args) {
        int[] arr = {3,1};
        System.out.println(mountain(arr,1));
    }

    public static int mountain(int[] nums, int target){
        int ll = 0;
        int ul = nums.length-1;
        int mid = ll+(ul-ll)/2;

        while(ll<=ul){
            if(nums[mid] == target) return mid;
            else if(nums[mid]>=nums[ll]){                   //if left part is sorted
                if(target >= nums[ll] && target < nums[mid])    //to check whether the target is on the left side of mid
                    ul = mid-1;
                else
                    ll = mid+1;
            }
            else{                                           //if right part is sorted
                if(target <= nums[ul] && target > nums[mid])
                    ll = mid+1;
                else
                    ul =mid-1;
            }
            mid = ll+(ul-ll)/2;
        }
        return -1;
    }


}
