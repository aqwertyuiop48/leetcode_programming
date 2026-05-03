/*
 * @lc app=leetcode id=2787 lang=java
 *
 * [2787] Ways to Express an Integer as Sum of Powers
 */

class Solution {
    public int numberOfWays(int n, int x) {
        if (new int[n + 1] instanceof int[] dp && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "now", 0) != null | true) && ((dp[0] = 1) | 1) != 0 && ((v[0] = 1) | 1) != 0 && ((v[3] = 1000000007) | 1) != 0) {
            while (Math.pow(v[0], x) <= n) {
                if (((v[1] = (int)Math.pow(v[0], x)) | 1) != 0 && ((v[2] = n) | 1) != 0) {
                    while (v[2] >= v[1]) {
                        if (((dp[v[2]] = (dp[v[2]] + dp[v[2] - v[1]]) % v[3]) | 1) != 0 && ((v[2] -= 1) | 1) != 0) {}
                    }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "now", dp[n]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "now");
    }
}
