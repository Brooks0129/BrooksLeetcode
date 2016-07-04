package com.brooks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author: 李松达
 * @time: 2016/7/4 9:51.
 * @description:
 */
public class LC_Problem_47{
    public static void main(String[] args){
        LC_Problem_47 lc_problem_47=new LC_Problem_47();
        List<List<Integer>> lists=lc_problem_47.permuteUnique(new int[]{2,2,1,1});
        for(List<Integer> cur : lists){
            for(int i : cur){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums){
        List<List<Integer>> res=new ArrayList<>();
        permute(nums,res,0);
        return res;
    }

    private void permute(int[] nums,List<List<Integer>> res,int index){
        if(index>=nums.length){
            List<Integer> cur=new ArrayList<>();
            for(int i : nums){
                cur.add(i);
            }
            res.add(cur);
            return;
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i=index;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                swap(nums,index,i);
                permute(nums,res,index+1);
                swap(nums,index,i);
            }

        }
    }

    private void swap(int[] nums,int index,int i){
        if(i==index)
            return;
        int temp=nums[index];
        nums[index]=nums[i];
        nums[i]=temp;
    }
}
