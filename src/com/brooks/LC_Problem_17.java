package com.brooks;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 李松达
 * @time: 2016/7/11 12:09.
 * @description:
 */
public class LC_Problem_17{
    public List<String> letterCombinations(String digits){
        List<String> list=new ArrayList<>();
        if(digits==null||digits.length()==0){
            return list;
        }
        for(int i=0;i<digits.length();i++){
            if(digits.charAt(i)<'2'||digits.charAt(i)>'9'){
                return list;
            }
        }
        char[][] chars={
                {'a','b','c'},
                {'d','e','f'},
                {'g','h','i'},
                {'j','k','l'},
                {'m','n','o'},
                {'p','q','r','s'},
                {'t','u','v'},
                {'w','x','y','z'}};
        List<String> res=new ArrayList<>();
        dfs(digits,0,"",chars,res);
        return res;
    }

    private void dfs(String digits,int index,String cur,char[][] chars,List<String> res){
        if(cur.length()==digits.length()){
            res.add(cur);
            return;
        }
        for(int j=index;j<digits.length();j++){
            int curIndex=digits.charAt(j)-'2';
            for(int i=0;i<chars[curIndex].length;i++){
                dfs(digits,j+1,cur+chars[curIndex][i],chars,res);
            }   }

    }
}
