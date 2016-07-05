package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/5.
 */
public class LC_Problem_70{
    public int climbStairs(int n){
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        int pre=1;
        int cur=2;
        int res=0;
        for(int i=3;i<=n;i++){
            res=cur+pre;
            pre=cur;
            cur=res;
        }
        return res;
    }
}
