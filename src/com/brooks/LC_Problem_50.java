package com.brooks;


/**
 * @author: 李松达
 * @time: 2016/7/4 14:35.
 * @description:
 */
public class LC_Problem_50{
    public double myPow(double x,int n){
        if(x==0){
            return 0;
        }else if(n==0){
            return 1;
        }else if(n==-1){
            return 1/x;
        }else{
            if(n%2==0){
                return myPow(x*x,n/2);
            }else{
                return x*myPow(x*x,(n-1)/2);
            }
        }

    }
}
