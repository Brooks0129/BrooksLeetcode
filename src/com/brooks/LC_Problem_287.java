package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/16.
 */
public class LC_Problem_287{
/*    public static void main(String[] args){
        int[] nums=new int[]{1,3,4,2,2};
        int duplicate=findDuplicate(nums);
        System.out.println(duplicate);
    }*/
    public  int findDuplicate(int[] nums){
        int fast=0;
        int slow=0;
        do{
            fast=nums[nums[fast]];
            slow=nums[slow];
        }while(slow!=fast);
        fast=0;
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return fast;
    }
}
