package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/5.
 */
public class LC_Problem_66{
    public static void main(String[] args){
        LC_Problem_66 lc_problem_66=new LC_Problem_66();
        int[] ints=lc_problem_66.plusOne(new int[]{1,9});
        for(int i : ints){
            System.out.println(i);
        }
    }
    public int[] plusOne(int[] digits){
        boolean carry=true;
        for(int i=0;i<digits.length;i++){
            if(digits[i]!=9){
                carry=false;
                break;
            }
        }
        if(carry){
            int[] res=new int[digits.length+1];
            res[0]=1;
            return res;
        }else{
            carry=false;
            if(digits[digits.length-1]==9){
                carry=true;
            }else{
                digits[digits.length-1]++;
            }
            for(int i=digits.length-1;i>=0;i--){
                digits[i]=(carry?1:0)+digits[i];
                if(digits[i]==10){
                    digits[i]=0;
                    carry=true;
                }else{
                    carry=false;
                }
            }
            return digits;
        }
    }
}
