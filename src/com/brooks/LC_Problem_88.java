package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/7.
 */
public class LC_Problem_88{
    public static void main(String[] args){
        LC_Problem_88 lc_problem_88=new LC_Problem_88();
        int[] nums1={0};
        int[] nums2={1};
        lc_problem_88.merge(nums1,0,nums2,1);
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0){
            return;
        }
        int index=m+n-1;
        m--;
        n--;
        while(index>=0&&m>=0&&n>=0){
            if(nums1[m]>nums2[n]){
                nums1[index--]=nums1[m--];
            }else {
                nums1[index--]=nums2[n--];
            }
        }
        while(n>=0){
            nums1[index--]=nums2[n--];
        }
    }
}
