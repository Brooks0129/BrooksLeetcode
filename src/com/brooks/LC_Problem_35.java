package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/11.
 */
public class LC_Problem_35{
    public int searchInsert(int[] nums, int target) {
        int low=0;
        int high=nums.length;
        while(low<high){
            int mid=(low+high)>>1;
            if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return low;
    }
}
