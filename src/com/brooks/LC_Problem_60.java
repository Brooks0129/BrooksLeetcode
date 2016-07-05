package com.brooks;
import java.util.ArrayList;
import java.util.List;
/**
 * @author: 李松达
 * @date: 2016/7/5.
 */
public class LC_Problem_60{
    public static void main(String[] args){
        LC_Problem_60 lc_problem_60=new LC_Problem_60();
        String s=lc_problem_60.getPermutation(4,15);
        System.out.println(s);
    }
    public String getPermutation(int n, int k) {
        List<Integer> nums=new ArrayList<>();
        for(int i=1;i<=n;i++){
            nums.add(i);
        }
        int[] fac=new int[n];
        fac[0]=1;
        for(int i=1;i<n;i++){
            fac[i]=i*fac[i-1];
        }
        StringBuilder sb=new StringBuilder();
        k--;
        for(int i=0;i<n;i++){
            int index=k/fac[n-1-i];
            sb.append(nums.get(index));
            k-=index*fac[n-1-i];
            nums.remove(index);
        }
        return sb.toString();
    }
}
