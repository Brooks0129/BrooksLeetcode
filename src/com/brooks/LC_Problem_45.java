package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/3.
 */
public class LC_Problem_45{
    public static void main(String[] args){
        LC_Problem_45 lc_problem_45=new LC_Problem_45();
        lc_problem_45.jump(new int[]{1,2,1,0,0,1});
    }
    public int jump(int[] nums){
        int res=0;
        int max=0;
        int curMax=0;
        for(int i=0;i<nums.length;i++){
            if(max<i){
                return Integer.MAX_VALUE;
            }
            if(curMax<i){
                res++;
                curMax=max;
            }
            max=Math.max(max,nums[i]+i);
        }
        return res;
    }
}
