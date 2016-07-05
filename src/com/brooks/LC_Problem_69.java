package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/5.
 */
public class LC_Problem_69{
    public static void main(String[] args){
        LC_Problem_69 lc_problem_69=new LC_Problem_69();
        System.out.println(Integer.MAX_VALUE);
        int i=lc_problem_69.mySqrt(2147395599);
        System.out.println(i);
    }
    public int mySqrt(int x){
        if(x<0){
            return Integer.MIN_VALUE;
        }
        long left=0;
        long right=x;
        while(left<=right){
            long mid=(left+right)>>1;
            if(mid*mid<=x&&(mid+1)*(mid+1)>x){
                return (int)mid;
            }else if(mid*mid>x){
                right=mid-1;
            }else {
                left=mid+1;
            }
        }
        return 0;
    }
}
