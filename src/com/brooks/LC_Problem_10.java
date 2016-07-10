package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/10.
 */
public class LC_Problem_10{
    public boolean isMatch(String s,String p){
        if(p.length()==0){
            return s.length()==0;
        }
        if(p.length()>1&&p.charAt(1)=='*'){
            if(isMatch(s,p.substring(2)))
                return true;
            if(s.length()>0&&(s.charAt(0)==p.charAt(0)||p.charAt(0)=='.')){
                return isMatch(s.substring(1),p);
            }
            return false;
        }else{
            if(s.length()>0&&(s.charAt(0)==p.charAt(0)||p.charAt(0)=='.')){
                return isMatch(s.substring(1),p.substring(1));
            }
            return false;
        }
    }
}
