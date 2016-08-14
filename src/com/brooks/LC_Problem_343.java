package com.brooks;

/**
 * @author: lisongda
 * @date: 16/8/14
 */
public class LC_Problem_343 {
    public int integerBreak(int n) {
        if (n <= 3) {
            return n - 1;
        }
        int res = 1;
        while (n > 4) {
            res *= 3;
            n -= 3;
        }
        return res * n;
    }
}
