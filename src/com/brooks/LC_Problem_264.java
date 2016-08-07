package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/8/7.
 */
public class LC_Problem_264{
    public int nthUglyNumber(int n){
        int[] unly=new int[n];
        unly[0]=1;
        int index2=0;
        int index3=0;
        int index5=0;
        int factor2=2;
        int factor3=3;
        int factor5=5;
        for(int i=1;i<n;i++){
            int min=Math.min(factor2,Math.min(factor3,factor5));
            unly[i]=min;
            if(min==factor2){
                factor2=2*unly[++index2];
            }
            if(min==factor3){
                factor3=3*unly[++index3];
            }
            if(min==factor5){
                factor5=5*unly[++index5];
            }
        }
        return unly[n-1];
    }
}
