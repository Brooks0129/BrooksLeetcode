package com.brooks;
import java.util.*;
/**
 * @author: 李松达
 * @date: 2016/7/16.
 */
public class LC_Problem_140{
    public static void main(String[] args){
        String s="catsanddog";
        Set<String> wordDict=new HashSet<>();
        wordDict.add("cat");
        wordDict.add("cats");
        wordDict.add("and");
        wordDict.add("dog");
        wordDict.add("sand");
        List<String> strings=wordBreak(s,wordDict);
        System.out.println(strings.toString());
    }
    static HashMap<String,List<String>> map=new HashMap<>();
    public static List<String> wordBreak(String s,Set<String> wordDict){
        List<String> res=new ArrayList<>();
        if(map.containsKey(s)){
            return map.get(s);
        }
        if(wordDict.contains(s)){
            res.add(s);
        }
        for(int i=1;i<s.length();i++){
            String cur=s.substring(i);
            if(wordDict.contains(cur)){
                List<String> l=wordBreak(s.substring(0,i),wordDict);
                if(!l.isEmpty()){
                    for(String ss : l){
                        res.add(ss+" "+cur);
                    }
                }
            }
        }
        map.put(s,res);
        return res;
    }
}
