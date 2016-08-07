package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/8/7.
 */
public class LC_Problem_242{
    public boolean isAnagram(String s,String t){
        if(s==null||t==null||s.length()!=t.length()){
            return false;
        }
        int[] map=new int[26];
        for(int i=0;i<s.length();i++){
            map[s.charAt(i)-'a']++;
            map[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(map[i]!=0){
                return false;
            }
        }
        return true;
    }
}
