package com.brooks;
import java.util.LinkedHashMap;
/**
 * @author: 李松达
 * @date: 2016/8/22.
 */
public class LC_Problem_387{
    public int firstUniqChar(String s){
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(char c : map.keySet()){
            if(map.get(c)==1){
                return s.indexOf(c);
            }
        }
        return -1;
    }
}
