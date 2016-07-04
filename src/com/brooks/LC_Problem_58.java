package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/4.
 */
public class LC_Problem_58{
    public static void main(String[] args){
        LC_Problem_58 lc_problem_58=new LC_Problem_58();
        int lengthOfLastWord=lc_problem_58.lengthOfLastWord("sdfsc dfsd  ");
        System.out.println(lengthOfLastWord);
    }
    public int lengthOfLastWord(String s){
        if(s==null||s.length()==0||s.trim().length()==0){
            return 0;
        }
        char[] chars=s.toCharArray();
        int second=-1;
        int first=-1;
        for(int i=chars.length-1;i>=0;i--){
            if(chars[i]!=' '){
                second=second==-1?i:second;
            }else{
                first=second!=-1?i:-1;
                if(first!=-1){
                    break;
                }
            }
        }
        return second-first;
    }
}
