package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/26.
 */
public class LC_Problem_371{
    public int getSum(int a,int b){
        return b==0?a:getSum(a^b,(a&b)<<1);
    }
}
