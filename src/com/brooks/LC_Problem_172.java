package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/30.
 */
public class LC_Problem_172{
    public int trailingZeroes(int n){
        if(n==0){
            return 0;
        }
        return n/5+trailingZeroes(n/5);
    }
}
