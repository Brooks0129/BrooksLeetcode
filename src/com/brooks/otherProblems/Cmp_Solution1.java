package com.brooks.otherProblems;
/**
 * @author: 李松达
 * @date: 2016/7/27.
 * @description:
 * 解法一：
 * 使用一个二维数组dp，dp[i][j]为1表示下标为i的数大于下标为j的数，-1表示小于，0表示无法比较
 * dp数组的大小的选取：遍历一遍records找到其中出现的最大的下标
 */
public class Cmp_Solution1{
    public int cmp(int g1,int g2,int[][] records,int n){
        // write code here
        int len=0;
        for(int i=0;i<records.length;i++){
            len=Math.max(len,Math.max(records[i][0],records[i][1]));
        }
        int[][] dp=new int[len+1][len+1];
        for(int i=0;i<n;i++){
            int a=records[i][0];
            int b=records[i][1];
            dp[a][b]=1;
            dp[b][a]=-1;
            for(int j=0;j<len+1;j++){
                if(dp[j][a]==1){
                    dp[j][b]=1;
                    dp[b][j]=-1;
                }
                if(dp[b][j]==1){
                    dp[a][j]=1;
                    dp[j][a]=-1;
                }
            }
        }
        return dp[g1][g2];
    }
}