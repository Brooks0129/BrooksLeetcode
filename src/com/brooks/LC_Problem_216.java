package com.brooks;
import java.util.ArrayList;
import java.util.List;
/**
 * @author: 李松达
 * @date: 2016/8/6.
 */
public class LC_Problem_216{
    public static void main(String[] args){
        LC_Problem_216 lc_problem_216=new LC_Problem_216();
        List<List<Integer>> lists=lc_problem_216.combinationSum3(3,7);
        System.out.println(lists);
    }
    public List<List<Integer>> combinationSum3(int k,int n) {
List<List<Integer>> res=new ArrayList<>();
        combination(res,new ArrayList<Integer>(),1,k,n);
        return res;
    }
    private void combination(List<List<Integer>> res,ArrayList<Integer> cur,int index,int k,int n){
        if(cur.size()==k){
            if(n==0){
                res.add(new ArrayList<>(cur));
            }else {
                return;
            }
        }
        for(int i=index;i<=9;i++){
            cur.add(i);
            combination(res,cur,i+1,k,n-i);
            cur.remove(cur.size()-1);
        }
    }
}
