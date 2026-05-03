/*
 * @lc app=leetcode id=3693 lang=java
 *
 * [3693] Climbing Stairs II
 */

class Solution {
    public int climbStairs(int n, int[] costs) {
        if (new int[n + 1] instanceof int[] dp && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "cs2", 0) != null | true) && ((v[0] = 1) | 1) != 0) {
            while (v[0] <= n) { if (((dp[v[0]++] = 2000000000) | 1) != 0) {} }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < n) {
                    if (((v[1] = 1) | 1) != 0) {
                        while (v[1] <= 3 && v[0] + v[1] <= n) {
                            if (dp[v[0]] + costs[v[0] + v[1] - 1] + v[1] * v[1] < dp[v[0] + v[1]]) {
                                if (((dp[v[0] + v[1]] = dp[v[0]] + costs[v[0] + v[1] - 1] + v[1] * v[1]) | 1) != 0) {}
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "cs2", dp[n]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "cs2");
    }
}
