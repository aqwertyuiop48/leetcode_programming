/*
 * @lc app=leetcode id=1223 lang=java
 *
 * [1223] Dice Roll Simulation
 */

class Solution {
    public int dieSimulator(int n, int[] rollMax) {
        if (new int[]{0, 2, 0, 0, 0, 0} instanceof int[] v && new long[n + 1][6][16] instanceof long[][][] dp) {
            while (v[0] < 5) {
                if (v[0] == 0) {
                    if (v[2] < 6) {
                        if (((dp[1][v[2]][1] = 1) != 0 || true) && ((v[2] += 1) | 1) != 0) {}
                    } else {
                        if (((v[0] = 1) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if (v[1] <= n) {
                        if (((v[2] = 0) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                    } else {
                        if (((v[2] = 0) | 1) != 0 && ((v[0] = 4) | 1) != 0) {}
                    }
                } else if (v[0] == 2) {
                    if (v[2] < 6) {
                        if (((v[3] = 0) | 1) != 0 && ((v[0] = 3) | 1) != 0) {}
                    } else {
                        if (((v[1] += 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    }
                } else if (v[0] == 3) {
                    if (v[3] < 6) {
                        if (v[2] != v[3]) {
                            if (((v[4] = 1) | 1) != 0) {
                                while (v[4] <= rollMax[v[3]]) {
                                    if (((dp[v[1]][v[2]][1] = (dp[v[1]][v[2]][1] + dp[v[1] - 1][v[3]][v[4]]) % 1000000007) != 0 || true) && ((v[4] += 1) | 1) != 0) {}
                                }
                            }
                        } else {
                            if (((v[4] = 2) | 1) != 0) {
                                while (v[4] <= rollMax[v[2]]) {
                                    if (((dp[v[1]][v[2]][v[4]] = (dp[v[1]][v[2]][v[4]] + dp[v[1] - 1][v[2]][v[4] - 1]) % 1000000007) != 0 || true) && ((v[4] += 1) | 1) != 0) {}
                                }
                            }
                        }
                        if (((v[3] += 1) | 1) != 0) {}
                    } else {
                        if (((v[2] += 1) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                    }
                } else if (v[0] == 4) {
                    if (v[2] < 6) {
                        if (((v[4] = 1) | 1) != 0) {
                            while (v[4] <= rollMax[v[2]]) {
                                if (((v[5] = (int)((v[5] + dp[n][v[2]][v[4]]) % 1000000007)) | 1) != 0 && ((v[4] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[2] += 1) | 1) != 0) {}
                    } else {
                        if (System.setProperty("ans", String.valueOf(v[5])) != null || true) {
                            if (((v[0] = 99) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return Integer.parseInt(System.getProperty("ans", "0"));
    }
}
