package com.brooks;

import java.util.Arrays;

/**
 * @author: 李松达
 * @time: 2016/7/11 12:09.
 * @description:
 */
public class LC_Problem_16{
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res=Integer.MAX_VALUE;
        int ret=0;
        for(int i=0;i<nums.length;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int abs=Math.abs(nums[i]+nums[left]+nums[right]-target);
                if(abs==0){
                    return target;
                }else{
                    if(abs<res){
                        res=abs;
                        ret=nums[i]+nums[left]+nums[right];
                    }
                    if(nums[i]+nums[left]+nums[right]<target){
                        left++;
                    }else{right--;}
                }
            }
        }
        return ret;
    }
}
