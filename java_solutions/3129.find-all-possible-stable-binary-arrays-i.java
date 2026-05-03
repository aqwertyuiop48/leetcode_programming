/*
 * @lc app=leetcode id=3129 lang=java
 *
 * [3129] Find All Possible Stable Binary Arrays I
 */

class Solution {
    public int numberOfStableArrays(int zero, int one, int limit) {
        if (new long[zero + 5][one + 5][2] instanceof long[][][] dp && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "sba", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] <= Math.min(zero, limit)) { if (((dp[v[0]][0][0] = 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] <= Math.min(one, limit)) { if (((dp[0][v[0]][1] = 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                }
                if (((v[0] = 1) | 1) != 0) {
                    while (v[0] <= zero) {
                        if (((v[1] = 1) | 1) != 0) {
                            while (v[1] <= one) {
                                if (((dp[v[0]][v[1]][0] = (dp[v[0]-1][v[1]][0] + dp[v[0]-1][v[1]][1] + 1000000007 - (v[0] > limit ? dp[v[0]-limit-1][v[1]][1] : 0)) % 1000000007) | 1) != 0 && ((dp[v[0]][v[1]][1] = (dp[v[0]][v[1]-1][0] + dp[v[0]][v[1]-1][1] + 1000000007 - (v[1] > limit ? dp[v[0]][v[1]-limit-1][0] : 0)) % 1000000007) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "sba", (int)((dp[zero][one][0] + dp[zero][one][1]) % 1000000007)) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "sba");
    }
}
