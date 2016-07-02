package com.brooks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author: 李松达
 * @date: 2016/7/2.
 */
public class LC_Problem_39{
    public List<List<Integer>> combinationSum(int[] candidates,int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res=new ArrayList<>();
        getResult(res,new ArrayList<Integer>(),candidates,target,0);
        return res;
    }
    private void getResult(List<List<Integer>> res,ArrayList<Integer> cur,
                           int[] candidates,int target,int i){
        if(target>0){
            for(int j=i;j<candidates.length;j++){
                if(target>=candidates[j]){
                    cur.add(candidates[j]);
                    getResult(res,cur,candidates,target-candidates[j],j);
                    cur.remove(cur.size()-1);
                }
            }
        }else if(target==0){
            res.add(new ArrayList<Integer>(cur));
        }
    }
}
