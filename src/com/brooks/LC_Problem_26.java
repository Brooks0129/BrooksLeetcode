package com.brooks;

/**
 * @author: 李松达
 * @time: 2016/7/11 13:15.
 * @description:
 */
public class LC_Problem_26{
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}
