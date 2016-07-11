package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/11.
 */
public class LC_Problem_31{
    public void nextPermutation(int[] nums) {
        //1 2 3 5 4->1 2 4 3 5
        //1 2 3 6 5 7 4
        if(nums==null||nums.length<=1){
            return ;
        }
        int index=nums.length-1;
        for(;index>0;index--){
            if(nums[index]>nums[index-1]){
                break;
            }
        }
        if(index==0){
            reverse(nums,0,nums.length-1);
            return ;
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]>nums[index-1]){
                swap(nums,index-1,i);
                break;
            }
        }
        reverse(nums,index,nums.length-1);
    }
    private void reverse(int[] nums,int left,int right){
        while(left<right){
            swap(nums,left,right);
            left++;
            right--;
        }
    }
    private void swap(int[] nums,int left,int right){
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }
}
