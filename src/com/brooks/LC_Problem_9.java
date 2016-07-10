package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/10.
 */
public class LC_Problem_9{
    public boolean isPalindrome(int x){
        if(x<0)
            return false;
        int y=x;
        int len=0;
        while(y!=0){
            y/=10;
            len++;
        }
        int left=len-1;
        int right=0;
        while(left>=right){
            int rPow=(int)Math.pow(10,right);
            int lPow=(int)Math.pow(10,left);
            int r=x/rPow%10;
            int l=x/lPow%10;
            if(l!=r){
                return false;
            }
            left--;
            right++;
        }
        return true;
    }
}
