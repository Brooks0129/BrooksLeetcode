package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/10.
 */
public class LC_Problem_8{
    public int myAtoi(String str){
        str=str.trim();
        if(str==null||str.length()==0){
            return 0;
        }
        if(!isValid(str)){
            return 0;
        }
        int index=0;
        boolean positive=true;
        if(str.charAt(0)=='-'){
            index=1;
            positive=false;
        }
        if(str.charAt(0)=='+'){
            index=1;
            positive=true;
        }
        int len=str.length();
        int res=0;
        for(int i=index;i<len;i++){
            if(str.charAt(i)<'0'||str.charAt(i)>'9'){
                break;
            }
            if(res<(Integer.MIN_VALUE+(str.charAt(i)-'0'))/10){
                res=Integer.MIN_VALUE;
                break;
            }
            res=res*10-(str.charAt(i)-'0');
        }
        if(res==Integer.MIN_VALUE){
            if(positive){
                return Integer.MAX_VALUE;
            }
        }
        return positive?-res:res;
    }
    private boolean isValid(String str){
        int index=0;
        if(str.charAt(0)=='-'||str.charAt(0)=='+'){
            index=1;
        }
        for(int i=index;i<str.length();i++){
            if(str.charAt(i)>='0'||str.charAt(i)<='9'){
                return true;
            }
        }
        return false;
    }
}
