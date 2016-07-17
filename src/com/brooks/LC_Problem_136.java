package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/17.
 */
public class LC_Problem_136{
    public int singleNumber(int[] nums){
        int res=0;
        for(int i=0;i<nums.length;i++){
            res^=nums[i];
        }
        return res;
    }
}
