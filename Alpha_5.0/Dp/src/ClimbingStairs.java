/*
https://leetcode.com/problems/climbing-stairs/
 */

public class ClimbingStairs {
    public static void main(String[] args){
        int n = 5;
        int[] dp = new int[n+1];
        //memoize
        int count  = stepCount(n, dp);
        System.out.println(count);

        //tabulation
        int count2 = tabulation(n);
        System.out.println(count2);
    }

    private static int stepCount(int n, int[] dp){
        if(n < 0)
            return 0;

        if(n == 0)
            return 1;

        if(dp[n] != 0)
            return dp[n];

        //memoize
        dp[n] = stepCount(n-1, dp) + stepCount(n-2, dp);

        return dp[n];

    }

    private static int tabulation(int n){
        //table -> every index indicates the no. of stairs to climb
        int[] dp = new int[n+1];
        //initialize --> 0th index means the required stair is reached
        dp[0] = 1;

        for(int i = 1; i<= n; i++){
            dp[i] = dp[i-1] + ((i-2 < 0) ? 0: dp[i-2]);
        }
        return dp[n];
    }


}
