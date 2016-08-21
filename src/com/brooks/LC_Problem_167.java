package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/8/21.
 */
public class LC_Problem_167{
    public int[] twoSum(int[] numbers,int target){
        int l=0;
        int r=numbers.length-1;
        while(l<r){
            int sum=numbers[l]+numbers[r];
            if(sum==target){
                return new int[]{l,r};
            }else if(sum<target){
                l++;
            }else{
                r--;
            }
        }
        return new int[]{0,0};
    }
}
