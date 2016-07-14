package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/14.
 */
public class LC_Problem_121{
    public int maxProfit(int[] prices){
        if(prices==null||prices.length==0){
            return 0;
        }
        int min=prices[0];
        int res=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }else{
                res=Math.max(res,prices[i]-min);
            }
        }
        return res;
    }
}
