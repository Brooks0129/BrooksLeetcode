package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/17.
 */
public class LC_Problem_191{
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res=0;
        while(n!=0){
            res++;
            n-=n&(-n);
        }
        return res;
    }
}
