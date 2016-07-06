package com.brooks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: 李松达
 * @time: 2016/7/6 15:23.
 * @description:
 */
public class LC_Problem_78{
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        if(nums==null||nums.length==0){
            return res;
        }

        int total=1<<nums.length;
        for(int i=0;i<total;i++){
            List<Integer> set=new LinkedList<>();
            for(int j=0;j<nums.length;j++){
                if((i&(1<<j))!=0){
                    set.add(nums[j]);
                }
            }
            res.add(set);
        }
        return res;
    }


}
