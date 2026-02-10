import java.util.Arrays;

public class KnapsackZeroOne {


    public static void main(String[] args) {
        int[] val = {15,14, 10, 45, 30};
        int[] wt = {2,5, 1, 3, 4};
        int W = 7;

        System.out.println(checkItems(W, val, wt, val.length));

        //memoization
        int[][] dp = new int[val.length+1][W+1];

        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        System.out.println(checkItemsMemo(W, val, wt,dp, val.length));

    }

    public static int checkItems(int W, int val[], int wt[], int n){

        //base case
        if(n == 0 || W == 0)
            return 0;

        //check for valid item
        if(wt[n-1] <= W){

            //include
            int include = val[n-1] + checkItems(W- wt[n-1], val, wt, n-1);

            //exclude
            int exclude = checkItems(W, val,wt, n-1);

            return Math.max(include, exclude);

        } else {
            //Not valid
            return checkItems(W, val,wt, n-1);
        }

    }

    //MEMOIZATION
    public static int checkItemsMemo(int W, int val[], int wt[], int[][] dp, int n){
        //base case
        if(n == 0 || W == 0)
            return 0;


        if(dp[n][W] != -1)
            return dp[n][W];

        //check for valid item
        if(wt[n-1] <= W){

            //include
            int include = val[n-1] + checkItemsMemo(W- wt[n-1], val, wt, dp, n-1);

            //exclude
            int exclude = checkItemsMemo(W, val,wt,dp, n-1);
            //memoize
            dp[n][W] = Math.max(include, exclude);

            return dp[n][W];

        } else {
            //Not valid
            dp[n][W] = checkItemsMemo(W, val,wt,dp, n-1);
            return dp[n][W];
        }
    }
}
