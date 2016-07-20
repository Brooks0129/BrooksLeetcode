package com.brooks;
import java.util.Arrays;
/**
 * @author: 李松达
 * @date: 2016/7/20.
 */
public class LC_Problem_300{
    public int lengthOfLIS(int[] nums){
        int[] dp=new int[nums.length];
        int len=0;
        for(int x : nums){
            int index=Arrays.binarySearch(nums,0,nums.length,x);
            if(index<0){
                index=-index-1;
            }
            dp[index]=x;
            if(index==len)
                len++;
        }
        return len;
    }
}
