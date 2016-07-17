package com.brooks;
import java.util.HashMap;
/**
 * @author: 李松达
 * @date: 2016/7/17.
 */
public class LC_Problem_149{
    public static void main(String[] args){
        LC_Problem_149 lc_problem_149=new LC_Problem_149();
        Point[] points=new Point[3];
        points[0]=new Point(2,3);
        points[1]=new Point(3,3);
        points[2]=new Point(-5,3);
        int i=lc_problem_149.maxPoints(points);
        System.out.println(i);
    }
    /**
     * 思路：HashMap<x,HashMap<y,count>
     * point[i]保持不变,j=i+1,j++
     * 求出i和j点的横纵坐标之差为difX和difY
     * difX和difY分别除以他们的的最大公约数
     * 如果difX和difY都相等，则处于同一直线
     *
     * @param points
     * @return
     */
    public int maxPoints(Point[] points){
        if(points==null){
            return 0;
        }
        if(points.length<=2){
            return points.length;
        }
        int res=0;
        HashMap<Integer,HashMap<Integer,Integer>> map=new HashMap<>();
        for(int i=0;i<points.length;i++){
            map.clear();
            int overlap=0;
            int max=0;
            for(int j=i+1;j<points.length;j++){
                int difX=points[j].x-points[i].x;
                int difY=points[j].y-points[i].y;
                if(difX==0&&difY==0){
                    overlap++;
                    continue;
                }
                int gdc=gdc(difX,difY);
                int x=gdc==0?difX:difX/gdc;
                int y=gdc==0?difY:difY/gdc;
                if(map.containsKey(x)){
                    HashMap<Integer,Integer> cur=map.get(x);
                    cur.put(y,cur.containsKey(y)?cur.get(y)+1:1);
                    map.put(x,cur);
                }else{
                    HashMap<Integer,Integer> cur=new HashMap<>();
                    cur.put(y,1);
                    map.put(x,cur);
                }
                max=Math.max(max,map.get(x).get(y));
            }
            res=Math.max(res,max+overlap+1);
        }
        return res;
    }
    /**
     * @param x
     * @param y
     * @return x与y的最大公约数
     */
    private int gdc(int x,int y){
        if(y==0)
            return x;
        return gdc(y,x%y);
    }
    static class Point{
        int x;
        int y;
        Point(){
            x=0;
            y=0;
        }
        Point(int a,int b){
            x=a;
            y=b;
        }
    }
}
