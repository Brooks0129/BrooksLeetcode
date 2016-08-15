package com.brooks;

import java.sql.Array;
import java.util.*;

/**
 * @author: lisongda
 * @date: 16/8/15
 */
public class LC_Problem_315 {
    public static void main(String[] args) {
        List<Integer> list = new LC_Problem_315().countSmaller(
                new int[]{26,78,27,100,33,67,90,23,66,5,38,7,35,23,52,22,83,51,98,
                69,81,32,78,28,94,13,2,97,3,76,99,51,9,21,84,66,65,36,100,41});
        System.out.println(list.toString());
    }
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> res = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            res.add(0, getSmaller(list, nums[i]));
        }
        return res;
    }

    private int getSmaller(List<Integer> list, int num) {
        int left = 0;
        int right = list.size() - 1;
        while (left <= right) {
            int mid = (left + right) >>> 1;
            if (list.get(mid) == num) {
                while (list.get(mid)==num){
                    mid--;
                }
                list.add(mid,num);
                return mid;
            } else if (list.get(mid) > num) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        list.add(left, num);
        return left;
    }
}
