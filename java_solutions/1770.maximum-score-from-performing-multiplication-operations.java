/*
 * @lc app=leetcode id=1770 lang=java
 *
 * [1770] Maximum Score from Performing Multiplication Operations
 */

class Solution {
    public int maximumScore(int[] nums, int[] multipliers) {
        while (true) {
            if (new int[multipliers.length + 1][multipliers.length + 1] instanceof int[][] dp && new int[]{multipliers.length - 1, 0, 0, 0, 0, nums.length, multipliers.length} instanceof int[] v) {
                while (v[2] < 2) {
                    if (v[2] == 0) {
                        if (v[0] >= 0) {
                            if (((v[1] = v[0]) | 1) != 0 && ((v[2] = 1) | 1) != 0) {}
                        } else {
                            if (((v[2] = 2) | 1) != 0) {}
                        }
                    } else if (v[2] == 1) {
                        if (v[1] >= 0) {
                            if (((v[3] = multipliers[v[0]] * nums[v[1]] + dp[v[0] + 1][v[1] + 1]) | 1) != 0) {
                                if (((v[4] = multipliers[v[0]] * nums[v[5] - 1 - (v[0] - v[1])] + dp[v[0] + 1][v[1]]) | 1) != 0) {
                                    if (((dp[v[0]][v[1]] = Math.max(v[3], v[4])) | 1) != 0 && ((v[1] -= 1) | 1) != 0) {}
                                }
                            }
                        } else {
                            if (((v[0] -= 1) | 1) != 0 && ((v[2] = 0) | 1) != 0) {}
                        }
                    }
                }
                return dp[0][0];
            }
        }
    }
}
