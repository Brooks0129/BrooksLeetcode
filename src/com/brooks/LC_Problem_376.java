package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/26.
 */
public class LC_Problem_376{
    public int wiggleMaxLength(int[] nums){
        if(nums==null||nums.length==0){
            return 0;
        }
        int p=1;
        int q=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                p=q+1;
            }else if(nums[i]<nums[i-1]){
                q=p+1;
            }
        }
        return p>q?p:q;
    }
}
