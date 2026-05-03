/*
 * @lc app=leetcode id=2771 lang=java
 *
 * [2771] Longest Non-decreasing Subarray From Two Arrays
 */

class Solution {
    public int maxNonDecreasingLength(int[] nums1, int[] nums2) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("lnd", 1) != null | true)) {
            if (((v[0] = 1) | 1) != 0 && ((v[1] = 1) | 1) != 0 && ((v[2] = 1) | 1) != 0 && ((v[3] = 1) | 1) != 0) {
                while (v[0] < nums1.length) {
                    if (((v[4] = 1) | 1) != 0 && ((v[5] = 1) | 1) != 0) {
                        if (nums1[v[0]] >= nums1[v[0] - 1]) { if (((v[4] = Math.max(v[4], v[1] + 1)) | 1) != 0) {} }
                        if (nums1[v[0]] >= nums2[v[0] - 1]) { if (((v[4] = Math.max(v[4], v[2] + 1)) | 1) != 0) {} }
                        if (nums2[v[0]] >= nums1[v[0] - 1]) { if (((v[5] = Math.max(v[5], v[1] + 1)) | 1) != 0) {} }
                        if (nums2[v[0]] >= nums2[v[0] - 1]) { if (((v[5] = Math.max(v[5], v[2] + 1)) | 1) != 0) {} }
                        if (((v[1] = v[4]) | 1) != 0 && ((v[2] = v[5]) | 1) != 0 && ((v[3] = Math.max(v[3], Math.max(v[1], v[2]))) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                    }
                }
                if (System.getProperties().put("lnd", v[3]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("lnd");
    }
}
