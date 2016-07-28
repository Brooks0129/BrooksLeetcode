package com.brooks.otherProblems;
import java.util.HashMap;
import java.util.Map;
/**
 * @author: 李松达
 * @date: 2016/7/28.
 */
public class Max_Points_on_a_Line{
    public int maxPoints(Point[] points){
        if(points==null){
            return 0;
        }
        if(points.length<=2){
            return points.length;
        }
        Map<Integer,Map<Integer,Integer>> map=new HashMap<>();
        int res=0;
        for(int i=0;i<points.length;i++){
            map.clear();
            int overlap=0;
            int max=0;
            for(int j=i+1;j<points.length;j++){
                int difX=points[i].x-points[j].x;
                int difY=points[i].y-points[j].y;
                if(difX==0&&difY==0){
                    overlap++;
                    continue;
                }
                int gdc=gdc(difX,difY);
                int x=gdc==0?difX:difX/gdc;
                int y=gdc==0?difY:difY/gdc;
                if(map.containsKey(x)){
                    Map<Integer,Integer> cur=map.get(x);
                    if(cur.containsKey(y)){
                        cur.put(y,cur.get(y)+1);
                    }else{
                        cur.put(y,1);
                    }
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
    private int gdc(int x,int y){
        if(y==0){
            return x;
        }
        return gdc(y,x%y);
    }
    class Point{
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
