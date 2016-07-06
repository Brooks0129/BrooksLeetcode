package com.brooks;

/**
 * @author: 李松达
 * @time: 2016/7/6 8:48.
 * @description:
 */
public class LC_Problem_75{
    public static void main(String[] args){
        LC_Problem_75 lc_problem_75=new LC_Problem_75();
        lc_problem_75.sortColors(new int[]{1,2,0});
    }
    public void sortColors(int[] nums){
        int left=0;
        int right=nums.length-1;
        for(int i=0;i<=right;){
           switch(nums[i]){
               case 0:
                   swap(nums,i,left);
                   i++;
                   left++;
                   break;
               case 1:
                   i++;
                   break;
               case 2:
                   swap(nums,i,right);
                   right--;
           }
        }
    }

    private void swap(int[] nums,int i,int j){
        if(i==j)
            return;
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
