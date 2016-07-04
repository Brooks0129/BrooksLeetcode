package com.brooks;

/**
 * @author: 李松达
 * @time: 2016/7/4 13:00.
 * @description:
 */
public class LC_Problem_48{
    public void rotate(int[][] matrix){
        if(matrix==null||matrix.length==1){
            return;
        }
        int len=matrix.length;
        int i=0;
        int j=len-1;
        while(i<j){
            for(int k=0;k<j-i;k++){
                int temp=matrix[j-k][i];
                matrix[j-k][i]=matrix[j][j-k];
                matrix[j][j-k]=matrix[i+k][j];
                matrix[i+k][j]=matrix[i][i+k];
                matrix[i][i+k]=temp;
            }
            i++;
            j--;
        }
    }
}
