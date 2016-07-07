package com.brooks;


/**
 * @author: 李松达
 * @time: 2016/7/7 8:54.
 * @description:
 */
public class LC_Problem_81{
	public boolean search(int[] nums, int target) {
        if (nums==null||nums.length==0) {
        	return false;
        }
        int left=0;
        int right=nums.length-1;
        while(left<right){
        	int mid=(left+right)>>1;
        	if (nums[mid]==target) {
        		return true;
        	}
        	if (nums[mid]>nums[right]) {
        		if (target>=nums[left]&&target<nums[mid]) {
        			right=mid-1;
        		}else {
        			left=mid+1;
        		}
        	}else if (nums[mid]<nums[right]) {
        		if (target>nums[mid]&&target<=nums[right]) {
        			left=mid+1;
        		}else {
        			right=mid-1;
        		}
        	}else {
        		right--;
        	}

        }
        return nums[left]==target;
    }
}

