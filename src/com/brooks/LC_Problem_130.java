package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/14.
 */
public class LC_Problem_130{
    public void solve(char[][] board){
        if(board==null||board.length<=2||board[0].length<=2){
            return;
        }
        int row=board.length;
        int col=board[0].length;
        for(int i=0;i<row;i++){
            if(board[i][0]=='O'){
                dfs(board,i,0);
            }
            if(board[i][col-1]=='O'){
                dfs(board,i,col-1);
            }
        }
        for(int i=0;i<col;i++){
            if(board[0][i]=='O'){
                dfs(board,0,i);
            }
            if(board[row-1][i]=='O'){
                dfs(board,row-1,i);
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]=='O')
                    board[i][j]='X';
                else if(board[i][j]=='$')
                    board[i][j]='O';
            }
        }
    }
    private void dfs(char[][] board,int i,int j){
        if(i<0||i>board.length-1||j<0||j>board[0].length-1){
            return;
        }
        if(board[i][j]=='O'){
            board[i][j]='$';
        }
        if(i>1&&board[i-1][j]=='O'){
            dfs(board,i-1,j);
        }
        if(i<board.length-2&&board[i+1][j]=='O'){
            dfs(board,i+1,j);
        }
        if(j>1&&board[i][j-1]=='O'){
            dfs(board,i,j-1);
        }
        if(j<board[0].length-2&&board[i][j+1]=='O'){
            dfs(board,i,j+1);
        }
    }
}
