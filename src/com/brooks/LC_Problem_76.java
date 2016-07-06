package com.brooks;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: 李松达
 * @time: 2016/7/6 10:08.
 * @description:
 */
public class LC_Problem_76{
    public static void main(String[] args){
        LC_Problem_76 lc_problem_76=new LC_Problem_76();
        String s=lc_problem_76.minWindow("bba","ab");
        System.out.println(s);
    }
    public String minWindow(String s,String t){
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        int begin=0;
        int end=0;
        int head=0;
        int d=Integer.MAX_VALUE;
        int counter=t.length();
        while(end<s.length()){
            if(map.containsKey(s.charAt(end))){
                int i=map.get(s.charAt(end));
                if(i>0){
                    counter--;
                }
                map.put(s.charAt(end),i-1);
            }
            end++;
            while(counter==0){
                if(end-begin<d){
                    head=begin;
                    d=end-begin;
                }
                char c=s.charAt(begin);
                if(map.containsKey(c)){
                    if(map.get(c)==0){
                        counter++;
                    }
                    map.put(c,map.get(c)+1);
                }
                begin++;
            }
        }
        return d==Integer.MAX_VALUE?"":s.substring(head,head+d);
    }
}
