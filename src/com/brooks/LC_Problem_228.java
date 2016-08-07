package com.brooks;
import java.util.ArrayList;
import java.util.List;
/**
 * @author: 李松达
 * @date: 2016/8/7.
 */
public class LC_Problem_228{
    public static void main(String[] args){
        List<String> list=summaryRanges(new int[]{1});
        System.out.println(list.toString());
    }
    public static List<String> summaryRanges(int[] nums){
        List<String> res=new ArrayList<>();
        if(nums==null||nums.length==0){
            return res;
        }else if(nums.length==1){
            res.add(""+nums[0]);
            return res;
        }
        int i=0;
        while(i<nums.length){
            int start=nums[i];
            while(i+1<nums.length&&nums[i+1]-nums[i]==1){
                i++;
            }
            if(start!=nums[i]){
                res.add(start+"->"+nums[i]);
            }else{
                res.add(""+start);
            }
        }
        return res;
    }
}
