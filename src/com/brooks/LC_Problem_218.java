package com.brooks;
import java.util.*;
/**
 * @author: 李松达
 * @date: 2016/8/6.
 */
public class LC_Problem_218{
    public static void main(String[] args){
        int[][] buildings={{1,2,3},{1,3,4}};
        List<int[]> skyline=getSkyline(buildings);
        System.out.println(skyline);
    }
    public static List<int[]> getSkyline(int[][] buildings){
        List<int[]> result=new ArrayList<>();
        List<int[]> height=new ArrayList<>();
        for(int[] b : buildings){
            height.add(new int[]{b[0],-b[2]});
            height.add(new int[]{b[1],b[2]});
        }
        Collections.sort(height,(a,b)->{
            if(a[0]!=b[0])
                return a[0]-b[0];
            return a[1]-b[1];
        });
        Queue<Integer> pq=new PriorityQueue<>((a,b)->(b-a));
        pq.offer(0);
        int prev=0;
        for(int[] h : height){
            if(h[1]<0){
                pq.offer(-h[1]);
            }else{
                pq.remove(h[1]);
            }
            int cur=pq.peek();
            if(prev!=cur){
                result.add(new int[]{h[0],cur});
                prev=cur;
            }
        }
        return result;
    }
}
