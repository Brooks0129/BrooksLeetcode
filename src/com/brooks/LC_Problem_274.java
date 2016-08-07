package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/8/7.
 */
public class LC_Problem_274{
    public int hIndex(int[] citations){
        int len=citations.length;
        if(len==0){
            return 0;
        }
        int[] dp=new int[len+1];
        for(int i=0;i<len;i++){
            if(citations[i]>=len){
                dp[len]++;
            }else{
                dp[citations[i]]++;
            }
        }
        int t=0;
        int result=0;
        for(int i=len;i>=0;i--){
            t+=dp[i];
            if(t>=i){
                return i;
            }
        }
        return 0;
    }
}
