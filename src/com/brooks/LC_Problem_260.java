package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/17.
 */
public class LC_Problem_260{
    public int[] singleNumber(int[] nums){
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor^=nums[i];
        }
        xor&=(~xor+1);
        int[] res=new int[2];
        for(int i : nums){
            if((xor&i)==0){
                res[0]^=i;
            }else{
                res[1]^=i;
            }
        }
        return res;
    }
}
