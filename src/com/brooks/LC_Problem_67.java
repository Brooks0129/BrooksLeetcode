package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/5.
 */
public class LC_Problem_67{
    public String addBinary(String a,String b){
        if(a==null||a.isEmpty()){
            return b;
        }
        if(b==null||b.isEmpty()){
            return a;
        }
        int ai=a.length()-1;
        int bi=b.length()-1;
        int carry=0;
        int aBin=0;
        int bBin=0;
        StringBuilder sb=new StringBuilder();
        while(ai>=0||bi>=0||carry==1){
            aBin=ai>=0?Character.getNumericValue(a.charAt(ai--)):0;
            bBin=bi>=0?Character.getNumericValue(b.charAt(bi--)):0;
            int cur=aBin^bBin^carry;
            carry=(aBin+bBin+carry)>=2?1:0;
            sb.append(cur);
        }
        return sb.reverse().toString();
    }
}
