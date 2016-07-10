package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/9.
 */
public class LC_Problem_97_Recursion{
    /**
     * 递归版本
     * Time Limit Exceeded
     * @param s1
     * @param s2
     * @param s3
     * @return
     */
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length()==0&&s2.length()==0&&s3.length()==0){
            return true;
        }
        if(s1.length()+s2.length()!=s3.length()){
            return false;
        }

        if(s1.length()>0&&s1.charAt(0)==s3.charAt(0)){
            if(isInterleave(s1.substring(1),s2,s3.substring(1))){
                return true;
            }
        }
        if(s2.length()>0&&s2.charAt(0)==s3.charAt(0)){
            if(isInterleave(s1,s2.substring(1),s3.substring(1))){
                return true;
            }
        }
        return false;
    }
}
