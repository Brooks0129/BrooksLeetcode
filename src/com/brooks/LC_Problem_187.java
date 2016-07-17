package com.brooks;
import java.util.*;
/**
 * @author: 李松达
 * @date: 2016/7/17.
 */
public class LC_Problem_187{
    //187. Repeated DNA Sequences
    public List<String> findRepeatedDnaSequences(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        Set<Integer> firstSet=new HashSet<>();
        Set<Integer> dupSet=new HashSet<>();
        List<String> res=new ArrayList<>();
        map.put('A',0);
        map.put('C',1);
        map.put('G',2);
        map.put('T',3);
        char[] chars=s.toCharArray();
        for(int i=0;i<chars.length-9;i++){
            int v=0;
            for(int j=i;j<i+10;j++){
                v<<=2;
                v|=map.get(chars[j]);
            }
            if(!firstSet.add(v)&&dupSet.add(v)){
                res.add(s.substring(i,i+10));
            }
        }
        return res;
    }
}
