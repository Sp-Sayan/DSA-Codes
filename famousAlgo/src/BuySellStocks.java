/*
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */

public class BuySellStocks {
    public int maxProfit(int[] nums) {

        int buy = nums[0];
        int profit = 0;

        for(int i = 1;i<nums.length;i++){
            int cost = nums[i]- buy;
            profit = (cost>profit)? cost: profit;
            buy = (nums[i]<buy)? nums[i]: buy;
        }

        return profit;




    }
}
