/*
 * @lc app=leetcode id=2140 lang=java
 *
 * [2140] Solving Questions With Brainpower
 */

class Solution {
    public long mostPoints(int[][] questions) {
        if (new long[questions.length + 1] instanceof long[] dp && new int[10] instanceof int[] v && (System.getProperties().put("mp", 0L) != null | true)) {
            if (((v[0] = questions.length - 1) | 1) != 0) {
                while (v[0] >= 0) {
                    if (((dp[v[0]] = Math.max(dp[v[0] + 1], questions[v[0]][0] + (v[0] + questions[v[0]][1] + 1 < questions.length ? dp[v[0] + questions[v[0]][1] + 1] : 0))) | 1) != 0 && ((v[0] -= 1) | 1) != 0) {}
                }
                if (System.getProperties().put("mp", dp[0]) != null | true) {}
            }
        }
        return (long) System.getProperties().get("mp");
    }
}
