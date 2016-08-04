package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/8/4.
 */
public class LC_Problem_188{
    public static void main(String[] args){
        int[] prices={3,2,6,5,0,3};
        int maxProfit=maxProfit(2,prices);
        System.out.println(maxProfit);
    }
    public static int maxProfit(int k,int[] prices){
        int n=prices.length;
        if(n<=1){
            return 0;
        }
        if(k>=n/2){
            int max=0;
            for(int i=1;i<prices.length;i++){
                max+=prices[i]>prices[i-1]?(prices[i]-prices[i-1]):0;
            }
            return max;
        }
        /**
         * dp[i, j] represents the max profit up until prices[j] using at most i transactions.
         * dp[i, j] = max(dp[i, j-1], prices[j] - prices[jj] + dp[i-1, jj]) { jj in range of [0, j-1] }
         *          = max(dp[i, j-1], prices[j] + max(dp[i-1, jj] - prices[jj]))
         * dp[0, j] = 0; 0 transactions makes 0 profit
         * dp[i, 0] = 0; if there is only one price data point you can't make any transaction.
         */
        int[][] dp=new int[k+1][n];
        for(int i=1;i<=k;i++){
            int localMax=-prices[0];
            for(int j=1;j<n;j++){
                dp[i][j]=Math.max(dp[i][j-1],prices[j]+localMax);
                localMax=Math.max(localMax,dp[i-1][j]-prices[j]);
            }
        }
        return dp[k][n-1];
    }
}
