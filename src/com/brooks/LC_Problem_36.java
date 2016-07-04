package com.brooks;
import java.util.HashSet;

/**
 * @author: 李松达
 * @date: 2016/6/21.
 */
public class LC_Problem_36{
    public boolean isValidSudoku(char[][] board){
        int length=board.length;
        for(int i=0;i<length;i++){
            HashSet<Character> set1=new HashSet<>();
            HashSet<Character> set2=new HashSet<>();
            HashSet<Character> set3=new HashSet<>();
            for(int j=0;j<length;j++){
                if(board[i][j]!='.'&&!set1.add(board[i][j])){
                    return false;
                }
                if(board[i][j]!='.'&&!set2.add(board[j][i])){
                    return false;
                }
                int row=3*(i/3);
                int col=3*(i%3);
                char cur=board[row+j/3][col+j%3];
                if(cur!='.'&&!set3.add(cur)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean solve(char[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='.'){
                    for(char k='1';k<'9';k++){
                        if(isValidSudoku(board)){
                            board[i][j]=k;
                            if(solve(board)){
                                return true;
                            }
                            board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board){
        if(board==null||board.length==0){
            return;
        }
        solve(board);
    }
}
