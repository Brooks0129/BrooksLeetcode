package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/30.
 */
public class LC_Problem_233{
    public int countDigitOne(int n){
        if(n<1){
            return 0;
        }
        int len=getLen(n);
        if(len==1){
            return 1;
        }
        int temp=powerBaseOf10(len-1);
        int first=n/temp;
        int firstOne=first==1?n%temp+1:temp;
        int otherOne=(len-1)*first*(temp/10);
        return firstOne+otherOne+countDigitOne(n%temp);
    }
    private int powerBaseOf10(int base){
        return (int)Math.pow(10,base);
    }
    private int getLen(int n){
        int len=0;
        while(n!=0){
            len++;
            n/=10;
        }
        return len;
    }
}
