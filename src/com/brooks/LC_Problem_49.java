package com.brooks;

import java.util.*;

/**
 * @author: 李松达
 * @time: 2016/7/4 13:30.
 * @description:
 */
public class LC_Problem_49{
    public static void main(String[] args){
        LC_Problem_49 lc_problem_49=new LC_Problem_49();
        List<List<String>> lists=lc_problem_49.groupAnagrams(new String[]{"",""});
        for(List<String> list:lists){
            for(String s:list){
                System.out.print(s+" ");
            }
            System.out.println();
        }
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();
        if(strs==null||strs.length==0){
            return res;
        }
        HashMap<String,List<String>> map=new HashMap<>();
        Arrays.sort(strs);
        for(String s:strs){
            char[] chars=s.toCharArray();
            Arrays.sort(chars);
            String ss=String.valueOf(chars);
            if(map.containsKey(ss)){
                map.get(ss).add(s);
            }else {
                List<String> cur=new ArrayList<>();
                cur.add(s);
                map.put(ss,cur);
            }
        }
        Set<String> strings=map.keySet();
        for(String s:strings){
            res.add(map.get(s));
        }
        return res;
    }
}
