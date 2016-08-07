package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/8/7.
 */
public class LC_Problem_263{
    public boolean isUgly(int num){
        if(num<=0){
            return false;
        }
        while(num%2==0){
            num/=2;
        }
        while(num%3==0){
            num/=3;
        }
        while(num%5==0){
            num/=5;
        }
        return num==1;
    }
}
