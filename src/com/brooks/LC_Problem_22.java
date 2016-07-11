package com.brooks;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 李松达
 * @time: 2016/7/11 13:15.
 * @description:
 */
public class LC_Problem_22{
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<String>();
        dfs(res,n,n,"");
        return res;
    }
    public void dfs(List<String> res,int left,int right,String cur){
        if (left==0&&right==0) {
            res.add(cur);
            return;
        }
        if (left>0) {
            dfs(res,left-1,right,cur+"(");
        }
        if (right>left) {
            dfs(res,left,right-1,cur+")");
        }
    }
}
