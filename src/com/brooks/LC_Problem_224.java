package com.brooks;
import java.util.Stack;
/**
 * @author: 李松达
 * @date: 2016/7/15.
 */
public class LC_Problem_224{
    public int calculate(String s){
        Stack<Integer> stack=new Stack<>();
        int res=0;
        int cur=0;
        boolean isPositive=true;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                cur=10*cur+(s.charAt(i)-'0');
            }else if(s.charAt(i)=='+'){
                res+=cur*(isPositive?1:-1);
                cur=0;
                isPositive=true;
            }else if(s.charAt(i)=='-'){
                res+=cur*(isPositive?1:-1);
                cur=0;
                isPositive=false;
            }else if(s.charAt(i)=='('){
                stack.push(res);
                stack.push(isPositive?1:-1);
                isPositive=true;
                res=0;
            }else if(s.charAt(i)==')'){
                res+=cur*(isPositive?1:-1);
                cur=0;
                res=stack.pop()*res;
                res+=stack.pop();
            }
        }
        if(cur!=0){
            res+=cur*(isPositive?1:-1);
        }
        return res;
    }
}
