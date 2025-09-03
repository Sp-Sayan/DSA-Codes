/*
https://leetcode.com/problems/largest-rectangle-in-histogram/
 */

import java.util.Stack;

//TC - O(N)
public class LargestAreaHistogram {
    public int largestRectangleArea(int[] heights) {

        //store idx of prev and next smaller element
        int[] prevSmaller = new int[heights.length];
        int[] nextSmaller = new int[heights.length];
        Stack<Integer> stack = new Stack<>();

        //prev smaller
        for(int i = 0; i< heights.length;i++){


            while(!stack.isEmpty() && heights[i] <= heights[stack.peek()]){
                stack.pop();
            }

            prevSmaller[i] = (stack.isEmpty()) ? -1 : stack.peek();

            stack.push(i);
        }

        //System.out.println(Arrays.toString(prevSmaller));

        //next smaller
        stack.clear();
        for(int i = heights.length-1; i> -1;i--){


            while(!stack.isEmpty() && heights[i] <= heights[stack.peek()]){
                stack.pop();
            }

            nextSmaller[i] = (stack.isEmpty())
                    ? heights.length //heights.length in order to get width accurate since no smaller element exists on right mean the height will be equal to current
                    : stack.peek();


            stack.push(i);
        }

        //System.out.println(Arrays.toString(nextSmaller));

        //check for max area
        int area = 0;
        int maxArea = 0;
        for(int i = 0; i< heights.length; i++){
            area = heights[i] * (nextSmaller[i] - prevSmaller[i] -1);
            maxArea = Math.max(area, maxArea);
        }

        return maxArea;
    }
}
