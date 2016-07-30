package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/30.
 */
public class LC_Problem_162{
    public int findPeakElement(int[] nums){
        if(nums==null||nums.length==0){
            return -1;
        }
        if(nums.length==1){
            return 0;
        }
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=(left+right)>>>1;
            if(mid==0){
                if(nums[0]>nums[1]){
                    return 0;
                }else{
                    left=mid+1;
                }
            }else if(mid==nums.length-1){
                if(nums[mid]>nums[mid-1]){
                    return mid;
                }else{
                    right=mid-1;
                }
            }else if(nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1]){
                return mid;
            }else if(nums[mid]>nums[mid-1]&&nums[mid]<nums[mid+1]){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }
}
