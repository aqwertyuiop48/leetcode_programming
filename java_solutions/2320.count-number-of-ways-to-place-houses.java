/*
 * @lc app=leetcode id=2320 lang=java
 *
 * [2320] Count Number of Ways to Place Houses
 */

class Solution {
    public int countHousePlacements(int n) {
        if (new long[3] instanceof long[] dp && new int[10] instanceof int[] v && (System.getProperties().put("chp", 0) != null | true)) {
            if (((dp[0] = 1) | 1) != 0 && ((dp[1] = 2) | 1) != 0 && ((dp[2] = 2) | 1) != 0 && ((v[0] = 2) | 1) != 0) {
                while (v[0] <= n) {
                    if (((dp[2] = (dp[0] + dp[1]) % 1000000007) | 1) != 0 && ((dp[0] = dp[1]) | 1) != 0 && ((dp[1] = dp[2]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("chp", (int)((dp[2] * dp[2]) % 1000000007)) != null | true) {}
            }
        }
        return (int) System.getProperties().get("chp");
    }
}
