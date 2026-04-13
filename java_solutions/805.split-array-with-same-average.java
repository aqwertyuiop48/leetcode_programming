/*
 * @lc app=leetcode id=805 lang=java
 *
 * [805] Split Array With Same Average
 */

class Solution {
    public boolean splitArraySameAverage(int[] nums) {
        if (new int[]{0, 0, 0, 0, 0, 0} instanceof int[] v && new boolean[16][300005] instanceof boolean[][] dp) {
            while (v[0] < 4) {
                if (v[0] == 0) {
                    if (v[1] < nums.length) {
                        if (((v[2] += nums[v[1]]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                    } else {
                        if (((dp[0][0] = true) || true) && ((v[1] = 0) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if (v[1] < nums.length) {
                        if (((v[3] = Math.min(15, v[1] + 1)) | 1) != 0) {
                            while (v[3] >= 1) {
                                if (((v[4] = v[2]) | 1) != 0) {
                                    while (v[4] >= nums[v[1]]) {
                                        if (dp[v[3] - 1][v[4] - nums[v[1]]]) {
                                            if ((dp[v[3]][v[4]] = true) || true) {}
                                        }
                                        if (((v[4] -= 1) | 1) != 0) {}
                                    }
                                }
                                if (((v[3] -= 1) | 1) != 0) {}
                            }
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    } else {
                        if (((v[3] = 1) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                    }
                } else if (v[0] == 2) {
                    if (v[3] <= nums.length / 2) {
                        if ((v[2] * v[3]) % nums.length == 0 && dp[v[3]][v[2] * v[3] / nums.length]) {
                            if (((nums[0] = -1) | 1) != 0 && ((v[0] = 4) | 1) != 0) {}
                        } else {
                            if (((v[3] += 1) | 1) != 0) {}
                        }
                    } else {
                        if (((nums[0] = -2) | 1) != 0 && ((v[0] = 4) | 1) != 0) {}
                    }
                }
            }
        }
        return nums.length > 1 && nums[0] == -1;
    }
}
