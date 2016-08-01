package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/8/1.
 */
public class LC_Problem_152{
    public int maxProduct(int[] nums){
        if(nums==null||nums.length==0){
            return 0;
        }
        int max=nums[0];
        int min=nums[0];
        int res=nums[0];
        for(int i=1;i<nums.length;i++){
            int n1=nums[i]*max;
            int n2=nums[i]*min;
            max=Math.max(nums[i],Math.max(n1,n2));
            min=Math.min(nums[i],Math.min(n1,n2));
            res=Math.max(res,max);
        }
        return res;
    }
}
