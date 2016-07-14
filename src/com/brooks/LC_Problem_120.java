package com.brooks;
import java.util.ArrayList;
import java.util.List;
/**
 * @author: 李松达
 * @date: 2016/7/11.
 */
public class LC_Problem_120{
    public static void main(String[] args){
        LC_Problem_120 lc_problem_120=new LC_Problem_120();
        List<List<Integer>> triangle=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        list1.add(-10);
        triangle.add(list1);
        List<Integer> list2=new ArrayList<>();
        list2.add(1);
        list2.add(2);
        triangle.add(list2);
        List<Integer> list3=new ArrayList<>();
        list3.add(4);
        list3.add(5);
        list3.add(1);
        triangle.add(list3);
        int i=lc_problem_120.minimumTotal(triangle);
        System.out.println(i);
    }
    public int minimumTotal(List<List<Integer>> triangle){
        List<Integer> dp=new ArrayList<>();
        for(int i=0;i<triangle.get(triangle.size()-1).size();i++){
            dp.add(0);
        }
        dp.set(0,triangle.get(0).get(0));
        for(int i=1;i<triangle.size();i++){
            List<Integer> cur=triangle.get(i);
            int size=cur.size();
            int temp=dp.get(0);
            for(int j=0;j<size;j++){
                if(j==size-1){
                    int v=temp+cur.get(j);
                    dp.set(j,v);
                }else{
                    int v=cur.get(j)+Math.min(temp,dp.get(j));
                    temp=dp.get(j);
                    dp.set(j,v);
                }
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<dp.size();i++){
            min=Math.min(min,dp.get(i));
        }
        return min;
    }
}
