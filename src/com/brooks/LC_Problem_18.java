package com.brooks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: 李松达
 * @time: 2016/7/11 12:09.
 * @description:
 */
public class LC_Problem_18{
    public List<List<Integer>> fourSum(int[] nums,int target) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        if (nums==null||nums.length<4) {
            return res;
        }
        Arrays.sort(nums);
        for (int i=0;i<nums.length-3;) {
            for (int j=i+1;j<nums.length-2; ) {
                int left=j+1;
                int right=nums.length-1;
                while(left<right){
                    int sum=nums[i]+nums[j]+nums[left]+nums[right];
                    if (sum==target) {
                        res.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        while(nums[left++]==nums[left]&&left<right);
                        while(nums[right--]==nums[right]&&left<right);
                    }
                    if (sum<target) {
                        while(nums[left++]==nums[left]&&left<right){}
                    }
                    if (sum>target) {
                        while(nums[right--]==nums[right]&&left<right){}
                    }
                }
                while(nums[j++]==nums[j]&&j<nums.length-2){

                }

            }
            while(nums[i++]==nums[i]&&i<nums.length-3){

            }
        }
        return res;
    }
}
