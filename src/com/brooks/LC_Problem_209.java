package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/8/5.
 */
public class LC_Problem_209{
    public int minSubArrayLen(int s,int[] nums){
        int i=0, j=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        while(j<nums.length){
            sum+=nums[j++];
            while(sum>=s){
                min=Math.min(min,j-i);
                sum-=nums[i++];
            }
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}
