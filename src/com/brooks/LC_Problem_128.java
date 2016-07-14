package com.brooks;
import java.util.HashMap;
import java.util.Map;
/**
 * @author: 李松达
 * @date: 2016/7/14.
 */
public class LC_Problem_128{
    public int longestConsecutive(int[] nums){
        Map<Integer,Integer> map=new HashMap<>();
        int max=0;
        for(int v : nums){
            if(map.containsKey(v)){
                continue;
            }else{
                int left=map.containsKey(v-1)?map.get(v-1):0;
                int right=map.containsKey(v+1)?map.get(v+1):0;
                int len=left+1+right;
                map.put(v,len);
                max=Math.max(max,len);
                map.put(v-left,len);
                map.put(v+right,len);
            }
        }
        return max;
    }
}
