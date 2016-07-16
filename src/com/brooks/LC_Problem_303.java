package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/16.
 */
public class LC_Problem_303{
    class NumArray{
        int[] sumRegion;
        public NumArray(int[] nums){
            sumRegion=new int[nums.length+1];
            for(int i=0;i<nums.length;i++){
                sumRegion[i+1]=sumRegion[i]+nums[i];
            }
        }
        public int sumRange(int i,int j){
            return sumRegion[j+1]-sumRegion[i];
        }
    }
}
