package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/11.
 */
public class LC_Problem_32{
    public int longestValidParentheses(String s){
        if(s==null||s.length()==0){
            return 0;
        }
        int[] dp=new int[s.length()];
        dp[0]=0;
        char[] chars=s.toCharArray();
        for(int i=1;i<chars.length;i++){
            if(chars[i]=='('){
                dp[i]=0;
            }else{
                if(chars[i-1]=='('){
                    dp[i]=(i-2>=0?dp[i-2]:0)+2;
                }else{
                    if(i-dp[i-1]-1>=0&&chars[i-dp[i-1]-1]=='('){
                        int tmp=dp[i-1]+2;
                        dp[i]=tmp+((i-tmp>=0)?dp[i-tmp]:0);
                    }else{
                        dp[i]=0;
                    }
                }
            }
        }
        int max=0;
        for(int i=0;i<=dp.length-1;i++){
            max=Math.max(max,dp[i]);
        }
        return max;
    }
}
