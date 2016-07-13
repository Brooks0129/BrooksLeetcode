package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/13.
 */
public class LC_Problem_115{
    public int numDistinct(String s, String t) {
        int sLen=s.length();
        int tLen=t.length();
        int[][] dp=new int[sLen+1][tLen+1];
        for(int i=0;i<=sLen;i++){
            dp[i][0]=1;
        }
        for(int i=0;i<sLen;i++){
            for(int j=0;j<tLen;j++){
                if(s.charAt(i)==t.charAt(j)){
                    dp[i+1][j+1]=dp[i][j]+dp[i][j+1];
                }else {
                    dp[i+1][j+1]=dp[i][j+1];
                }
            }
        }
        return dp[sLen][tLen];
    }
}
