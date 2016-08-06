package com.brooks;
import java.util.HashMap;
import java.util.Map;
/**
 * @author: 李松达
 * @date: 2016/8/6.
 */
public class LC_Problem_220{
    public boolean containsNearbyAlmostDuplicate(int[] nums,int k,int t){
        if(k<1||t<0){
            return false;
        }
        Map<Long,Long> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            Long key=(long)nums[i]-Integer.MIN_VALUE;
            Long bucket=key/((long)t+1);
            if(map.containsKey(bucket)
                    ||map.containsKey(bucket-1)&&key-map.get(bucket-1)<=t
                    ||map.containsKey(bucket+1)&&map.get(bucket+1)-key<=t){
                return true;
            }
            if(map.keySet().size()>=k){
                map.remove(((long)nums[i-k]-Integer.MIN_VALUE)/((long)t+1));
            }
            map.put(bucket,key);
        }
        return false;
    }
}
