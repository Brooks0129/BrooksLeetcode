package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/8/14.
 */
public class LC_Problem_342{
    public boolean isPowerOfFour(int num){
        if((num&1)==1){
            return false;
        }
        num>>>=1;
        if((num&1)==1){
            return false;
        }
        return true;
    }
}
