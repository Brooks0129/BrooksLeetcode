package com.brooks;

/**
 * @author: 李松达
 * @time: 2016/7/11 13:15.
 * @description:
 */
public class LC_Problem_28{
    public static int strStr(String haystack,String needle){
        if(haystack==null||needle==null){
            return -1;
        }
        for(int i=0;;i++){
            for(int j=0;;j++){
                if(j==needle.length()){
                    return i;
                }
                if(i+j==haystack.length()){
                    return -1;
                }
                if(haystack.charAt(i+j)!=needle.charAt(j))
                    break;
            }
        }
    }
}
