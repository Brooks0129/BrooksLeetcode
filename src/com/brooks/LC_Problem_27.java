package com.brooks;

/**
 * @author: 李松达
 * @time: 2016/7/11 13:15.
 * @description:
 */
public class LC_Problem_27{
    public int removeElement(int[] nums, int val) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=val){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
}
