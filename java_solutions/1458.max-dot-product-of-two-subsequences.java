/*
 * @lc app=leetcode id=1458 lang=java
 *
 * [1458] Max Dot Product of Two Subsequences
 */

class Solution {
    public int maxDotProduct(int[] a, int[] b) {
        if (new int[]{0, 0, 0, 0, a.length, b.length} instanceof int[] v && new int[a.length + 1][b.length + 1] instanceof int[][] dp) {
            while (v[0] < 3) {
                if (v[0] == 0) {
                    if (v[1] <= v[4]) {
                        if (((v[2] = 0) | 1) != 0) {
                            while (v[2] <= v[5]) {
                                if (((dp[v[1]][v[2]] = -1000000000) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    } else {
                        if (((v[1] = 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if (v[1] <= v[4]) {
                        if (((v[2] = 1) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                    } else {
                        if (((a[0] = dp[v[4]][v[5]]) | 1) != 0 && ((v[0] = 3) | 1) != 0) {}
                    }
                } else if (v[0] == 2) {
                    if (v[2] <= v[5]) {
                        if (((v[3] = a[v[1] - 1] * b[v[2] - 1] + Math.max(0, dp[v[1] - 1][v[2] - 1])) | 1) != 0) {
                            if (((dp[v[1]][v[2]] = Math.max(v[3], Math.max(dp[v[1] - 1][v[2]], dp[v[1]][v[2] - 1]))) | 1) != 0) {
                                if (((v[2] += 1) | 1) != 0) {}
                            }
                        }
                    } else {
                        if (((v[1] += 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    }
                }
            }
        }
        return a[0];
    }
}
