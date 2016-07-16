package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/16.
 */
public class LC_Problem_239{
    public static void main(String[] args){
        LC_Problem_239 lc_problem_239=new LC_Problem_239();
        int[] ints=lc_problem_239.maxSlidingWindow(new int[]{2,1,3,4,6,3,8,9,10,12,56},4);
        for(int i:ints){
            System.out.println(i);
        }
    }
    public int[] maxSlidingWindow(int[] nums,int k){
        if(nums==null){
            return null;
        }
        if(nums.length==0){
            return new int[]{};
        }
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        left[0]=nums[0];
        right[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            left[i]=(i%k==0)?nums[i]:Math.max(nums[i],left[i-1]);
            int j=nums.length-1-i;
            right[j]=(j%k==0)?nums[j]:Math.max(nums[j],right[j+1]);
        }
        int[] slide=new int[nums.length-k+1];
        for(int i=0;i<slide.length;i++){
            slide[i]=Math.max(right[i],left[i+k-1]);
        }
        return slide;
    }
}
