package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/10.
 */
public class LC_Problem_7{
    public int reverse(int x){
        int absX=-Math.abs(x);
        int res=0;
        while(absX!=0){
            if(res<(Integer.MIN_VALUE-absX%10)/10){
                res=0;
                break;
            }
            res=res*10+absX%10;
            absX/=10;
        }
        if(res==Integer.MIN_VALUE){
            if(x>0){
                return 0;
            }else{
                return Integer.MIN_VALUE;
            }
        }
        return x>0?-res:res;
    }
}
