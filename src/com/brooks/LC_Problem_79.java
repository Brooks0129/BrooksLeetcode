package com.brooks;

/**
 * @author: 李松达
 * @time: 2016/7/6 16:07.
 * @description:
 */
public class LC_Problem_79{
    public static void main(String[] args){
        LC_Problem_79 lc_problem_79=new LC_Problem_79();
        char[][] board={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        boolean exist=lc_problem_79.exist(board,"FDF");
        System.out.println(exist);
    }
    public boolean exist(char[][] board,String word){
        int m=board.length;
        int n=board[0].length;
        boolean[][] flag=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==word.charAt(0)){
                    flag[i][j]=true;
                    if(isPath(0,word,board,flag,i,j)){
                        return true;
                    }
                    flag[i][j]=false;
                }
            }
        }
        return false;
    }

    private boolean isPath(int index,String word,char[][] board,boolean[][] flag,int row,int col){
        if(index==word.length()-1){
            return true;
        }
        char c=word.charAt(index+1);
        if(canGoLeft(board,row,col,flag,c)){
            flag[row][col-1]=true;
            if(isPath(index+1,word,board,flag,row,col-1)){
                return true;
            }
            flag[row][col-1]=false;
        }
        if(canGoRight(board,row,col,flag,c)){
            flag[row][col+1]=true;
            if(isPath(index+1,word,board,flag,row,col+1)){
                return true;
            }
            flag[row][col+1]=false;
        }
        if(canGoUp(board,row,col,flag,c)){
            flag[row-1][col]=true;
            if(isPath(index+1,word,board,flag,row-1,col)){
                return true;
            }
            flag[row-1][col]=false;
        }
        if(canGoDown(board,row,col,flag,c)){
            flag[row+1][col]=true;
            if(isPath(index+1,word,board,flag,row+1,col)){
                return true;
            }
            flag[row+1][col]=false;
        }
        return false;
    }

    private boolean canGoDown(char[][] board,int row,int col,boolean[][] flag,char c){
        if(row==board.length-1){
            return false;
        }
        if(flag[row+1][col]){
            return false;
        }
        return c==board[row+1][col];
    }

    private boolean canGoUp(char[][] board,int row,int col,boolean[][] flag,char c){
        if(row==0){
            return false;
        }
        if(flag[row-1][col]){
            return false;
        }
        return c==board[row-1][col];
    }

    private boolean canGoRight(char[][] board,int row,int col,boolean[][] flag,char c){
        if(col==board[0].length-1){
            return false;
        }
        if(flag[row][col+1]){
            return false;
        }
        return c==board[row][col+1];
    }

    private boolean canGoLeft(char[][] board,int row,int col,boolean[][] flag,char c){
        if(col==0){
            return false;
        }
        if(flag[row][col-1]){
            return false;
        }
        return c==board[row][col-1];
    }
}
