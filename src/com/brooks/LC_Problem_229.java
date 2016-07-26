package com.brooks;
import java.util.ArrayList;
import java.util.List;
/**
 * @author: 李松达
 * @date: 2016/7/26.
 */
public class LC_Problem_229{
    public List<Integer> majorityElement(int[] nums){
        List<Integer> list=new ArrayList<>();
        if(nums==null||nums.length==0){
            return list;
        }
        int cand1=nums[0];
        int cand2=nums[0];
        int count1=0;
        int count2=0;
        for(int i=0;i<nums.length;i++){
            if(cand1==nums[i]){
                count1++;
            }else if(cand2==nums[i]){
                count2++;
            }else if(count1==0){
                cand1=nums[i];
                count1++;
            }else if(count2==0){
                cand2=nums[i];
                count2++;
            }else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int i:nums){
            if(i==cand1){
                count1++;
            }else if(i==cand2){
                count2++;
            }
        }
        if(count1>nums.length/3){
            list.add(cand1);
        }
        if(count2>nums.length/3){
            list.add(cand2);
        }
        return list;
    }
}
