/*
 * @lc app=leetcode id=3429 lang=java
 *
 * [3429] Paint House IV
 */

class Solution {
    public long minCost(int n, int[][] cost) {
        if (new long[3][3] instanceof long[][] dp && new long[3][3] instanceof long[][] ndp && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ph4", 0L) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < n / 2) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < 3) {
                            if (((v[2] = 0) | 1) != 0) {
                                while (v[2] < 3) {
                                    if (v[1] == v[2]) { if (((ndp[v[1]][v[2]] = 1000000000000000L) | 1) != 0) {} }
                                    else {
                                        if (((ndp[v[1]][v[2]] = 1000000000000000L) | 1) != 0) {
                                            if (v[0] == 0) {
                                                if (((ndp[v[1]][v[2]] = cost[0][v[1]] + cost[n - 1][v[2]]) | 1) != 0) {}
                                            } else {
                                                if (((v[3] = 0) | 1) != 0) {
                                                    while (v[3] < 3) {
                                                        if (v[3] != v[1]) {
                                                            if (((v[4] = 0) | 1) != 0) {
                                                                while (v[4] < 3) {
                                                                    if (v[4] != v[2]) {
                                                                        if (dp[v[3]][v[4]] + cost[v[0]][v[1]] + cost[n - 1 - v[0]][v[2]] < ndp[v[1]][v[2]]) {
                                                                            if (((ndp[v[1]][v[2]] = dp[v[3]][v[4]] + cost[v[0]][v[1]] + cost[n - 1 - v[0]][v[2]]) | 1) != 0) {}
                                                                        }
                                                                    }
                                                                    if (((v[4] += 1) | 1) != 0) {}
                                                                }
                                                            }
                                                        }
                                                        if (((v[3] += 1) | 1) != 0) {}
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (((v[2] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < 3) {
                            if (((v[2] = 0) | 1) != 0) {
                                while (v[2] < 3) { if (((dp[v[1]][v[2]] = ndp[v[1]][v[2]]) | 1) != 0 && ((v[2] += 1) | 1) != 0) {} }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            if (((v[1] = 0) | 1) != 0 && ((dp[0][0] = 1000000000000000L) | 1) != 0) {
                while (v[1] < 3) {
                    if (((v[2] = 0) | 1) != 0) {
                        while (v[2] < 3) {
                            if (v[1] != v[2] && dp[v[1]][v[2]] < dp[0][0]) { if (((dp[0][0] = dp[v[1]][v[2]]) | 1) != 0) {} }
                            if (((v[2] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[1] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "ph4", dp[0][0]) != null | true) {}
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "ph4");
    }
}
