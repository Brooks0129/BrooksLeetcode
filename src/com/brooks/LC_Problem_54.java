package com.brooks;
import java.util.ArrayList;
import java.util.List;
/**
 * @author: 李松达
 * @date: 2016/7/4.
 */
public class LC_Problem_54{
    public static void main(String[] args){
        int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        LC_Problem_54 lc_problem_54=new LC_Problem_54();
        List<Integer> integers=lc_problem_54.spiralOrder(matrix);
        for(int i:integers){
            System.out.println(i);
        }
    }
    public List<Integer> spiralOrder(int[][] matrix){
        if(matrix==null||matrix.length==0||matrix[0].length==0){
            return new ArrayList<Integer>();
        }
        int i=0;
        List<Integer> res=new ArrayList<>();
        while( 2*i<Math.min(matrix.length-1,matrix[0].length-1)){
            for(int k=i;k<matrix[0].length-1-i;k++){
                res.add(matrix[i][k]);
            }
            for(int k=i;k<matrix.length-i-1;k++){
                res.add(matrix[k][matrix[0].length-1-i]);
            }
            for(int k=matrix[0].length-1-i;k>i;k--){
                res.add(matrix[matrix.length-i-1][k]);
            }
            for(int k=matrix.length-1-i;k>i;k--){
                res.add(matrix[k][i]);
            }
            i++;

        }
       if(2*i>Math.min(matrix.length-1,matrix[0].length-1))
           return res;
        if(matrix.length<matrix[0].length){
            for(int k=i;k<=matrix[0].length-1-i;k++){
                res.add(matrix[i][k]);
            }
        }else {
            for(int k=i;k<=matrix.length-1-i;k++){
                res.add(matrix[k][i]);
            }
        }
        return res;
    }
}
