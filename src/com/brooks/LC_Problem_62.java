package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/5.
 */
public class LC_Problem_62{
    public int uniquePaths(int m,int n){
        //C(m+n,n)
        int a=m+n-2;
        int b=Math.min(m,n)-1;
        long res=1;
        //C(a,b)
        for(int i=0;i<b;i++){
            res*=(a-i);
        }
        for(int i=0;i<b;i++){
            res/=(i+1);
        }
        return (int)res;
    }
}
