package com.brooks;
/**
 * @author: 李松达
 * @time: 2016/7/7 16:44.
 * @description: Given a 2D binary matrix filled with 0's and 1's,
 * find the largest rectangle containing all ones and return its area.
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
        if(matrix==null||matrix.length==0||matrix[0].length==0){
            return 0;
        }
        int[] dp=new int[matrix[0].length];
        for(int i=0;i<matrix[0].length;i++){
            dp[i]=matrix[0][i]-'0';
        }
        int max=largestRectangleArea(dp);
        for(int i=1;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                dp[j]=matrix[i][j]=='0'?0:(1+dp[j]);
            }
            max=Math.max(max,largestRectangleArea(dp));
        }
        return max;
    }
    public int largestRectangleArea(int[] heights){
        if(heights==null||heights.length==0){
            return 0;
        }
        return getArea(heights,0,heights.length);
    }
    private int getArea(int[] heights,int start,int end){
        if(start+1==end){
            return heights[start];
        }
        boolean sorted=true;
        int minIndex=start;
        for(int i=start;i<end;i++){
            if(i>start&&heights[i]<heights[i-1]) sorted=false;
            if(heights[minIndex]>heights[i]) minIndex=i;
        }
        if(sorted){
            int max=0;
            for(int i=start;i<end;i++){
                max=Math.max(max,heights[i]*(end-i));
            }
            return max;
        }
        int areaLeft=(minIndex>start)?getArea(heights,start,minIndex):0;
        int areaRight=(minIndex<end-1)?getArea(heights,minIndex+1,end):0;
        return Math.max((end-start)*heights[minIndex],Math.max(areaLeft,areaRight));
    }
}
