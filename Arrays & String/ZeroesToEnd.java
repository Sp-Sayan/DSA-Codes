package com.sayan;


import java.util.List;

public class ZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {10,2,0,34,0,6,7,8,4,0,0,0,0,4,5,7,89,90,0,0,0,9,0,90,9,0};
       AdjustArr(arr);
    }
    public static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void AdjustArr(int[] nums) {
        int i,position=0,temp;
        for(i=0;i<nums.length;i++){
            if(nums[i] != 0){

                temp = nums[position];
                nums[position] = nums[i];
                nums[i] = temp;
                position++;
            }
        }
        for(i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
    }
}
