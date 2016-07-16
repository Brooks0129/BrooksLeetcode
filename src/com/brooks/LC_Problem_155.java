package com.brooks;
import java.util.Stack;
/**
 * @author: 李松达
 * @date: 2016/7/16.
 */
public class LC_Problem_155{
    class MinStack{
        Stack<Integer> stack;
        Stack<Integer> stackMin;
        /**
         * initialize your data structure here.
         */
        public MinStack(){
            stack=new Stack<>();
            stackMin=new Stack<>();
        }
        public void push(int x){
            stack.push(x);
            if(stackMin.isEmpty()){
                stackMin.push(x);
            }else{
                stackMin.push(Math.min(stackMin.peek(),x));
            }
        }
        public void pop(){
            if(!stack.isEmpty()){
                stack.pop();
                stackMin.pop();
            }
        }
        public int top(){
            return stack.peek();
        }
        public int getMin(){
            return stackMin.peek();
        }
    }
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}
