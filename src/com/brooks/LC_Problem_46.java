package com.brooks;
import java.util.ArrayList;
import java.util.List;
/**
 * @author: 李松达
 * @date: 2016/7/3.
 */
public class LC_Problem_46{
    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> res=new ArrayList<>();
        permute(nums,res,0);
        return res;
    }
    private void permute(int[] nums,List<List<Integer>> res,int index){
        if(index>=nums.length){
            List<Integer> cur=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                cur.add(nums[i]);
            }
            res.add(cur);
            return;
        }
        for(int i=index;i<nums.length;i++){
            swap(nums,index,i);
            permute(nums,res,index+1);
            swap(nums,index,i);
        }
    }
    private void swap(int[] nums,int index,int i){
        if(index!=i){
            int temp=nums[i];
            nums[i]=nums[index];
            nums[index]=temp;
        }
    }
}
