package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/31.
 */
public class LC_Problem_134{
    public static void main(String[] args){
        int[] gas={1,2};
        int[] cost={2,1};
        int canCompleteCircuit=canCompleteCircuit(gas,cost);
        System.out.println(canCompleteCircuit);
    }
    public static int canCompleteCircuit(int[] gas,int[] cost){
        int start=gas.length;
        int end=0;
        int sum=0;
        do{
            if(sum>0){
                sum+=gas[end]-cost[end];
                end++;
            }else{
                start--;
                sum+=gas[start]-cost[start];
            }
        }while(start!=end);
        return sum>0?start:-1;
    }
}
