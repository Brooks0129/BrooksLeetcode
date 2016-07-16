package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/16.
 */
public class LC_Problem_227{
    public static void main(String[] args){
        LC_Problem_227 lc_problem_227=new LC_Problem_227();
        int calculate=lc_problem_227.calculate("0*1");
        System.out.println(calculate);
    }
    public int calculate(String s){
        if(s==null){
            return 0;
        }
        int pre=0;
        int num=0;
        int res=0;
        int opt=0;
        int sign=1;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c==' '){
                continue;
            }
            if(Character.isDigit(c)){
                num=num*10+(c-'0');
            }else{
                if(opt==1){
                    num=pre*num;
                }
                if(opt==-1){
                    num=pre/num;
                }
                opt=0;
                if(c=='+'||c=='-'){
                    res=res+num*sign;
                    sign=c=='+'?1:-1;
                }
                if(c=='*'||c=='/'){
                    pre=num;
                    opt=c=='*'?1:-1;
                }
                num=0;
            }
        }
        if(opt==1){
            res+=sign*pre*num;
        }else if(opt==-1){
            res+=sign*pre/num;
        }else{
            res+=sign*num;
        }
        return res;
    }
}
