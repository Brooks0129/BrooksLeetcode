package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/4.
 */
public class LC_Problem_55{
    public boolean canJump(int[] nums){
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(i>max){
                return false;
            }else{
                max=Math.max(max,nums[i]+i);
            }
        }
        return true;
    }
}