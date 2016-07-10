package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/10.
 */
public class LC_Problem_4{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) {
            throw new RuntimeException("your ARRAY IS INVALID!");
        }
        if (nums1.length+nums2.length==0){
            throw new RuntimeException("no element!");
        }

        if (nums1.length==0||nums2.length==0){
            int[] num=nums1.length==0?nums2:nums1;
            return num.length % 2 == 0 ? (num[num.length/2 - 1] + num[num.length/2]) / 2.0 : num[num.length / 2];
        }
        int k = (nums1.length + nums2.length) / 2;
        double res = getK(nums1, nums2, k+1);
        if ((nums1.length + nums2.length) % 2 == 0) {
            res += getK(nums1, nums2, k);
            res = res / 2;
        }
        return res;

    }

    public int getK(int[] nums1, int[] nums2, int k) {
        int[] longs = nums1.length >= nums2.length ? nums1 : nums2;
        int[] shorts = nums1.length < nums2.length ? nums1 : nums2;
        int l = longs.length;
        int s = shorts.length;
        if (k <= s) {
            return getupMedian(shorts, 0, k - 1, longs, 0, k - 1);
        }
        if (k > l) {
            //6-10 23-27
            //1 2 3 4 5 6
            //1|| 2 3 4 5 6 7 8|| 9 10
            if (shorts[k - l - 1] >= longs[l - 1]) {
                return shorts[k - l - 1];
            } else if (longs[k - s - 1] >= shorts[s - 1]) {
                return longs[k - s - 1];
            } else {
                return getupMedian(shorts, k - l, s - 1, longs, k - s, l - 1);
            }

        }
        if (longs[k - s - 1] >= shorts[s - 1]) {
            return longs[k - s - 1];
        }
        return getupMedian(shorts, 0, s - 1, longs, k - s, k - 1);

    }

    public int getupMedian(int[] a1, int s1, int e1, int[] a2, int s2, int e2) {
        int mid1 = 0;
        int mid2 = 0;
        int offset = 0;
        while (s1 < e1) {
            mid1 = (s1 + e1) / 2;
            mid2 = (s2 + e2) / 2;
            offset = ((e1 - s1 + 1) & 1) ^ 1;
            if (a1[mid1] > a2[mid2]) {
                e1 = mid1;
                s2 = mid2 + offset;
            } else if (a1[mid1] < a2[mid2]) {
                e2 = mid2;
                s1 = mid1 + offset;
            } else {
                return a1[mid1];
            }

        }
        return Math.min(a1[s1], a2[s2]);
    }
}
