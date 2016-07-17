package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/17.
 */
public class LC_Problem_190{
    // you need treat n as an unsigned value
    public int reverseBits(int n){
        int res=0;
        for(int i=0;i<31;i++){
            res+=n&1;
            n>>>=1;
            res<<=1;
        }
        res+=n&1;
        return res;
    }
}
