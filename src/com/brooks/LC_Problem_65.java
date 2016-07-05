package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/5.
 */
public class LC_Problem_65{
    public static void main(String[] args){
        LC_Problem_65 lc_problem_65=new LC_Problem_65();
        //   boolean e=lc_problem_65.isNumber("e");
        boolean e=lc_problem_65.isNumber(".");
        System.out.println(e);
    }
    public boolean isNumber(String s){
        s=s.trim();
        boolean pi=false;//point index
        boolean ei=false;//e index;
        boolean ni=false;//number index;
        boolean nei=true;//number after e
        char[] chars=s.toCharArray();
        for(int i=0;i<chars.length;i++){
            char c=chars[i];
            if(c=='+'||c=='-'){
                if(i!=0&&chars[i-1]!='e'){
                    return false;
                }
            }else if(c=='.'){
                if(ei||pi){
                    return false;
                }
                pi=true;
            }else if(c>='0'&&c<='9'){
                nei=true;
                ni=true;
            }else if(c=='e'){
                if(ei||!ni){
                    return false;
                }
                ei=true;
                nei=false;
            }else{
                return false;
            }
        }
        return nei&&ni;
    }
}
