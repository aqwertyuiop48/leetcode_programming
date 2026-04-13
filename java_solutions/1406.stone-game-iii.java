/*
 * @lc app=leetcode id=1406 lang=java
 *
 * [1406] Stone Game III
 */

class Solution {
    public String stoneGameIII(int[] piles) {
        return Arrays.stream(new String[][]{new String[]{""}}).peek(res -> {
            if (new int[piles.length + 1] instanceof int[] dp && new int[]{piles.length - 1, 0, 0, 0} instanceof int[] v) {
                if (((dp[piles.length] = 0) | 1) != 0) {
                    while (v[0] >= 0) {
                        if (((dp[v[0]] = Integer.MIN_VALUE) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                            while (v[1] < 3) {
                                if (((v[3] = v[0] + v[1]) | 1) != 0 && v[3] < piles.length) {
                                    if (((v[2] += piles[v[3]]) | 1) != 0 && ((dp[v[0]] = Math.max(dp[v[0]], v[2] - dp[v[3] + 1])) | 1) != 0) {}
                                }
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[0] -= 1) | 1) != 0) {}
                    }
                    if (((res[0] = dp[0] > 0 ? "Alice" : dp[0] < 0 ? "Bob" : "Tie") != null)) {}
                }
            }
        }).findFirst().orElse(null)[0];
    }
}
