package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/8/4.
 */
public class LC_Problem_198{
    public int rob(int[] nums){
        int a=0;
        int b=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
               a=Math.max(a+nums[i],b);
            }else{
                b=Math.max(b+nums[i],a);
            }
        }
        return Math.max(a,b);
    }
}
