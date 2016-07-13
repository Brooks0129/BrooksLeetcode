package com.brooks;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
/**
 * @author: 李松达
 * @date: 2016/7/13.
 */
public class LC_Problem_90{
    public static void main(String[] args){
        LC_Problem_90 lc=new LC_Problem_90();
        List<List<Integer>> lists=lc.subsetsWithDup(new int[]{1,2,2});
        System.out.println(lists.toString());
    }
    public List<List<Integer>> subsetsWithDup(int[] nums){
        List<List<Integer>> res=new LinkedList<>();
        res.add(new LinkedList<>());
        Arrays.sort(nums);
        for(int i=0;i<nums.length;){
            int count=0;
            while(count+i<nums.length&&nums[i]==nums[i+count]){
                count++;
            }
            int size=res.size();
            for(int j=0;j<size;j++){
                List<Integer> cur=new LinkedList<>(res.get(j));
                System.out.println(res.get(i).toString());
                for(int k=0;k<count;k++){
                    cur.add(nums[i]);
                    res.add(new LinkedList<>(cur));
                }
            }
            i+=count;
        }
        return res;
    }
}
