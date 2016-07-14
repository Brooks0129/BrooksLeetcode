package com.brooks;
import java.util.ArrayList;
import java.util.List;
/**
 * @author: 李松达
 * @date: 2016/7/14.
 */
public class LC_Problem_119{
    public static void main(String[] args){
        LC_Problem_119 lc_problem_119=new LC_Problem_119();
        List<Integer> list=lc_problem_119.getRow(4);
        System.out.println(list.toString());
    }
    public List<Integer> getRow(int rowIndex){
        List<Integer> res=new ArrayList<>();
        res.add(1);
        for(int i=0;i<rowIndex;i++){
            int temp=res.get(0);
            for(int j=1;j<=i;j++){
                int tmp=temp+res.get(j);
                temp=res.get(j);
                res.set(j,tmp);
            }
            res.add(1);
        }
        return res;
    }
}
