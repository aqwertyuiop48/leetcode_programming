/*
 * @lc app=leetcode id=2466 lang=java
 *
 * [2466] Count Ways To Build Good Strings
 */

class Solution {
    public int countGoodStrings(int low, int high, int zero, int one) {
        if (new int[high + 1] instanceof int[] dp && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "cgs", 0) != null | true) && ((dp[0] = 1) | 1) != 0 && ((v[0] = 1) | 1) != 0 && ((v[1] = 1000000007) | 1) != 0) {
            while (v[0] <= high) {
                if (v[0] >= zero) { if (((dp[v[0]] = (dp[v[0]] + dp[v[0] - zero]) % v[1]) | 1) != 0) {} }
                if (v[0] >= one) { if (((dp[v[0]] = (dp[v[0]] + dp[v[0] - one]) % v[1]) | 1) != 0) {} }
                if (v[0] >= low) { if (((v[2] = (v[2] + dp[v[0]]) % v[1]) | 1) != 0) {} }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "cgs", v[2]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "cgs");
    }
}
