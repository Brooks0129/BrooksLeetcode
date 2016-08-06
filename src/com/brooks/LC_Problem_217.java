package com.brooks;
import java.util.HashSet;
import java.util.Set;
/**
 * @author: 李松达
 * @date: 2016/8/6.
 */
public class LC_Problem_217{
    public boolean containsDuplicate(int[] nums){
        if(nums==null||nums.length==0){
            return false;
        }

        Set<Integer> set=new HashSet<>();
        for(int num : nums){
            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }
}
