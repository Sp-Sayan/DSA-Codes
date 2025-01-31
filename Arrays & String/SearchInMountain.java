/*
https://leetcode.com/problems/find-in-mountain-array/description/
 */

package com.sayan;

public class SearchInMountain {

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(mountain(arr,0));
    }

    public static int mountain(int[] arr, int target){
        int peakIdx = findPeakElement(arr);
        int targetIdx = -1;
        boolean found = false;
        //System.out.println(peakIdx);

        int ll = 0;
        int ul = peakIdx;
        int mid = ll + (ul-ll)/2;

        //ascending part
        while(ll <= ul){
            if(arr[mid]<target)
                ll = mid+1;
            else if(arr[mid]>target)
                ul = mid-1;
            else {
                targetIdx = mid;
                found = true;
                break;
            }
            mid = (ul+ll)/2;
        }
        //System.out.println(targetIdx);
        //descending part

            if(!found){
                ll = peakIdx;
                ul = arr.length-1;
                mid = ll + (ul-ll)/2;
                while(ll <=ul){
                    if(arr[mid]>target)
                        ll = mid+1;
                    else if(arr[mid]<target)
                        ul = mid-1;
                    else {
                        targetIdx = mid;
                        break;
                    }
                    mid = (ul+ll)/2;
                }
            }


        return targetIdx;
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
