/*
 * @lc app=leetcode id=1000 lang=java
 *
 * [1000] Minimum Cost to Merge Stones
 */

class Solution {
    public int mergeStones(int[] stones, int k) {
        return Arrays.stream(new int[][]{new int[]{0}}).peek(res -> {
            if (new int[]{stones.length, k, 0, 0, 0, 0, 0} instanceof int[] v && new int[stones.length + 1] instanceof int[] pre && new int[stones.length][stones.length][k + 1] instanceof int[][][] dp) {
                if ((v[0] - 1) % (k - 1) != 0) {
                    if (((res[0] = -1) | 1) != 0) {}
                } else {
                    while (v[2] < v[0]) {
                        if (((pre[v[2] + 1] = pre[v[2]] + stones[v[2]]) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                            while (v[3] < v[0]) {
                                if (((v[4] = 1) | 1) != 0) {
                                    while (v[4] <= k) {
                                        if (((dp[v[2]][v[3]][v[4]] = 9999999) | 1) != 0 && ((v[4] += 1) | 1) != 0) {}
                                    }
                                }
                                if (((dp[v[2]][v[2]][1] = 0) | 1) != 0 && ((v[3] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[2] += 1) | 1) != 0) {}
                    }
                    if (((v[2] = 2) | 1) != 0) {
                        while (v[2] <= v[0]) {
                            if (((v[3] = 0) | 1) != 0) {
                                while (v[3] <= v[0] - v[2]) {
                                    if (((v[4] = v[3] + v[2] - 1) | 1) != 0 && ((v[5] = 2) | 1) != 0) {
                                        while (v[5] <= k) {
                                            if (((v[6] = v[3]) | 1) != 0) {
                                                while (v[6] < v[4]) {
                                                    if (((dp[v[3]][v[4]][v[5]] = Math.min(dp[v[3]][v[4]][v[5]], dp[v[3]][v[6]][1] + dp[v[6] + 1][v[4]][v[5] - 1])) | 1) != 0 && ((v[6] += v[1] - 1) | 1) != 0) {}
                                                }
                                            }
                                            if (((v[5] += 1) | 1) != 0) {}
                                        }
                                        if (((dp[v[3]][v[4]][1] = dp[v[3]][v[4]][k] + pre[v[4] + 1] - pre[v[3]]) | 1) != 0) {}
                                    }
                                    if (((v[3] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[2] += 1) | 1) != 0) {}
                        }
                    }
                    if (((res[0] = dp[0][v[0] - 1][1]) | 1) != 0) {}
                }
            }
        }).findFirst().orElse(null)[0];
    }
}
