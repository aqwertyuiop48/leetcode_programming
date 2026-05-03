/*
 * @lc app=leetcode id=1155 lang=java
 *
 * [1155] Number of Dice Rolls With Target Sum
 */

class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        if (new int[n + 1][target + 1] instanceof int[][] dp && new int[10] instanceof int[] v && (System.getProperties().put("ndr", 0) != null | true)) {
            if (((dp[0][0] = 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {
                while (v[0] <= n) {
                    if (((v[1] = 1) | 1) != 0) {
                        while (v[1] <= target) {
                            if (((v[2] = 1) | 1) != 0) {
                                while (v[2] <= k) {
                                    if (v[1] - v[2] >= 0) { if (((dp[v[0]][v[1]] = (dp[v[0]][v[1]] + dp[v[0] - 1][v[1] - v[2]]) % 1000000007) | 1) != 0) {} }
                                    if (((v[2] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("ndr", dp[n][target]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("ndr");
    }
}
