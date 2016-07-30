package com.brooks;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
/**
 * @author: 李松达
 * @date: 2016/7/30.
 */
public class LC_Problem_349{
    public int[] intersection(int[] nums1,int[] nums2){
        Set<Integer> set=new HashSet<>();
        for(int i : nums1){
            set.add(i);
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int i : nums2){
            if(set.contains(i)){
                res.add(i);
                set.remove(i);
            }
        }
        int[] nums=new int[res.size()];
        for(int i=0;i<nums.length;i++){
            nums[i]=res.get(i);
        }
        return nums;
    }
}
