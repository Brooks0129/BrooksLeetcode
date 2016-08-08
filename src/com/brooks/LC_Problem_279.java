package com.brooks;
import java.util.Arrays;
/**
 * @author: 李松达
 * @date: 2016/8/8.
 */
public class LC_Problem_279{
    public int numSquares(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,1,n+1,Integer.MAX_VALUE);
        for(int i=1;i<=n;i++){
            int j=1;
            while(i-j*j>=0){
                dp[i]=Math.min(dp[i],dp[i-j*j]+1);
            }
        }
        return dp[n];
    }
}
