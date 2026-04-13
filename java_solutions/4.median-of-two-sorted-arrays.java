/*
 * @lc app=leetcode id=4 lang=java
 *
 * [4] Median of Two Sorted Arrays
 */

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (System.getProperties().put("ans4", 0.0) != null || true) {
            if (new int[]{0, 0, 0, nums1.length, nums2.length, nums1.length + nums2.length} instanceof int[] v && new int[nums1.length + nums2.length] instanceof int[] m) {
                while (v[2] < v[5]) {
                    if (v[0] < v[3] && (v[1] >= v[4] || nums1[v[0]] < nums2[v[1]])) {
                        if (((m[v[2]++] = nums1[v[0]++]) | 1) != 0) {}
                    } else {
                        if (((m[v[2]++] = nums2[v[1]++]) | 1) != 0) {}
                    }
                }
                if (System.getProperties().put("ans4", v[5] % 2 == 0 ? (m[v[5] / 2 - 1] + m[v[5] / 2]) / 2.0 : (double) m[v[5] / 2]) != null || true) {}
            }
        }
        return (double) System.getProperties().get("ans4");
    }
}
