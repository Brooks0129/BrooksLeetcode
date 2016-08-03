package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/8/3.
 */
public class LC_Problem_171{
    public int titleToNumber(String s){
        int res=0;
        for(int i=0;i<s.length();i++){
            res=res*26+s.charAt(i)-'A'+1;
        }
        return res;
    }
}
