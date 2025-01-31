/*
Find ceiling of TARGET element from array
ceiling = smallest element >= target
 */


package com.sayan;

public class Ceiling {


    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        System.out.println(ceil(arr,10));
    }

    public static int ceil(int[] nums, int target){

        int ll = 0;
        int ul = nums.length - 1;
        int mid = ll + (ul-ll)/2;

        while(ll <= ul){

            if(target > nums[mid])
                ll = mid+1;
            else if(target < nums[mid])
                ul = mid -1;
            else
                return nums[mid];

            mid = (ul+ll)/2;
        }

        if(nums[mid] > target || mid == nums.length-1)
            return nums[mid];
        else
            return nums[mid+1];




    }
}
