package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/8/5.
 */
public class LC_Problem_213{
    public int rob(int[] nums){
        if(nums==null||nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        int a=0, b=0;
        for(int i=0;i<nums.length-1;i++){
            if(i%2==0){
                a=Math.max(a+nums[i],b);
            }else{
                b=Math.max(b+nums[i],a);
            }
        }
        int max=Math.max(a,b);
        a=b=0;
        for(int i=1;i<nums.length;i++){
            if(i%2==0){
                a=Math.max(a+nums[i],b);
            }else{
                b=Math.max(b+nums[i],a);
            }
        }
        return Math.max(max,Math.max(a,b));
    }
}
