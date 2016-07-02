package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/2.
 * @description: Given two numbers represented as strings, return multiplication of the numbers as a string.
 * <p>
 * Note:
 * The numbers can be arbitrarily large and are non-negative.
 * Converting the input string to integer is NOT allowed.
 * You should NOT use internal library such as BigInteger.
 */
public class LC_Problem_43{
    public static void main(String[] args){
        LC_Problem_43 lc_problem_43=new LC_Problem_43();
        String multiply=lc_problem_43.multiply("2","500");
        System.out.println(multiply);
    }
    public String multiply(String num1,String num2){
        int len1=num1.length();
        int len2=num2.length();
        int[] res=new int[len1+len2];
        for(int i=len1-1;i>=0;i--){
            for(int j=len2-1;j>=0;j--){
                int cur=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                int high=i+j;
                int low=i+j+1;
                int sum=cur+res[low];
                res[low]=sum%10;
                res[high]+=sum/10;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i : res){
            if(i!=0||sb.length()!=0){
                sb.append(i);
            }
        }
        return sb.length()==0?"0":sb.toString();
    }
}
