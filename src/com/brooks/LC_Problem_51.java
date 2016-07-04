package com.brooks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author: 李松达
 * @time: 2016/7/4 14:51.
 * @description:
 */
public class LC_Problem_51{
    public static void main(String[] args){
        LC_Problem_51 lc_problem_51=new LC_Problem_51();
        List<List<String>> lists=lc_problem_51.solveNQueens(8);
        System.out.println(lists);
    }

    public List<List<String>> solveNQueens(int n){
        List<List<String>> res=new ArrayList<>();
        if(n<=0){
            return res;
        }
        char[][] queue=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                queue[i][j]='.';
            }
        }
        getNQueue(res,n,queue,0);
        return res;
    }

    private void getNQueue(List<List<String>> res,int n,char[][] queue,int index){
        if(index>=n){
            List<String> cur=new ArrayList<>();
            for(int i=0;i<n;i++){
                cur.add(String.valueOf(queue[i]));
            }
            res.add(cur);
        }
        for(int i=0;i<n;i++){
            if(isValid(queue,i,index)){
                if(queue[i][index]=='.'){
                    queue[i][index]='Q';
                    getNQueue(res,n,queue,index+1);
                    queue[i][index]='.';
                }
            }
        }
    }

    private boolean isValid(char[][] board,int x,int y){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='Q'&&(x+j==y+i||x+y==i+j||x==i||y==j)&&(x!=i||y!=j))
                    return false;
            }
        }

        return true;
    }
}
