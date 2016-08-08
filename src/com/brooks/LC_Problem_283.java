package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/8/8.
 */
public class LC_Problem_283{
    public void moveZeroes(int[] nums){
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                swap(nums,i,j++);
            }
        }
    }
    private void swap(int[] nums,int i,int j){
        if(i==j){
            return;
        }
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
