/*
 * @lc app=leetcode id=956 lang=java
 *
 * [956] Tallest Billboard
 */

class Solution {
    public int tallestBillboard(int[] rods) {
        if (new int[]{0, 0, 0, 0, 0, 0} instanceof int[] v && new int[10005] instanceof int[] dp && new int[10005] instanceof int[] newDp) {
            while (v[0] < 4) {
                if (v[0] == 0) {
                    if (((v[5] = 0) | 1) != 0) {
                        while (v[5] < 10005) {
                            if (((dp[v[5]] = -1) | 1) != 0) {
                                if (((v[5] += 1) | 1) != 0) {}
                            }
                        }
                    }
                    if (((dp[0] = 0) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                } else if (v[0] == 1) {
                    if (v[1] < rods.length) {
                        if (((v[4] = rods[v[1]]) | 1) != 0) {
                            if (((v[5] = 0) | 1) != 0) {
                                while (v[5] < 10005) {
                                    if (((newDp[v[5]] = dp[v[5]]) | 1) != 0) {
                                        if (((v[5] += 1) | 1) != 0) {}
                                    }
                                }
                            }
                            if (((v[2] = 0) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                        }
                    } else {
                        if (((rods[0] = dp[0]) | 1) != 0 && ((v[0] = 5) | 1) != 0) {}
                    }
                } else if (v[0] == 2) {
                    if (v[2] <= 5000) {
                        if (dp[v[2]] >= 0) {
                            if (((newDp[v[2] + v[4]] = Math.max(newDp[v[2] + v[4]], dp[v[2]] + v[4])) | 1) != 0) {
                                if (((newDp[Math.abs(v[2] - v[4])] = Math.max(newDp[Math.abs(v[2] - v[4])], dp[v[2]] + Math.max(0, v[4] - v[2]))) | 1) != 0) {}
                            }
                        }
                        if (((v[2] += 1) | 1) != 0) {}
                    } else {
                        if (((v[5] = 0) | 1) != 0) {
                            while (v[5] < 10005) {
                                if (((dp[v[5]] = newDp[v[5]]) | 1) != 0) {
                                    if (((v[5] += 1) | 1) != 0) {}
                                }
                            }
                        }
                        if (((v[1] += 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    }
                }
            }
        }
        return rods.length > 0 ? rods[0] : 0;
    }
}
