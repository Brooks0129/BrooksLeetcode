package com.brooks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author: 李松达
 * @date: 2016/7/11.
 */
public class LC_Problem_40{
    public List<List<Integer>> combinationSum2(int[] candidates,int target) {
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
                    if(j>i&&candidates[j]==candidates[j-1]){
                        continue;
                    }
                    cur.add(candidates[j]);
                    getResult(res,cur,candidates,target-candidates[j],j+1);
                    cur.remove(cur.size()-1);
                }
            }
        }else if(target==0){
            res.add(new ArrayList<Integer>(cur));
        }
    }
}
