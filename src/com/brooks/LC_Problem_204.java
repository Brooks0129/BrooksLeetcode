package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/8/4.
 */
public class LC_Problem_204{
    /**
     * The Sieve of Eratosthenes uses an extra O(n) memory and its runtime complexity is O(n log log n).
     * @param n
     * @return
     */
    public int countPrimes(int n){
        int count=0;
        boolean[] isPrime=new boolean[n];
        for(int i=2;i<n;i++){
            isPrime[i]=true;
        }
        for(int i=2;i*i<n;i++){
            if(!isPrime[i]){
                continue;
            }
            for(int j=i*i;j<n;j+=i){
                isPrime[j]=false;
            }
        }
        for(int i=2;i<n;i++){
            if(isPrime[i]){
                count++;
            }
        }
        return count;
    }
}
