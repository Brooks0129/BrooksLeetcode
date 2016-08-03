package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/8/3.
 */
public class LC_Problem_174{
    public static void main(String[] args){
        int[][] dumgeon={{-3,5}};
        int minimumHP=calculateMinimumHP(dumgeon);
        System.out.println(minimumHP);
    }
    public static int calculateMinimumHP(int[][] dungeon){
        int m=dungeon.length;
        int n=dungeon[0].length;
        int[][] dp=new int[m][n];
        dp[m-1][n-1]=-dungeon[m-1][n-1];
        for(int i=m-2;i>=0;i--){
            dp[i][n-1]=(dp[i+1][n-1]>=0?dp[i+1][n-1]:0)-dungeon[i][n-1];
        }
        for(int i=n-2;i>=0;i--){
            dp[m-1][i]=(dp[m-1][i+1]>=0?dp[m-1][i+1]:0)-dungeon[m-1][i];
        }
        for(int i=m-2;i>=0;i--){
            for(int j=n-2;j>=0;j--){
                int min=Math.min(dp[i][j+1],dp[i+1][j]);
                dp[i][j]=(min>=0?min:0)-dungeon[i][j];
            }
        }
        return dp[0][0]<=0?1:(dp[0][0]+1);
    }
}
