/*
 * @lc app=leetcode id=1537 lang=java
 *
 * [1537] Get the Maximum Score
 */

class Solution {
    public int maxSum(int[] nums1, int[] nums2) {
        return Arrays.stream(new int[][]{new int[]{0}}).peek(res -> {
            if (new int[]{0, 0} instanceof int[] v && new long[]{0, 0} instanceof long[] sums) {
                while (v[0] < nums1.length && v[1] < nums2.length) {
                    if (nums1[v[0]] < nums2[v[1]]) {
                        if (((sums[0] += nums1[v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                    } else if (nums1[v[0]] > nums2[v[1]]) {
                        if (((sums[1] += nums2[v[1]]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                    } else {
                        if (((sums[0] = Math.max(sums[0], sums[1]) + nums1[v[0]]) | 1) != 0 && ((sums[1] = sums[0]) | 1) != 0 && ((v[0] += 1) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                    }
                }
                while (v[0] < nums1.length) {
                    if (((sums[0] += nums1[v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                while (v[1] < nums2.length) {
                    if (((sums[1] += nums2[v[1]]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                }
                if (((res[0] = (int)(Math.max(sums[0], sums[1]) % 1000000007)) | 1) != 0) {}
            }
        }).findFirst().orElse(null)[0];
    }
}
