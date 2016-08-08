package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/8/8.
 */
public class LC_Problem_279_BFS{
    //but TLE
    int min=Integer.MAX_VALUE;
    public int numSquares(int n){
        bfs(n,0);
        return min;
    }
    private void bfs(int n,int len){
        if(n==0){
            min=Math.min(min,len);
            return;
        }else if(n<0){
            return;
        }
        int j=(int)Math.sqrt(n);
        if(len>min){
            return;
        }
        while(j*j<=n){
            bfs(n-j*j,len+1);
            j--;
        }
    }
}
