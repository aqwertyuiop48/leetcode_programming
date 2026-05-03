/*
 * @lc app=leetcode id=3724 lang=java
 *
 * [3724] Minimum Operations to Transform Array
 */

class Solution {
    public long minOperations(int[] nums1, int[] nums2) {
        if (new int[10] instanceof int[] v && new long[10] instanceof long[] lv && (System.getProperties().put("mot", 0L) != null | true)) {
            if (((lv[0] = 1L) | 1) != 0 && ((v[0] = nums1.length) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((lv[1] = 1000000000000000L) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[2] < v[0]) {
                    if (((v[3] = Math.max(nums1[v[2]], nums2[v[2]])) | 1) != 0 && ((v[4] = Math.min(nums1[v[2]], nums2[v[2]])) | 1) != 0) {
                        if (((lv[0] += v[3] - v[4]) | 1) != 0 && ((lv[2] = Math.min(Math.abs((long)v[3] - nums2[v[0]]), Math.abs((long)v[4] - nums2[v[0]]))) | 1) != 0) {
                            if (lv[2] < lv[1]) { if (((lv[1] = lv[2]) | 1) != 0) {} }
                            if (nums2[v[0]] >= v[4] && nums2[v[0]] <= v[3]) { if (((v[1] = 1) | 1) != 0) {} }
                        }
                    }
                    if (((v[2] += 1) | 1) != 0) {}
                }
                if (v[1] == 0) { if (((lv[0] += lv[1]) | 1) != 0) {} }
                if (System.getProperties().put("mot", lv[0]) != null | true) {}
            }
        }
        return (long) System.getProperties().get("mot");
    }
}
