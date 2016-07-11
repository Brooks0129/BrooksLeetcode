package com.brooks;

import java.util.*;

/**
 * @author: 李松达
 * @time: 2016/7/11 12:09.
 * @description:
 */
public class LC_Problem_15{
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> res=new ArrayList<>();
        if(nums==null){
            return res;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            List<Integer> cur=new ArrayList<>();
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                if(nums[left]+nums[right]==-nums[i]){
                    cur.add(nums[i]);
                    cur.add(nums[left]);
                    cur.add(nums[right]);
                    res.add(cur);
                    cur=new ArrayList<>();
                    left++;
                    right--;
                }else if(nums[left]+nums[right]<-nums[i]){
                    left++;
                }else{
                    right--;
                }
            }


        }
        TreeSet<List<Integer>> set=new TreeSet<List<Integer>>(new Comparator<List<Integer>>(){
            @Override
            public int compare(List<Integer> o1,List<Integer> o2){
                if(o1.get(0)==o2.get(0)&&o1.get(1)==o2.get(1)&&o1.get(2)==o2.get(2))
                    return 0;
                if(o1.get(0)<o2.get(0)){
                    return 1;
                }
                return o2.get(0)-o1.get(0)!=0?
                        o2.get(0)-o1.get(0):
                        (o2.get(1)-o1.get(1)!=0?
                                o2.get(1)-o1.get(1):
                                o2.get(2)-o1.get(2));
            }
        });
        for(int j=0;j<res.size();j++){
            set.add(res.get(j));
        }
        return new ArrayList<List<Integer>>(set);

    }
}
