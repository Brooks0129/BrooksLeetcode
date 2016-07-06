package com.brooks;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 李松达
 * @time: 2016/7/6 13:19.
 * @description:
 */
public class LC_Problem_77{
    public static void main(String[] args){
        LC_Problem_77 lc_problem_77=new LC_Problem_77();
        List<List<Integer>> combine=lc_problem_77.combine(4,2);
        System.out.println(combine);

    }

    public List<List<Integer>> combine(int n,int k){
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> cur=new ArrayList<>();
        chooseK(n,res,cur,1,k);
        return res;
    }

    /**
     * choose k numbers from 1-n
     *
     * @param n
     * @param res
     * @param cur
     * @param index
     * @param k
     */
    private void chooseK(int n,List<List<Integer>> res,List<Integer> cur,int index,int k){
        if(cur.size()>=k){
            /*for(int i=0;i<cur.size();i++){
                System.out.print(cur.get(i)+" ");
            }
            System.out.println();*/
            //getCombine(res,new ArrayList<Integer>(cur));
            res.add(new ArrayList<Integer>(cur));
            return;
        }
        for(int i=index;i<=n;i++){
            cur.add(i);
            chooseK(n,res,cur,++index,k);
            cur.remove(cur.size()-1);
        }
    }

 /*   *//**
     * get Combinations with k numbers
     *
     * @param res
     * @param integers
     *//*
    private void getCombine(List<List<Integer>> res,ArrayList<Integer> integers){
        getCombine(res,integers,new ArrayList<Integer>(),0,integers.size());
    }

    *//**
     * get Combinations with k numbers
     *
     * @param res
     * @param integers
     * @param cur
     * @param index
     *//*
    private void getCombine(List<List<Integer>> res,
                            ArrayList<Integer> integers,
                            ArrayList<Integer> cur,
                            int index,
                            int k){
        if(cur.size()==k){
            res.add(new ArrayList<Integer>(cur));
            return;
        }
        for(int i=index;i<integers.size();i++){
            Integer integer=integers.get(i);
            cur.add(integer);
            integers.remove(integer);
            getCombine(res,integers,cur,index,k);
            cur.remove(cur.size()-1);
            integers.add(i,integer);
        }
    }*/
}
