package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/10.
 */
public class LC_Problem_5{
    public String longestPalindrome(String s) {
        String ss=preProcess(s);
        int len=ss.length();
        int[] p=new int[len];
        int C=0;
        int R=0;
        for(int i=1;i<len-1;i++){
            int i_mirrot=2*C-i;
            p[i]=(R>i)?Math.min(p[i_mirrot],R-i):0;
            while(ss.charAt(i+p[i]+1)==ss.charAt(i-p[i]-1)){
                p[i]++;
            }
            if(i+p[i]>R){
                R=i+p[i];
                C=i;
            }
        }
        int maxValue=0;
        int maxIndex=0;
        for(int i=0;i<p.length;i++){
            if(p[i]>maxValue){
                maxValue=p[i];
                maxIndex=i;
            }
        }
        return s.substring((maxIndex-maxValue-1)/2,(maxIndex-maxValue-1)/2+maxValue);
    }
    private String preProcess(String s){
        int n=s.length();
        if(n==0){
            return "^$";
        }
        String res="^";
        for(int i=0;i<n;i++){
            res+=("#"+s.charAt(i));
        }
        res+="#$";
        return res;
    }
}
