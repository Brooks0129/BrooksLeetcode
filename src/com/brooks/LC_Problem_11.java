package com.brooks;

/**
 * @author: 李松达
 * @time: 2016/7/11 12:09.
 * @description:
 */
public class LC_Problem_11{
    public int maxArea(int[] height) {
        int area = 0, left = 0, right = height.length - 1;
        while (left < right) {
            area = Math.max(area, (right - left) *( height[left] < height[right] ? height[left++] : height[right--]));
        }
        return area;
    }
}
