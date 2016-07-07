package com.brooks;

/**
 * @author: 李松达
 * @time: 2016/7/7 16:44.
 * @description:
 */
public class LC_Problem_85{
    public static void main(String[] args){
        LC_Problem_85 lc_problem_85=new LC_Problem_85();
        char[][] chars=new char[1][2];
        chars[0][0]='1';
        chars[0][1]='2';
        lc_problem_85.maximalRectangle(chars);
    }
    public int maximalRectangle(char[][] matrix){
        int top=getTop(matrix);
        if(top==-1){
            return 0;
        }
        int bottom=getBottom(matrix);
        int left=getLeft(matrix);
        int right=getRight(matrix);
        return (bottom-top+1)*(right-left+1);
    }

    private int getRight(char[][] matrix){
        for(int i=matrix[0].length-1;i>=0;i--){
            for(int j=matrix.length-1;j>=0;j--){
                if(matrix[j][i]=='1'){
                    return i;
                }
            }
        }
        return -1;
    }

    private int getLeft(char[][] matrix){
        for(int i=0;i<matrix[0].length;i++){
            for(int j=0;j<matrix.length;j++){
                if(matrix[j][i]=='1'){
                    return i;
                }
            }
        }
        return -1;
    }

    private int getBottom(char[][] matrix){
        for(int i=matrix.length-1;i>=0;i--){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]=='1'){
                    return i;
                }
            }
        }
        return -1;
    }

    private int getTop(char[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]=='1'){
                    return i;
                }
            }
        }
        return -1;

    }
}
