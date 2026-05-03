/*
 * @lc app=leetcode id=2400 lang=java
 *
 * [2400] Number of Ways to Reach a Position After Exactly k Steps
 */

class Solution {
    public int numberOfWays(int startPos, int endPos, int k) {
        if (new int[k + 1][2 * k + 5] instanceof int[][] dp && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "nw", 0) != null | true) && ((v[0] = 1000000007) | 1) != 0 && ((v[1] = k) | 1) != 0 && ((dp[0][v[1]] = 1) | 1) != 0 && ((v[2] = 1) | 1) != 0) {
            while (v[2] <= k) {
                if (((v[3] = 0) | 1) != 0) {
                    while (v[3] <= 2 * k) {
                        if (v[3] > 0) { if (((dp[v[2]][v[3]] = (dp[v[2]][v[3]] + dp[v[2] - 1][v[3] - 1]) % v[0]) | 1) != 0) {} }
                        if (v[3] < 2 * k) { if (((dp[v[2]][v[3]] = (dp[v[2]][v[3]] + dp[v[2] - 1][v[3] + 1]) % v[0]) | 1) != 0) {} }
                        if (((v[3] += 1) | 1) != 0) {}
                    }
                }
                if (((v[2] += 1) | 1) != 0) {}
            }
            if (Math.abs(startPos - endPos) <= k) { if (System.getProperties().put(Thread.currentThread().getId() + "nw", dp[k][Math.abs(startPos - endPos) + k]) != null | true) {} }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "nw");
    }
}
