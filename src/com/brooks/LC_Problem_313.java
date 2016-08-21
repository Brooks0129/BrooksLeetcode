package com.brooks;
import java.util.Arrays;
/**
 * @author: 李松达
 * @date: 2016/8/14.
 */
public class LC_Problem_313{
    public int nthSuperUglyNumber(int n,int[] primes){
        int[] ugly=new int[n];
        int[] idx=new int[primes.length];
        int[] val=new int[primes.length];
        Arrays.fill(val,1);
        int next=1;
        for(int i=0;i<n;i++){
            ugly[i]=next;
            next=Integer.MAX_VALUE;
            for(int j=0;j<primes.length;j++){
                if(val[j]==ugly[i]){
                    val[j]=ugly[idx[j]++]*primes[j];
                }
                next=Math.min(next,val[j]);
            }
        }
        return ugly[n-1];
    }
}
