package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/17.
 */
public class LC_Problem_137{
    public static void main(String[] args){
        int[] nums=new int[]{9,9,9};
        int i=singleNumber(nums);
        System.out.println(i);
    }
    public static int singleNumber(int[] nums){
            int ones = 0, twos = 0;
            for(int i = 0; i < nums.length; i++){
                ones = (ones ^ nums[i]) & ~twos;
                twos = (twos ^ nums[i]) & ~ones;
            }
            return ones|twos;
    }
}
