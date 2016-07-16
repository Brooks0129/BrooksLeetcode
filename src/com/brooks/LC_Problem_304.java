package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/16.
 */
public class LC_Problem_304{
    class NumMatrix{
        int[][] sumRegion;
        public NumMatrix(int[][] matrix){
            if(matrix==null||matrix.length==0||matrix[0].length==0){
                return;
            }
            sumRegion=new int[matrix.length+1][matrix[0].length+1];
            for(int i=1;i<=matrix.length;i++){
                int sum=0;
                for(int j=1;j<=matrix[0].length;j++){
                    sum+=matrix[i-1][j-1];
                    sumRegion[i][j]=sumRegion[i-1][j]+sum;
                }
            }
        }
        public int sumRegion(int row1,int col1,int row2,int col2){
            return sumRegion[row2+1][col2+1]-sumRegion[row1][col2+1]
                    -sumRegion[row2+1][col1]+sumRegion[row1][col1];
        }
    }
}
