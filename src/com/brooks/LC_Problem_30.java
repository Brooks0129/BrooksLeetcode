package com.brooks;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/**
 * @author: 李松达
 * @date: 2016/7/11.
 */
public class LC_Problem_30{
    public static void main(String[] args){
        LC_Problem_30 lc_problem_30=new LC_Problem_30();
        String[] string={"aa","aa","aa"};
        List<Integer> integerList=lc_problem_30.findSubstring("aaaaaaaa",string);
        System.out.println(integerList.toString());
    }
    public List<Integer> findSubstring(String s,String[] words){
        List<Integer> res=new ArrayList<>();
        int S=s.length();
        int W=words.length;
        int L=words[0].length();
        if(S<W*L){
            return res;
        }
        HashMap<String,Integer> map=new HashMap<>();
        for(String word : words){
            map.put(word,map.containsKey(word)?map.get(word)+1:1);
        }
        HashMap<String,Integer> curMap=new HashMap<>();
        for(int i=0;i<L;i++){
            int count=0;
            for(int l=i, r=i;r+L<=S;r+=L){
                String str=s.substring(r,r+L);
                if(map.containsKey(str)){
                    curMap.put(str,curMap.containsKey(str)?curMap.get(str)+1:1);
                    if(curMap.get(str)<=map.get(str)){
                        count++;
                    }
                    while(curMap.get(str)>map.get(str)){
                        String tmp=s.substring(l,l+L);
                        curMap.put(tmp,curMap.get(tmp)-1);
                        l+=L;
                        if(curMap.get(tmp)<map.get(tmp)){
                            count--;
                        }
                    }
                    if(count==W){
                        res.add(l);
                        count--;
                        String tmp=s.substring(l,l+L);
                        curMap.put(tmp,curMap.get(tmp)-1);
                        l+=L;
                    }
                }else{
                    l=r+L;
                    curMap.clear();
                    count=0;
                }
            }
            curMap.clear();
        }
        return res;
    }
}
