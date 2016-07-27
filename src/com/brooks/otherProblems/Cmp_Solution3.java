package com.brooks.otherProblems;
import java.util.*;
/**
 * @author: 李松达
 * @date: 2016/7/27.
 * @description: 解法三：BFS 有向图判断两个节点之间是否存在路径
 */
public class Cmp_Solution3{
    public int cmp(int g1,int g2,int[][] records,int n){
        //map<k,v>表示以k为起点，可以到达的路径
        Map<Integer,List<Integer>> path=new HashMap<>();
        for(int i=0;i<n;i++){
            if(path.containsKey(records[i][0])){
                path.get(records[i][0]).add(records[i][1]);
            }else{
                List<Integer> list=new ArrayList<>();
                list.add(records[i][1]);
                path.put(records[i][0],list);
            }
        }
        if(hasPath(path,g1,g2)){
            return 1;
        }else if(hasPath(path,g2,g1)){
            return -1;
        }else{
            return 0;
        }
    }
    //宽度优先
    private boolean hasPath(Map<Integer,List<Integer>> path,int from,int to){
        Queue<Integer> queue=new LinkedList<>();
        Set<Integer> visited=new HashSet<>();
        visited.add(from);//not necessary
        queue.offer(from);
        while(!queue.isEmpty()){
            int cur=queue.poll();
            List<Integer> list=path.get(cur);
            if(list==null){
                continue;
            }
            for(int n : list){
                if(n==to){
                    return true;
                }
                if(visited.add(n)){
                    queue.offer(n);
                }
            }
        }
        return false;
    }
}
