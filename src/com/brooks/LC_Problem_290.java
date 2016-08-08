package com.brooks;
import java.util.HashMap;
/**
 * @author: 李松达
 * @date: 2016/8/8.
 */
public class LC_Problem_290{
    public static void main(String[] args){
        boolean b=wordPattern("abba","dog cat cat dog");
        System.out.println(b);
    }
    public static boolean wordPattern(String pattern,String str){
        if(pattern==null||str==null){
            return false;
        }
        String[] strings=str.trim().split("\\s+");
        char[] chars=pattern.toCharArray();
        if(chars.length!=strings.length){
            return false;
        }
        HashMap<Character,String> map=new HashMap<>();
        for(int i=0;i<chars.length;i++){
            char c=chars[i];
            String s=strings[i];
            if(map.containsKey(c)){
                if(!map.get(c).equals(s)){
                    return false;
                }
            }else{
                if(map.containsValue(s)){
                    return false;
                }
                map.put(c,s);
            }
        }
        return true;
    }
}
