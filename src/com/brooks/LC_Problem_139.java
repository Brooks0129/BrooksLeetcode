package com.brooks;
import java.util.Set;
/**
 * @author: 李松达
 * @date: 2016/7/16.
 */
public class LC_Problem_139{
    public boolean wordBreak(String s,Set<String> wordDict){
        boolean[] dp=new boolean[s.length()+1];
        dp[0]=true;
        for(int i=1;i<=s.length();i++){
            for(int j=0;j<i;j++){
                if(dp[j]&&wordDict.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
