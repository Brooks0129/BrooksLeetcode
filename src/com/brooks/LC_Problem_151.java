package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/30.
 */
public class LC_Problem_151{
    public String reverseWords(String s){
        String[] strings=s.trim().split("\\s+");
        StringBuffer sb=new StringBuffer();
        for(int i=strings.length-1;i>=1;i--){
            sb.append(strings[i]);
            sb.append(" ");
        }
        sb.append(strings[0]);
        return sb.toString();
    }
}
