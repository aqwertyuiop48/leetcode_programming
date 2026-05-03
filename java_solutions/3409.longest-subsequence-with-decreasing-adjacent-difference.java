/*
 * @lc app=leetcode id=3409 lang=java
 *
 * [3409] Longest Subsequence With Decreasing Adjacent Difference
 */

class Solution {
    public int longestSubsequence(int[] nums) {
        if (new int[305][305] instanceof int[][] dp && new int[305][305] instanceof int[][] maxDp && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "lsd", 1) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((v[1] = nums[v[0]]) | 1) != 0 && ((v[2] = 1) | 1) != 0) {
                        while (v[2] <= 300) {
                            if (((v[3] = Math.abs(v[1] - v[2])) | 1) != 0) {
                                if (maxDp[v[2]][v[3]] + 1 > dp[v[1]][v[3]]) { if (((dp[v[1]][v[3]] = maxDp[v[2]][v[3]] + 1) | 1) != 0) {} }
                            }
                            if (((v[2] += 1) | 1) != 0) {}
                        }
                    }
                    if (dp[v[1]][300] < 1) { if (((dp[v[1]][300] = 1) | 1) != 0) {} }
                    if (((v[2] = 300) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                        while (v[2] >= 0) {
                            if (dp[v[1]][v[2]] > v[4]) { if (((v[4] = dp[v[1]][v[2]]) | 1) != 0) {} }
                            if (v[4] > maxDp[v[1]][v[2]]) { if (((maxDp[v[1]][v[2]] = v[4]) | 1) != 0) {} }
                            if (v[4] > (int)System.getProperties().get(Thread.currentThread().getId() + "lsd")) {
                                if (System.getProperties().put(Thread.currentThread().getId() + "lsd", v[4]) != null | true) {}
                            }
                            if (((v[2] -= 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "lsd");
    }
}
