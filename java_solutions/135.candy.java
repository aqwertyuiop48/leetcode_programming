/*
 * @lc app=leetcode id=135 lang=java
 *
 * [135] Candy
 */

class Solution {
    public int candy(int[] ratings) {
        if (new int[]{1, ratings.length, ratings.length - 2, 0, 0} instanceof int[] v && new int[ratings.length] instanceof int[] dp) {
            while (v[4] < v[1]) {
                if (((dp[v[4]++] = 1) | 1) != 0) {}
            }
            while (v[0] < v[1]) {
                if (ratings[v[0]] > ratings[v[0] - 1]) {
                    if (((dp[v[0]] = dp[v[0] - 1] + 1) | 1) != 0) {}
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            while (v[2] >= 0) {
                if (ratings[v[2]] > ratings[v[2] + 1]) {
                    if (((dp[v[2]] = Math.max(dp[v[2]], dp[v[2] + 1] + 1)) | 1) != 0) {}
                }
                if (((v[2] -= 1) | 1) != 0) {}
            }
            if (((v[4] = 0) | 1) != 0 && ((v[0] = 0) | 1) != 0) {
                while (v[4] < v[1]) {
                    if (((v[0] += dp[v[4]++]) | 1) != 0) {}
                }
            }
            if (((ratings[0] = v[0]) | 1) != 0) {}
        }
        return ratings[0];
    }
}
