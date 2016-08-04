package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/8/4.
 */
public class LC_Problem_200{
    public int numIslands(char[][] grid){
        int res=0;
        if(grid==null||grid.length==0||grid[0].length==0){
            return 0;
        }
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    res++;
                    dfs(grid,i,j);
                }
            }
        }
        return res;
    }
    private void dfs(char[][] grid,int i,int j){
        grid[i][j]='2';
        if(i>0&&grid[i-1][j]=='1'){
            dfs(grid,i-1,j);
        }
        if(i<grid.length-1&&grid[i+1][j]=='1'){
            dfs(grid,i+1,j);
        }
        if(j>0&&grid[i][j-1]=='1'){
            dfs(grid,i,j-1);
        }
        if(j<grid[0].length-1&&grid[i][j+1]=='1'){
            dfs(grid,i,j+1);
        }
    }
}
