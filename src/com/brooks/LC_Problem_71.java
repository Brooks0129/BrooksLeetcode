package com.brooks;
import java.util.HashSet;
import java.util.Stack;
/**
 * @author: 李松达
 * @date: 2016/7/5.
 */
public class LC_Problem_71{
    public String simplifyPath(String path){
        HashSet<String> set=new HashSet<>();
        Stack<String> stack=new Stack<>();
        set.add(".");
        set.add("..");
        set.add("");
        for(String s : path.split("/")){
            if(!set.contains(s)){
                stack.add(s);
            }else if(s.equals("..")&&!stack.isEmpty()){
                stack.pop();
            }
        }
        StringBuilder sb=new StringBuilder();
        //sb.append("/");
        for(String s:stack){
            sb.append("/");
            sb.append(s);
           // sb.append("/");
        }
        return sb.length()==0?"/":sb.toString();
    }
}
