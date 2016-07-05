package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/5.
 */
public class LC_Problem_63{
    public static void main(String[] args){
        LC_Problem_63 lc_problem_63=new LC_Problem_63();
        int pathsWithObstacles=
                lc_problem_63.uniquePathsWithObstacles(new int[][]{{0,1}});
        System.out.println(pathsWithObstacles);
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid){
        int[][] dp=new int[obstacleGrid.length][obstacleGrid[0].length];
        dp[0][0]=obstacleGrid[0][0]==1?0:1;
        for(int i=1;i<obstacleGrid.length;i++){
            dp[i][0]=obstacleGrid[i][0]==1?0:dp[i-1][0];
        }
        for(int i=1;i<obstacleGrid[0].length;i++){
            dp[0][i]=obstacleGrid[0][i]==1?0:dp[0][i-1];
        }
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(obstacleGrid[i][j]==1){
                    dp[i][j]=0;
                }else{
                    dp[i][j]=dp[i][j-1]+dp[i-1][j];
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
