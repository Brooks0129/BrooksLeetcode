package com.brooks;
import java.util.*;
/**
 * @author: 李松达
 * @date: 2016/7/30.
 */
public class LC_Problem_350{
    public int[] intersect(int[] nums1,int[] nums2){
        Map<Integer,Integer> map1=new HashMap<>();
        Map<Integer,Integer> map2=new HashMap<>();
        for(int i : nums1){
            map1.put(i,map1.containsKey(i)?map1.get(i)+1:1);
        }
        for(int i : nums2){
            map2.put(i,map2.containsKey(i)?map2.get(i)+1:1);
        }
        Set<Integer> set=map1.keySet();
        List<Integer> list=new ArrayList<>();
        for(Integer i : set){
            if(map2.containsKey(i)){
                int min=Math.min(map1.get(i),map2.get(i));
                for(int j=0;j<min;j++){
                    list.add(i);
                }
            }
        }
        int[] res=new int[list.size()];
        for(int i=0;i<res.length;i++){
            res[i]=list.get(i);
        }
        return res;
    }
}
