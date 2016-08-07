package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/8/7.
 */
public class LC_Problem_275{
    public int hIndex(int[] citations){
        int left=0, len=citations.length, right=len-1;
        while(left<=right){
            int mid=(left+right)>>>1;
            if(citations[mid]==len-mid){
                return len-mid;
            }else if(citations[mid]<len-mid){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return len-right-1;
    }
}
