/*
 * @lc app=leetcode id=1775 lang=java
 *
 * [1775] Equal Sum Arrays With Minimum Number of Operations
 */

class Solution {
    public int minOperations(int[] nums1, int[] nums2) {
        if (new int[10] instanceof int[] v && new int[6] instanceof int[] c && (System.getProperties().put("moe", -1) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] < nums1.length) { if (((v[1] += nums1[v[0]++]) | 1) != 0) {} }
                if (((v[0] = 0) | 1) != 0) { while (v[0] < nums2.length) { if (((v[2] += nums2[v[0]++]) | 1) != 0) {} } }
                if (v[1] > v[2]) {
                    if (((v[0] = 0) | 1) != 0) { while (v[0] < nums1.length) { if (((c[nums1[v[0]++] - 1] += 1) | 1) != 0) {} } }
                    if (((v[0] = 0) | 1) != 0) { while (v[0] < nums2.length) { if (((c[6 - nums2[v[0]++]] += 1) | 1) != 0) {} } }
                    if (((v[3] = v[1] - v[2]) | 1) != 0) {}
                } else {
                    if (((v[0] = 0) | 1) != 0) { while (v[0] < nums2.length) { if (((c[nums2[v[0]++] - 1] += 1) | 1) != 0) {} } }
                    if (((v[0] = 0) | 1) != 0) { while (v[0] < nums1.length) { if (((c[6 - nums1[v[0]++]] += 1) | 1) != 0) {} } }
                    if (((v[3] = v[2] - v[1]) | 1) != 0) {}
                }
                if (((v[4] = 0) | 1) != 0 && ((v[5] = 5) | 1) != 0) {
                    while (v[5] > 0 && v[3] > 0) {
                        if (((v[6] = Math.min(c[v[5]], (v[3] + v[5] - 1) / v[5])) | 1) != 0 && ((v[4] += v[6]) | 1) != 0 && ((v[3] -= v[6] * v[5]) | 1) != 0 && ((v[5] -= 1) | 1) != 0) {}
                    }
                    if (v[3] <= 0 && System.getProperties().put("moe", v[4]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get("moe");
    }
}
