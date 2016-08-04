package com.brooks;
import java.util.HashSet;
import java.util.Set;
/**
 * @author: 李松达
 * @date: 2016/8/4.
 */
public class LC_Problem_202{
    Set<Integer> map=new HashSet<>();
    public boolean isHappy(int n){
        if(!map.add(n)){
            return false;
        }
        int sum=0;
        while(n!=0){
            sum+=Math.pow(n%10,2);
            n/=10;
        }
        if(sum==1){
            return true;
        }else{
            return isHappy(sum);
        }
    }
}
