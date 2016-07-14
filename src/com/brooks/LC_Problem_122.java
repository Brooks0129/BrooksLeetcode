package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/14.
 */
public class LC_Problem_122{
    public int maxProfit(int[] prices){
        int res=0;
        for(int i=0;i<prices.length-1;i++){
            res+=(prices[i+1]-prices[i])>0?prices[i+1]-prices[i]:0;
        }
        return res;
    }
}
