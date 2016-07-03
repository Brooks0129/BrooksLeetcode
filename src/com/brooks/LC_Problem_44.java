package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/3.
 */
public class LC_Problem_44{
    public static void main(String[] args){
        LC_Problem_44 lc_problem_44=new LC_Problem_44();
        boolean match=
                lc_problem_44.isMatch("babbbbaabababaabbababaaba",
                        "b**a**a");
        System.out.println(match);
    }
    public boolean isMatch(String s,String p){
        int si=0;
        int pi=0;
        int match=-1;
        int starIndex=-1;
        while(si<s.length()){
            if(pi<p.length()&&(s.charAt(si)==p.charAt(pi)||p.charAt(pi)=='?')){
                si++;
                pi++;
            }else if(pi<p.length()&&p.charAt(pi)=='*'){
                starIndex=pi;
                match=si;
                pi++;
            }else if(starIndex!=-1){
                pi=starIndex+1;
                si=++match;
            }else {
                return false;
            }
        }
        while(pi<p.length()){
            if(p.charAt(pi++)!='*'){
                return false;
            }
        }
        return true;
    }
}
