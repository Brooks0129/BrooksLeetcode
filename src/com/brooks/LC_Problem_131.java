package com.brooks;
import java.util.ArrayList;
import java.util.List;
/**
 * @author: 李松达
 * @date: 2016/7/31.
 */
public class LC_Problem_131{
    public List<List<String>> partition(String s){
        List<List<String>> res=new ArrayList<>();
        dfs(s,res,0,new ArrayList<String>());
        return res;
    }
    private void dfs(String s,List<List<String>> res,int index,ArrayList<String> list){
        if(index>=s.length()){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isPalindrome(s,index,i)){
                list.add(s.substring(index,i+1));
                dfs(s,res,i+1,list);
                list.remove(list.size()-1);
            }
        }
    }
    private boolean isPalindrome(String s,int start,int end){
        while(start<end){
            if(s.charAt(start++)!=s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}
