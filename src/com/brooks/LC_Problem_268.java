package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/17.
 */
public class LC_Problem_268{
    public int missingNumber(int[] nums){
        int res=0;
        for(int i=0;i<nums.length;i++){
            res=res^i^nums[i];
        }
        return res^nums.length;
    }
}
