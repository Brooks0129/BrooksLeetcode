package com.brooks;

import java.util.HashMap;

/**
 * @author: 李松达
 * @time: 2016/7/11 12:09.
 * @description:
 */
public class LC_Problem_13{
    public int romanToInt(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int res=0;
        res=map.get(s.charAt(0));
        int lastIndex=0;
        int curIndex;
        for(int i=1;i<s.length();i++){
            if(map.get(s.charAt(lastIndex))>=map.get(s.charAt(i))){
                res+=map.get(s.charAt(i));
            }else{
                res=res+map.get(s.charAt(i))-2*map.get(s.charAt(lastIndex));
            }
            lastIndex=i;
        }
        return res;
    }
}
