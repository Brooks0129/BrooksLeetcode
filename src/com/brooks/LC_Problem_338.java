package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/8/14.
 */
public class LC_Problem_338{
    public int[] countBits(int num) {
        int[] f=new int[num+1];
        for(int i=1;i<=num;i++){
            f[i]=f[i>>1]+(i&1);
        }
        return f;
    }
}
