package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/2.
 */
public class LC_Probelm_42{
    public static void main(String[] args){
        LC_Probelm_42 lc_probelm_42=new LC_Probelm_42();
        int trap=lc_probelm_42.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});
        System.out.println(trap);
    }
    public int trap(int[] height){
        int left=0;
        int right=height.length-1;
        int leftMax=0;
        int rightMax=0;
        int res=0;
        while(left<right){
            if(height[left]<height[right]){
                if(height[left]<leftMax){
                    res+=leftMax-height[left];
                }else{
                    leftMax=height[left];
                }
                left++;
            }else{
                if(height[right]<rightMax){
                    res+=rightMax-height[right];
                }else{
                    rightMax=height[right];
                }
                right--;
            }
        }
        return res;
    }
}
