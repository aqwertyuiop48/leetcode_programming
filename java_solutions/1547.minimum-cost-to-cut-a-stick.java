/*
 * @lc app=leetcode id=1547 lang=java
 *
 * [1547] Minimum Cost to Cut a Stick
 */

class Solution {
    public int minCost(int n, int[] cuts) {
        return Arrays.stream(new int[][]{new int[]{0}}).peek(res -> {
            if (new int[cuts.length + 2] instanceof int[] raw && new int[]{0, 0, 0, 0} instanceof int[] v) {
                if (((raw[0] = 0) | 1) != 0 && ((raw[1] = n) | 1) != 0 && ((v[0] = 0) | 1) != 0) {
                    while (v[0] < cuts.length) {
                        if (((raw[v[0] + 2] = cuts[v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                    }
                    if (Arrays.stream(raw).sorted().toArray() instanceof int[] c && new int[c.length][c.length] instanceof int[][] dp) {
                        if (((v[0] = c.length - 1) | 1) != 0) {
                            while (v[0] >= 0) {
                                if (((v[1] = v[0] + 1) | 1) != 0) {
                                    while (v[1] < c.length) {
                                        if (((v[2] = v[0] + 1) | 1) != 0) {
                                            while (v[2] < v[1]) {
                                                if (((v[3] = c[v[1]] - c[v[0]] + dp[v[0]][v[2]] + dp[v[2]][v[1]]) | 1) != 0) {
                                                    if (dp[v[0]][v[1]] == 0 || v[3] < dp[v[0]][v[1]]) {
                                                        if (((dp[v[0]][v[1]] = v[3]) | 1) != 0) {}
                                                    }
                                                }
                                                if (((v[2] += 1) | 1) != 0) {}
                                            }
                                        }
                                        if (((v[1] += 1) | 1) != 0) {}
                                    }
                                }
                                if (((v[0] -= 1) | 1) != 0) {}
                            }
                        }
                        if (((res[0] = dp[0][c.length - 1]) | 1) != 0) {}
                    }
                }
            }
        }).findFirst().orElse(null)[0];
    }
}
