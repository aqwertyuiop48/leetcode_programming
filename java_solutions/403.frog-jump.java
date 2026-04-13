/*
 * @lc app=leetcode id=403 lang=java
 *
 * [403] Frog Jump
 */

class Solution {
    public boolean canCross(int[] stones) {
        if (new int[]{0, stones.length, 0, 0, 0, 0} instanceof int[] v && new boolean[stones.length][stones.length + 1] instanceof boolean[][] dp) {
            if (((dp[0][0] = true) || true) && ((v[2] = 0) | 1) != 0 && ((v[0] = 1) | 1) != 0) {
                while (v[0] < 2) {
                    if (v[0] == 1) {
                        if (v[2] < v[1]) {
                            if (((v[3] = v[2] + 1) | 1) != 0) {
                                while (v[3] < v[1]) {
                                    if (((v[4] = stones[v[3]] - stones[v[2]]) | 1) != 0) {
                                        if (v[4] > v[2] + 1) {
                                            if (((v[3] = v[1]) | 1) != 0) {}
                                        } else {
                                            if (dp[v[2]][v[4] - 1] || dp[v[2]][v[4]] || dp[v[2]][v[4] + 1]) {
                                                if (((dp[v[3]][v[4]] = true) || true) && v[3] == v[1] - 1) {
                                                    if (((stones[0] = -1) | 1) != 0 && ((v[0] = 3) | 1) != 0 && ((v[3] = v[1]) | 1) != 0 && ((v[2] = v[1]) | 1) != 0) {}
                                                }
                                            }
                                        }
                                    }
                                    if (v[3] < v[1] && ((v[3] += 1) | 1) != 0) {}
                                }
                            }
                            if (v[2] < v[1] && ((v[2] += 1) | 1) != 0) {}
                        } else {
                            if (((v[0] = 3) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return stones.length > 0 && stones[0] == -1;
    }
}
