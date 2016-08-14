package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/8/14.
 */
public class LC_Problem_312{
    public static void main(String[] args){
        int maxCoins=new LC_Problem_312().maxCoins(new int[]{3,1,5,8});
        System.out.println(maxCoins);
    }
    public int maxCoins(int[] nums){
        int[] arrs=new int[nums.length+2];
        arrs[0]=1;
        arrs[arrs.length-1]=1;
        for(int i=1;i<arrs.length-1;i++){
            arrs[i]=nums[i-1];
        }
        int len=arrs.length;
        int[][] dp=new int[len][len];
        for(int k=2;k<len;k++){
            for(int left=0;left<len-k;left++){
                int right=left+k;
                for(int i=left+1;i<right;i++){
                    dp[left][right]=Math.max(dp[left][right],
                            arrs[left]*arrs[i]*arrs[right]+dp[left][i]+dp[i][right]);
                }
            }
        }
        return dp[0][len-1];
    }
}
