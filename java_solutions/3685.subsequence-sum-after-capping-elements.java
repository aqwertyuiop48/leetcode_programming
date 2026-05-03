/*
 * @lc app=leetcode id=3685 lang=java
 *
 * [3685] Subsequence Sum After Capping Elements
 */

class Solution {
    public boolean[] subsequenceSumAfterCapping(int[] nums, int k) {
        if (new boolean[nums.length] instanceof boolean[] ans && new int[nums.length + 2] instanceof int[] counts && new boolean[k + 1] instanceof boolean[] dp && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ssac", ans) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < nums.length) {
                if (((counts[Math.min(nums[v[0]], nums.length + 1)] += 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
            }
            if (((dp[0] = true) | true) && ((v[1] = nums.length) | 1) != 0 && ((v[2] = 1) | 1) != 0) {
                while (v[2] <= nums.length) {
                    if (((v[3] = 0) | 1) != 0) {
                        while (v[3] < counts[v[2] - 1]) {
                            if (((v[4] = k) | 1) != 0) {
                                while (v[4] >= v[2] - 1) {
                                    if (dp[v[4] - (v[2] - 1)]) { if (((dp[v[4]] = true) | true) != false) {} }
                                    if (((v[4] -= 1) | 1) != 0) {}
                                }
                            }
                            if (((v[3] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[1] -= counts[v[2] - 1]) | 1) != 0 && ((v[5] = 0) | 1) != 0 && ((v[6] = 0) | 1) != 0) {
                        while (v[5] <= k && v[6] == 0) {
                            if (dp[v[5]] && (k - v[5]) % v[2] == 0 && (k - v[5]) / v[2] <= v[1]) {
                                if (((ans[v[2] - 1] = true) | true) && ((v[6] = 1) | 1) != 0) {}
                            }
                            if (((v[5] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[2] += 1) | 1) != 0) {}
                }
            }
        }
        return (boolean[]) System.getProperties().get(Thread.currentThread().getId() + "ssac");
    }
}
