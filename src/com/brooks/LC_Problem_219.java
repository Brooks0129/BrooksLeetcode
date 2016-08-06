package com.brooks;
import java.util.HashMap;
/**
 * @author: 李松达
 * @date: 2016/8/6.
 */
public class LC_Problem_219{
    public boolean containsNearbyDuplicate(int[] nums,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        if(nums==null||nums.length==0){
            return false;
        }
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])&&i-map.get(nums[i])<=k){
                return true;
            }else{
                map.put(nums[i],i);
            }
        }
        return false;
    }
}
