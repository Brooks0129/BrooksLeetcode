package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/8/7.
 */
public class LC_Problem_238{
    public int[] productExceptSelf(int[] nums){
        int[] l2r=getL2R(nums);
        int[] r2l=getR2L(nums);
        int[] res=new int[nums.length];
        res[0]=r2l[1];
        res[nums.length-1]=l2r[nums.length-2];
        for(int i=1;i<nums.length-1;i++){
            res[i]=l2r[i-1]*r2l[i+1];
        }
        return res;
    }
    private int[] getR2L(int[] nums){
        int[] r2l=new int[nums.length];
        r2l[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            r2l[i]=r2l[i+1]*nums[i];
        }
        return r2l;
    }
    private int[] getL2R(int[] nums){
        int[] l2r=new int[nums.length];
        l2r[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            l2r[i]=l2r[i-1]*nums[i];
        }
        return l2r;
    }
}
