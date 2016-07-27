package com.brooks.otherProblems;
import java.util.HashSet;
import java.util.Set;
/**
 * @author: 李松达
 * @date: 2016/7/27.
 * @description: 解法二：
 * 使用两个set，一个用于存储比g1大的数，一个用于存储比g1小的数,一直更新这两个set
 */
public class Cmp_Solution2{
    public int cmp(int g1,int g2,int[][] records,int n){
        Set<Integer> more=new HashSet<>();
        Set<Integer> less=new HashSet<>();
        for(int i=0;i<n;i++){
            if(records[i][0]==g1){
                if(records[i][1]==g2){
                    return 1;
                }
                less.add(records[i][1]);
            }
            if(records[i][1]==g1){
                if(records[i][0]==g2){
                    return -1;
                }
                more.add(records[i][0]);
            }
        }
        for(int i=0;i<n;i++){
            if(records[i][0]==g1||records[i][1]==g1){
                continue;
            }
            if(more.contains(records[i][1])){
                if(records[i][0]==g2){
                    return -1;
                }
                more.add(records[i][0]);
            }
            if(less.contains(records[i][0])){
                if(records[i][1]==g2){
                    return 1;
                }
                less.add(records[i][1]);
            }
        }
        return 0;
    }
}
