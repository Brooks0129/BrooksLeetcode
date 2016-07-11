package com.brooks;

import java.util.Stack;

/**
 * @author: 李松达
 * @time: 2016/7/11 12:09.
 * @description:
 */
public class LC_Problem_20{
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        if (s==null||s.length()==0) {
            return false;
        }
        //stack.push(s.charAt(0));
        for(int i=0;i<s.length();i++){
            if (s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{') {
                stack.push(s.charAt(i));
            }else{
                if (stack.isEmpty()) {
                    return false;
                }
                if(stack.peek()=='('&&s.charAt(i)==')'
                        ||(stack.peek()=='['&&s.charAt(i)==']')
                        ||(stack.peek()=='{'&&s.charAt(i)=='}'))
                    stack.pop();
                else{
                    return false;
                }
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }
}
