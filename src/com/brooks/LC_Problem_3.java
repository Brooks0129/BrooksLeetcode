package com.brooks;
import java.util.HashMap;
/**
 * @author: 李松达
 * @date: 2016/7/10.
 */
public class LC_Problem_3{
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0)
            return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        int[] dp = new int[chars.length];
        map.put(chars[0], 0);
        dp[0] = 1;
        for (int i = 1; i < chars.length; i++) {
            if (map.containsKey(chars[i]) && map.get(chars[i]) >= i - dp[i - 1]) {
                dp[i] = i - map.get(chars[i]);
            } else {
                dp[i] = dp[i - 1] + 1;
            }
            map.put(chars[i], i);
        }
        int res = 0;
        for (int i = 0; i < dp.length; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
