package com.brooks;
import java.util.HashMap;
/**
 * @author: 李松达
 * @date: 2016/8/4.
 */
public class LC_Problem_205{
    public boolean isIsomorphic(String s,String t){
        HashMap<Character,Character> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char cs=s.charAt(i);
            char ct=t.charAt(i);
            if(map.containsKey(s.charAt(i))){
                if(map.get(cs)==ct){
                    continue;
                }else{
                    return false;
                }
            }else{
                if(!map.containsValue(ct)){
                    map.put(cs,ct);
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
