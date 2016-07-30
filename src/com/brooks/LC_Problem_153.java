package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/30.
 */
public class LC_Problem_153{
    public int findMin(int[] nums){
        int left=0;
        int right=nums.length-1;
        while(left<right){
            if(nums[left]<nums[right]){
                return nums[left];
            }
            int mid=(left+right)>>>1;
            if(nums[mid]>=nums[left]){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return nums[left];
    }
}
