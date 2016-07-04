package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/4.
 */
public class LC_Problem_59{
    public static void main(String[] args){
        LC_Problem_59 lc_problem_59=new LC_Problem_59();
        int[][] ints=lc_problem_59.generateMatrix(3);
        for(int[] ii:ints){
            for(int i:ii){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public int[][] generateMatrix(int n){
        int[][] res=new int[n][n];
        int i=0;
        int num=0;
        while(i<(n+1)/2){
            for(int j=i;j<n-1-i;j++){
                res[i][j]=++num;
            }
            for(int j=i;j<n-1-i;j++){
                res[j][n-i-1]=++num;
            }
            for(int j=n-1-i;j>i;j--){
                res[n-1-i][j]=++num;
            }
            for(int j=n-1-i;j>i;j--){
                res[j][i]=++num;
            }
            i++;
        }
        if(n%2!=0){
             res[n/2][n/2]=n*n;
        }
        return res;
    }
}
