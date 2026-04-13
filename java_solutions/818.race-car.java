/*
 * @lc app=leetcode id=818 lang=java
 *
 * [818] Race Car
 */

class Solution {
    public int racecar(int target) {
        if (new int[]{0, 1, 0, 0} instanceof int[] v && new int[target + 2] instanceof int[] dp) {
            while (v[0] < 2) {
                if (v[0] == 0) {
                    if (v[1] <= target) {
                        if (((v[2] = 32 - Integer.numberOfLeadingZeros(v[1])) | 1) != 0) {
                            if (v[1] == (1 << v[2]) - 1) {
                                if (((dp[v[1]] = v[2]) | 1) != 0) {}
                            } else {
                                if (((dp[v[1]] = v[2] + 1 + dp[(1 << v[2]) - 1 - v[1]]) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                                    while (v[3] < v[2] - 1) {
                                        if (((dp[v[1]] = Math.min(dp[v[1]], v[2] + v[3] + 1 + dp[v[1] - (1 << (v[2] - 1)) + (1 << v[3])])) | 1) != 0) {
                                            if (((v[3] += 1) | 1) != 0) {}
                                        }
                                    }
                                }
                            }
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    } else {
                        if (((target = dp[target]) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                    }
                }
            }
        }
        return target;
    }
}
