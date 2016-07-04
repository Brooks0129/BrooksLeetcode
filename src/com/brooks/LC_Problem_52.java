package com.brooks;

/**
 * @author: 李松达
 * @time: 2016/7/4 16:42.
 * @description:
 */
public class LC_Problem_52{
    public int totalNQueens(int n){
        int[] res=new int[1];
        if(n<=0){
            return 0;
        }
        int[][] chars=new int[n][n];
        getNQueues(res,chars,n,0);
        return res[0];
    }

    private void getNQueues(int[] res,int[][] chars,int n,int index){
        if(index>=n){
            res[0]++;
            return;
        }
        for(int i=0;i<n;i++){
            if(isValid(chars,i,index)){
                chars[i][index]=1;
                getNQueues(res,chars,n,index+1);
                chars[i][index]=0;
            }
        }
    }

    private boolean isValid(int[][] chars,int x,int y){
        for(int i=0;i<chars.length;i++){
            for(int j=0;j<chars.length;j++){
                if(chars[i][j]==1&&(!(x==i&&y==j)&&(x==i||y==j||x+y==i+j||x-y==i-j))){
                    return false;
                }
            }
        }
        return true;
    }
}
