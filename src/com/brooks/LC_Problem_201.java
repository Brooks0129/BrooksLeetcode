package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/8/4.
 */
public class LC_Problem_201{
    public int rangeBitwiseAnd(int m,int n){
        int factor=0;
        while(m!=n){
            m>>=1;
            n>>=1;
            factor++;
        }
        return m<<factor;
    }
}
