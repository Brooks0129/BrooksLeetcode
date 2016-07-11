package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/11.
 */
public class LC_Problem_34{
    public int[] searchRange(int[] nums,int target){
        int first=getFirst(nums,target);
        if(first==nums.length||nums[first]!=target){
            return new int[]{-1,-1};
        }
        int second=getFirst(nums,target+1)-1;
        return new int[]{first,second};
    }
    private int getFirst(int[] nums,int target){
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
