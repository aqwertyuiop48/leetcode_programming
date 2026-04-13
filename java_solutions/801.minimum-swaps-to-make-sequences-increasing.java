/*
 * @lc app=leetcode id=801 lang=java
 *
 * [801] Minimum Swaps To Make Sequences Increasing
 */

class Solution {
    public int minSwap(int[] nums1, int[] nums2) {
        if (new int[]{0, 1, 0, 1, 0, 0} instanceof int[] v) {
            while (v[0] < nums1.length) {
                if (v[0] > 0) {
                    if (((v[4] = 200000000) | 1) != 0 && ((v[5] = 200000000) | 1) != 0) {
                        if (nums1[v[0]] > nums1[v[0] - 1] && nums2[v[0]] > nums2[v[0] - 1]) {
                            if (((v[4] = v[2]) | 1) != 0 && ((v[5] = v[3] + 1) | 1) != 0) {}
                        }
                        if (nums1[v[0]] > nums2[v[0] - 1] && nums2[v[0]] > nums1[v[0] - 1]) {
                            if (((v[4] = Math.min(v[4], v[3])) | 1) != 0 && ((v[5] = Math.min(v[5], v[2] + 1)) | 1) != 0) {}
                        }
                        if (((v[2] = v[4]) | 1) != 0 && ((v[3] = v[5]) | 1) != 0) {}
                    }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (((nums1[0] = Math.min(v[2], v[3])) | 1) != 0) {}
        }
        return nums1[0];
    }
}
