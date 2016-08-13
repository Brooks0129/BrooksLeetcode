package com.brooks;

/**
 * @author: 李松达
 * @date: 2016/7/16.
 */
public class LC_Problem_306 {
    public boolean isAdditiveNumber(String num) {
        int len = num.length();
        for (int i = 1; i <= (len - 1) / 2; i++) {
            if (num.charAt(0) == '0' && i >= 2) {
                break;
            }
            for (int j = i + 1; len - j >= Math.max(i, j - i); j++) {
                if (num.charAt(i) == '0' && j - i >= 2) {
                    break;
                }
                long num1 = Long.parseLong(num.substring(0, i));
                long num2 = Long.parseLong(num.substring(i, j));
                if (isAdditive(num.substring(j), num1, num2)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isAdditive(String s, long num1, long num2) {
        if (s.equals("")) {
            return true;
        }
        long sum = num1 + num2;
        String ss = String.valueOf(sum);
        if (!s.startsWith(ss)) {
            return false;
        }
        return isAdditive(s.substring(ss.length()), num2, sum);
    }
}
