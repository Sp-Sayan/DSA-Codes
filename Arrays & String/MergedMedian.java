package com.sayan;

public class MergedMedian {

    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        findMedianSortedArrays(nums1,nums2);
    }

    public static void findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int ll=0,ul=0;
        if((m+n)%2 != 0){
            ll = (m+n+1)/2;
        }
        else{
            ll = (m+n)/2;
            ul = ll + 1;
        }
        int i= (m+n)- 1;
        int[] merged = new int[m+n];
        m--; n--;
        while(m>-1 || n>-1){
            if(m>-1 && n>-1){
                if(nums1[m] > nums2[n]){
                    merged[i] = nums1[m];
                    m--; i--;
                }
                if(nums1[m] < nums2[n]) {
                    merged[i] = nums2[n];
                    n--;
                    i--;
                }
                else{
                    merged[i] = nums1[m];
                    i--;
                    merged[i] = nums2[n];
                    n--; m--;
                    i--;
                }

            }
            else{
                if(m < 0 && n>-1){
                    merged[i] = nums2[n];
                    i--;
                    n--;
                }
                if(n < 0 && m>-1){
                    merged[i] = nums1[m];
                    i--;
                    m--;
                }
            }
        }
        for(i=0;i<merged.length;i++){
            System.out.print(merged[i] + " ");
        }

        if((merged.length)%2 != 0){
            System.out.println(merged[ll-1]);;
        }
        else
        {
            System.out.println((double)(merged[ll-1] + merged[ul-1])/2);;
        }


    }


}
