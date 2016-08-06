package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/8/6.
 */
public class LC_Problem_221{
    public int maximalSquare(char[][] matrix){
        if(matrix.length==0) return 0;
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] dp=new int[m+1][n+1];
        int max=0;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(matrix[i-1][j-1]=='1'){
                    dp[i][j]=Math.min(dp[i-1][j-1],Math.min(dp[i][j-1],dp[i-1][j]))+1;
                    max=Math.max(max,dp[i][j]);
                }
            }
        }
        return max*max;
    }
}
