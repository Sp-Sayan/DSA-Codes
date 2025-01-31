/*
    11. Container With Most Water   ( Medium)

You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.
Notice that you may not slant the container.

 */
package com.sayan;

import java.lang.*;

public class ContainerWIthMostWater {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3};
        System.out.println(maxArea(arr));
    }
    public static int maxArea(int[] height) {
        int startPos = 0;
        int start = 0;

        int end = 0;
        int endPos = height.length - 1;

        int maxArea= -1;
        int area;

        //System.out.println(Math.min(start,end));

        while(startPos < endPos){

            start = height[startPos];
            end = height[endPos];

//            System.out.print(start + " " + end);
            area = Math.min(start,end) * (endPos - startPos);


            if(area > maxArea){
                maxArea = area;
            }

            if(start < end){
                startPos++;
            }
            else if(end < start){
                endPos--;
            }
            else{
                startPos++;
                endPos--;
            }


        }

        return maxArea;
    }
}

