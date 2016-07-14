package com.brooks;
import java.util.ArrayList;
import java.util.List;
/**
 * @author: 李松达
 * @date: 2016/7/14.
 */
public class LC_Problem_118{
    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> res=new ArrayList<>();
        if(numRows==0){
            return res;
        }
        List<Integer> first=new ArrayList<>();
        first.add(1);
        res.add(first);
        while(--numRows!=0){
            List<Integer> pre=res.get(res.size()-1);
            int size=pre.size();
            List<Integer> cur=new ArrayList<>();
            cur.add(1);
            for(int i=0;i<size-1;i++){
                cur.add(pre.get(i)+pre.get(i+1));
            }
            cur.add(1);
            res.add(cur);
        }
        return res;
    }
}
