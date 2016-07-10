package com.brooks;
import java.util.HashMap;
/**
 * @author: 李松达
 * @date: 2016/7/10.
 */
public class LC_Problem_1{
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        if(nums==null||nums.length<2){
            return res;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                res[0]=map.get(target-nums[i]);
                res[1]=i;
                return res;
            }else{
                map.put(nums[i],i);
            }
        }
        return res;
    }
}
