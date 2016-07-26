package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/26.
 */
public class LC_Problem_377_DP{
    public int combinationSum4(int[] nums,int target){
        if(nums==null||nums.length==0||target<0){
            return 0;
        }
        int[] res=new int[target+1];
        for(int i=1;i<res.length;i++){
            for(int v : nums){
                if(v>i){
                    continue;
                }else if(v==i){
                    res[i]+=1;
                }else{
                    res[i]+=res[i-v];
                }
            }
        }
        return res[target];
    }
}
