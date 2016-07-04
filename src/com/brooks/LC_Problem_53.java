package com.brooks;

/**
 * @author: 李松达
 * @time: 2016/7/4 16:51.
 * @description:
 */
public class LC_Problem_53{
    public int maxSubArray(int[] nums){
        if(nums==null){
            return Integer.MIN_VALUE;
        }

        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            dp[i]=dp[i-1]>=0?dp[i-1]+nums[i]:nums[i];
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<dp.length;i++){
            max=Math.max(max,dp[i]);
        }
        return max;
    }
}
