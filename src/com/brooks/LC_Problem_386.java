package com.brooks;
import java.util.ArrayList;
import java.util.List;
/**
 * @author: 李松达
 * @date: 2016/8/23.
 */
public class LC_Problem_386{
    public List<Integer> lexicalOrder(int n){
        List<Integer> res=new ArrayList<>();
        for(int i=1;i<=9;i++){
            solve(res,i,n);
        }
        return res;
    }
    private void solve(List<Integer> res,int cur,int n){
        if(cur>n){
            return;
        }
        res.add(cur);
        for(int i=0;i<10;i++){
            if(cur*10+i<=n){
                solve(res,cur*10+i,n);
            }else{
                break;
            }
        }
    }
}
