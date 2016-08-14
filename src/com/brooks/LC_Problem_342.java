package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/8/14.
 */
public class LC_Problem_342{
    public boolean isPowerOfFour(int num){
        if(num<=0){
            return false;
        }
        if(num==1){
            return true;
        }
        int temp=num;
        int count=0;
        while(num!=0){
            if((num&1)==0){
                count++;
            }else{
                break;
            }
            num>>>=1;
        }
        return count%2==0&&1<<count==temp;
    }
}
