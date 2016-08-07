package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/8/7.
 */
public class LC_Problem_231{
    public boolean isPowerOfTwo(int n){
        return n>0&&(n&(n-1))==0;
    }
}
