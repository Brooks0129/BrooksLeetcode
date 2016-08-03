package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/8/3.
 */
public class LC_Problem_168{
    public String convertToTitle(int n){
        StringBuffer sb=new StringBuffer();
        while(n!=0){
            sb.insert(0,(char)('A'+--n%26));
            n/=26;
        }
        return sb.toString();
    }
}
