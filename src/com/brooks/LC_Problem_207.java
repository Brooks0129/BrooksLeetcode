package com.brooks;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/**
 * @author: 李松达
 * @date: 2016/8/4.
 */
public class LC_Problem_207{
    public static void main(String[] args){
        int[][] pre=new int[][]{{1,0},{2,1}};
        boolean b=canFinish(3,pre);
        System.out.println(b);
    }
    public static boolean canFinish(int numCourses,int[][] prerequisites){
        ArrayList<Integer>[] graph=new ArrayList[numCourses];
        int[] degree=new int[numCourses];
        Queue<Integer> queue=new LinkedList<>();
        int count=0;
        for(int i=0;i<numCourses;i++){
            graph[i]=new ArrayList<Integer>();
        }
        for(int i=0;i<prerequisites.length;i++){
            degree[prerequisites[i][0]]++;
            graph[prerequisites[i][1]].add(prerequisites[i][0]);
        }
        for(int i=0;i<degree.length;i++){
            if(degree[i]==0){
                count++;
                queue.offer(i);
            }
        }
        while(!queue.isEmpty()){
            Integer node=queue.poll();
            for(int i=0;i<graph[node].size();i++){
                int index=graph[node].get(i);
                degree[index]--;
                if(degree[index]==0){
                    queue.offer(index);
                    count++;
                }
            }
        }
        return count==numCourses;
    }
}
