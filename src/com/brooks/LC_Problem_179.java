package com.brooks;
import java.util.Arrays;
import java.util.Comparator;
/**
 * @author: 李松达
 * @date: 2016/8/3.
 */
public class LC_Problem_179{
    public String largestNumber(int[] nums){
        String[] ss=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            ss[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(ss,new Comparator<String>(){
            @Override
            public int compare(String o1,String o2){
                return (o2+o1).compareTo(o1+o2);
            }
        });
        StringBuilder sb=new StringBuilder();
        for(String s : ss){
            if(s.equals("0")&&sb.length()==0){
                continue;
            }
            sb.append(s);
        }
        return sb.length()==0?"0":sb.toString();
    }
}
