package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/2.
 */
public class LC_Problem_41{
    public static void main(String[] args){
        LC_Problem_41 lc=new LC_Problem_41();
        int index=lc.firstMissingPositive(new int[]{4,3,1,-1});
        System.out.println(index);
    }
    public int firstMissingPositive(int[] nums){
        if(nums==null||nums.length==0){
            return 1;
        }
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                if(index!=i){
                    swap(nums,i,index);
                }
                index++;
            }
        }
        int result=index+1;
        for(int i=0;i<index;i++){
            int temp=Math.abs(nums[i]);
            if(temp<result)
            nums[temp-1]=nums[temp-1]>0?(-nums[temp-1]):nums[temp-1];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                result=i+1;
                break;
            }
        }
        return result;
    }
    private void swap(int[] nums,int left,int right){
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }
}
