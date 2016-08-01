package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/8/1.
 */
public class LC_Problem_154{
    public int findMin(int[] nums){
        int left=0;
        int right=nums.length-1;
        while(left<right){
            if(nums[left]<nums[right]){
                return nums[left];
            }
            int mid=(right+left)>>>1;
            if(nums[mid]>nums[left]){
                left=mid+1;
            }else if(nums[mid]<nums[left]){
                right=mid;
            }else{
                left++;
            }
        }
        return nums[left];
    }
}

