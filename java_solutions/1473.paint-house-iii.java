/*
 * @lc app=leetcode id=1473 lang=java
 *
 * [1473] Paint House III
 */

class Solution extends HashMap<String, Object> {
    public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        if (new int[]{0, 0, 0, 0, 0, 0, 2000000000} instanceof int[] v && new int[m + 1][n + 1][target + 2] instanceof int[][][] dp) {
            if (((v[1] = 0) | 1) != 0) {
                while (v[1] <= m) {
                    if (((v[2] = 0) | 1) != 0) {
                        while (v[2] <= n) {
                            if (((v[3] = 0) | 1) != 0) {
                                while (v[3] <= target + 1) {
                                    if (((dp[v[1]][v[2]][v[3]] = 2000000000) | 1) != 0 && ((v[3] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[2] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[1] += 1) | 1) != 0) {}
                }
            }
            if (((dp[0][0][0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[1] < m) {
                    if (((v[2] = 0) | 1) != 0) {
                        while (v[2] <= n) {
                            if (((v[3] = 0) | 1) != 0) {
                                while (v[3] <= target) {
                                    if (dp[v[1]][v[2]][v[3]] != 2000000000) {
                                        if (houses[v[1]] != 0) {
                                            if (((v[4] = houses[v[1]]) | 1) != 0 && ((v[5] = v[3] + (v[2] == v[4] ? 0 : 1)) | 1) != 0) {
                                                if (v[5] <= target) {
                                                    if (((dp[v[1] + 1][v[4]][v[5]] = Math.min(dp[v[1] + 1][v[4]][v[5]], dp[v[1]][v[2]][v[3]])) | 1) != 0) {}
                                                }
                                            }
                                        } else {
                                            if (((v[4] = 1) | 1) != 0) {
                                                while (v[4] <= n) {
                                                    if (((v[5] = v[3] + (v[2] == v[4] ? 0 : 1)) | 1) != 0) {
                                                        if (v[5] <= target) {
                                                            if (((dp[v[1] + 1][v[4]][v[5]] = Math.min(dp[v[1] + 1][v[4]][v[5]], dp[v[1]][v[2]][v[3]] + cost[v[1]][v[4] - 1])) | 1) != 0) {}
                                                        }
                                                    }
                                                    if (((v[4] += 1) | 1) != 0) {}
                                                }
                                            }
                                        }
                                    }
                                    if (((v[3] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[2] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[1] += 1) | 1) != 0) {}
                }
            }
            if (((v[2] = 1) | 1) != 0) {
                while (v[2] <= n) {
                    if (((v[6] = Math.min(v[6], dp[m][v[2]][target])) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                }
            }
            if (this.put("ans", v[6] == 2000000000 ? -1 : v[6]) == null || true) {}
        }
        return (int) this.get("ans");
    }
}
