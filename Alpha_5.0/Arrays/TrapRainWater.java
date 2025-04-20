/*
 * https://leetcode.com/problems/trapping-rain-water/description/
 */

public class TrapRainWater {

    public static int trap(int[] heights) {

        int total = 0;
        int len = heights.length;

        // calculate leftMax
        int[] leftMax = new int[len];
        leftMax[0] = heights[0];
        for (int i = 1; i < leftMax.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], heights[i]);
        }

        // calculate rightMax
        int[] rightMax = new int[len];
        rightMax[len - 1] = heights[len - 1];
        for (int i = len - 2; i > -1; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], heights[i]);
        }

        // water trapped for each block
        for (int i = 0; i < len; i++) {
            int wtlvl = Math.min(leftMax[i], rightMax[i]);
            total += wtlvl - heights[i];
        }

        return total;
    }

    public static void main(String[] args) {
        int[] heights = { 4, 2, 0, 6, 3, 2, 7 };
        System.out.println(trap(heights));
    }

}
