/*
 * @lc app=leetcode id=1420 lang=java
 *
 * [1420] Build Array Where You Can Find The Maximum Exactly K Comparisons
 */

class Solution {
    public int numOfArrays(int n, int m, int k) {
        return Arrays.stream(new int[][]{new int[]{0}}).peek(res -> {
            if (new long[n + 1][k + 1][m + 1] instanceof long[][][] dp && new int[]{1, 1, 1, 1} instanceof int[] v) {
                while (v[2] <= m) {
                    if (((dp[1][1][v[2]] = 1) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                }
                if (((v[0] = 2) | 1) != 0) {
                    while (v[0] <= n) {
                        if (((v[1] = 1) | 1) != 0) {
                            while (v[1] <= k) {
                                if (((v[2] = 1) | 1) != 0) {
                                    while (v[2] <= m) {
                                        if (((dp[v[0]][v[1]][v[2]] = (dp[v[0] - 1][v[1]][v[2]] * v[2]) % 1000000007) | 1) != 0 && ((v[3] = 1) | 1) != 0) {
                                            while (v[3] < v[2]) {
                                                if (((dp[v[0]][v[1]][v[2]] = (dp[v[0]][v[1]][v[2]] + dp[v[0] - 1][v[1] - 1][v[3]]) % 1000000007) | 1) != 0 && ((v[3] += 1) | 1) != 0) {}
                                            }
                                        }
                                        if (((v[2] += 1) | 1) != 0) {}
                                    }
                                }
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
                if (((v[2] = 1) | 1) != 0) {
                    while (v[2] <= m) {
                        if (((res[0] = (int)((res[0] + dp[n][k][v[2]]) % 1000000007)) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                    }
                }
            }
        }).findFirst().orElse(null)[0];
    }
}
