package com.brooks;

/**
 * @author: 李松达
 * @time: 2016/7/11 13:15.
 * @description:
 */
public class LC_Problem_29{
    public int divide(int dividend,int divisor){
        int res=0;
        if(divisor==0||(dividend==Integer.MIN_VALUE&&divisor==-1)){
            return Integer.MAX_VALUE;
        }
        boolean isPositive=false;
        if(dividend<=0&&divisor<0||(dividend>=0&&divisor>0)){
            isPositive=true;
        }
        long dividendL=dividend;
        dividendL=Math.abs(dividendL);
        long divisorL=divisor;
        divisorL=Math.abs(divisorL);
        while(dividendL>=divisorL){
            long tmp=divisorL;
            int bit=1;
            while(dividendL>=(tmp<<1)){
                tmp=tmp<<1;
                bit=bit<<1;
            }
            dividendL-=tmp;
            res+=bit;
        }
        return isPositive?res:-res;
    }
}
