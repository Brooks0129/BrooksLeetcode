package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/14.
 */
public class LC_Problem_123{
    public int maxProfit(int[] prices){
        if(prices==null||prices.length==0){
            return 0;
        }
        int[] l2r=new int[prices.length];
        int[] r2l=new int[prices.length];
        int l2rMin=prices[0];
        l2r[0]=0;
        for(int i=1;i<prices.length;i++){
            l2rMin=prices[i]<l2rMin?prices[i]:l2rMin;
            l2r[i]=prices[i]-l2rMin>l2r[i-1]?prices[i]-l2rMin:l2r[i-1];
        }
        int r2lMax=prices[prices.length-1];
        r2l[prices.length-1]=0;
        for(int i=prices.length-2;i>=0;i--){
            r2lMax=prices[i]>r2lMax?prices[i]:r2lMax;
            r2l[i]=r2lMax-prices[i]>r2l[i+1]?r2lMax-prices[i]:r2l[i+1];
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            max=Math.max(max,l2r[i]+r2l[i]);
        }
        return max;
    }
}
