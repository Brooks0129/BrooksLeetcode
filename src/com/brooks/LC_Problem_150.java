package com.brooks;
import java.util.Stack;
/**
 * @author: 李松达
 * @date: 2016/7/15.
 */
public class LC_Problem_150{
    public int evalRPN(String[] tokens){
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            switch(tokens[i]){
                case "+":
                    if(stack.size()<2){
                        return 0;
                    }else{
                        int i1=stack.pop();
                        int i2=stack.pop();
                        stack.push(i1+i2);
                    }
                    break;
                case "-":
                    if(stack.size()<2){
                        return 0;
                    }else{
                        int i1=stack.pop();
                        int i2=stack.pop();
                        stack.push(i2-i1);
                    }
                    break;
                case "*":
                    if(stack.size()<2){
                        return 0;
                    }else{
                        int i1=stack.pop();
                        int i2=stack.pop();
                        stack.push(i1*i2);
                    }
                    break;
                case "/":
                    if(stack.size()<2){
                        return 0;
                    }else{
                        int i1=stack.pop();
                        int i2=stack.pop();
                        stack.push(i2/i1);
                    }
                    break;
                default:
                    stack.push(Integer.valueOf(tokens[i]));
            }
        }
        if(stack.size()!=1){
            return 0;
        }
        return stack.pop();
    }
}
