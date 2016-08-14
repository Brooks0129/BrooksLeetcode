package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/8/8.
 */
public class LC_Problem_289{
    public static void main(String[] args){
        new LC_Problem_289().gameOfLife(new int[][]{{1,1},{1,0}});
    }
    public void gameOfLife(int[][] board){
        if(board==null){
            return;
        }
        int m=board.length;
        int n=board[0].length;
        if(m==0||n==0){
            return;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int lives=getLives(board,i,j,m,n);
                if(board[i][j]==0&&lives==3){
                    board[i][j]=2;
                }
                if(board[i][j]==1&&lives>=2&&lives<=3){
                    board[i][j]=3;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                board[i][j]>>>=1;
            }
        }
    }
    private int getLives(int[][] board,int i,int j,int m,int n){
        int lives=0;
        for(int a=Math.max(i-1,0);a<=Math.min(i+1,m-1);a++){
            for(int b=Math.max(j-1,0);b<=Math.min(j+1,n-1);b++){
                lives+=board[a][b]&1;
            }
        }
        return lives-(board[i][j]&1);
    }
}
