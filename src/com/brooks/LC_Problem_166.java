package com.brooks;
import java.util.HashMap;
import java.util.Map;
/**
 * @author: 李松达
 * @date: 2016/8/3.
 */
public class LC_Problem_166{
    public String fractionToDecimal(int numerator,int denominator){
        if(denominator==0){
            return "NAN";
        }
        if(numerator==0){
            return "0";
        }
        StringBuffer sb=new StringBuffer();
        long n=numerator;
        long d=denominator;
        if(n*d<0){
            sb.append('-');
        }
        n=Math.abs(n);
        d=Math.abs(d);
        sb.append(n/d);
        if(n%d==0){
            return sb.toString();
        }else{
            sb.append(".");
        }
        Map<Long,Integer> map=new HashMap<>();
        long r=n%d;
        while(r>0){
            if(map.containsKey(r)){
                sb.insert(map.get(r),"(");
                sb.append(")");
                break;
            }
            map.put(r,sb.length());
            r*=10;
            sb.append(r/d);
            r%=d;
        }
        return sb.toString();
    }
}
