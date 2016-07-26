package com.brooks;
import java.util.HashMap;
import java.util.Set;
/**
 * @author: 李松达
 * @date: 2016/7/26.
 */
public class LC_Problem_299{
    public static void main(String[] args){
        String hint=getHint("1122","2211");
        System.out.println(hint);
    }
    public static String getHint(String secret,String guess){
        HashMap<Character,Integer> sMap=new HashMap<>();
        HashMap<Character,Integer> gMap=new HashMap<>();
        int same=0;
        for(int i=0;i<secret.length();i++){
            char s=secret.charAt(i);
            char g=guess.charAt(i);
            if(s==g){
                same++;
            }else{
                sMap.put(s,sMap.containsKey(s)?sMap.get(s)+1:1);
                gMap.put(g,gMap.containsKey(g)?gMap.get(g)+1:1);
            }
        }
        int misPosition=0;
        Set<Character> characters=sMap.keySet();
        for(char c : characters){
            misPosition+=Math.min(sMap.get(c),gMap.getOrDefault(c,0));
        }
        return same+"A"+misPosition+"B";
    }
}
