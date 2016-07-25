package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/25.
 */
public class LC_Problem_135{
    public static void main(String[] args){
        int candy=candy(new int[]{1,2});
        System.out.println(candy);
    }
    public static int candy(int[] ratings){
        int[] nums=new int[ratings.length];
        nums[0]=1;
        for(int i=1;i<nums.length;i++){
            nums[i]=ratings[i]>ratings[i-1]?nums[i-1]+1:1;
        }
        for(int i=nums.length-1;i>0;i--){
            nums[i-1]=ratings[i-1]>ratings[i]?Math.max(nums[i]+1,nums[i-1]):nums[i-1];
        }
        int res=0;
        for(int i : nums){
            res+=i;
        }
        return res;
    }
}
