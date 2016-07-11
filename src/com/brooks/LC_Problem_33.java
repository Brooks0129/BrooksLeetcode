package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/11.
 */
public class LC_Problem_33{
    public int search(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>=nums[low]){
                if(nums[low]<=target&&target<nums[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else{
                if(target<=nums[high]&&target>nums[mid]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}
