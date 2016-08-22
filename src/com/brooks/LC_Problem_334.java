package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/8/22.
 */
public class LC_Problem_334{
    public boolean increasingTriplet(int[] nums){
        int v1=Integer.MAX_VALUE;
        int v2=Integer.MAX_VALUE;
        for(int num : nums){
            if(num<=v1){
                v1=num;
            }else if(num<=v2){
                v2=num;
            }else{
                return true;
            }
        }
        return false;
    }
}
