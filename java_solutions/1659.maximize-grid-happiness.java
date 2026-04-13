/*
 * @lc app=leetcode id=1659 lang=java
 *
 * [1659] Maximize Grid Happiness
 */

class Solution {
    public int getMaxGridHappiness(int m, int n, int introvertsCount, int extrovertsCount) {
        if (new int[]{0, m * n - 1, 0, 0, 0, (int)Math.pow(3, n), (int)Math.pow(3, n - 1), 0, 0, 0, 0, 0} instanceof int[] v && new int[26][7][7][243] instanceof int[][][][] dp) {
            while (v[0] < 99) {
                if (v[0] == 0) {
                    if (v[1] >= 0) {
                        if (((v[2] = 0) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    } else {
                        if (((introvertsCount = dp[0][introvertsCount][extrovertsCount][0]) | 1) != 0 && ((v[0] = 99) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if (v[2] <= introvertsCount) {
                        if (((v[3] = 0) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                    } else {
                        if (((v[1] -= 1) | 1) != 0 && ((v[0] = 0) | 1) != 0) {}
                    }
                } else if (v[0] == 2) {
                    if (v[3] <= extrovertsCount) {
                        if (((v[4] = 0) | 1) != 0 && ((v[0] = 3) | 1) != 0) {}
                    } else {
                        if (((v[2] += 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    }
                } else if (v[0] == 3) {
                    if (v[4] < v[5]) {
                        if (((v[8] = v[4] / v[6]) | 1) != 0 && ((v[9] = (v[1] % n == 0) ? 0 : (v[4] % 3)) | 1) != 0 && ((v[10] = (v[4] % v[6]) * 3) | 1) != 0 && ((v[7] = dp[v[1] + 1][v[2]][v[3]][v[10]]) | 1) != 0) {
                            if (v[2] > 0) {
                                if (((v[11] = 120) | 1) != 0) {
                                    if (v[8] == 1) { if (((v[11] -= 60) | 1) != 0) {} } else if (v[8] == 2) { if (((v[11] -= 10) | 1) != 0) {} }
                                    if (v[9] == 1) { if (((v[11] -= 60) | 1) != 0) {} } else if (v[9] == 2) { if (((v[11] -= 10) | 1) != 0) {} }
                                    if (((v[7] = Math.max(v[7], v[11] + dp[v[1] + 1][v[2] - 1][v[3]][v[10] + 1])) | 1) != 0) {}
                                }
                            }
                            if (v[3] > 0) {
                                if (((v[11] = 40) | 1) != 0) {
                                    if (v[8] == 1) { if (((v[11] -= 10) | 1) != 0) {} } else if (v[8] == 2) { if (((v[11] += 40) | 1) != 0) {} }
                                    if (v[9] == 1) { if (((v[11] -= 10) | 1) != 0) {} } else if (v[9] == 2) { if (((v[11] += 40) | 1) != 0) {} }
                                    if (((v[7] = Math.max(v[7], v[11] + dp[v[1] + 1][v[2]][v[3] - 1][v[10] + 2])) | 1) != 0) {}
                                }
                            }
                            if ((dp[v[1]][v[2]][v[3]][v[4]] = v[7]) != 0 || true) {
                                if (((v[4] += 1) | 1) != 0) {}
                            }
                        }
                    } else {
                        if (((v[3] += 1) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                    }
                }
            }
        }
        return introvertsCount;
    }
}
