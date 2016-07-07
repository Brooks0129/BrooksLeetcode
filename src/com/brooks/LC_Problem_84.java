package com.brooks;

/**
 * @author: 李松达
 * @time: 2016/7/7 14:54.
 * @description:
 */
public class LC_Problem_84{
    public static void main(String[] args){
        LC_Problem_84 lc_problem_84=new LC_Problem_84();
        //[5,5,1,7,1,1,5,2,7,6]
        int rectangleArea=lc_problem_84.largestRectangleArea(new int[]{5,5,1,7,1,1,5,2,7,6});
        System.out.println(rectangleArea);
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
