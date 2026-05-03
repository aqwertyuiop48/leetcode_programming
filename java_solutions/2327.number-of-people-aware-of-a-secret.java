/*
 * @lc app=leetcode id=2327 lang=java
 *
 * [2327] Number of People Aware of a Secret
 */

class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        if (new long[n + 1] instanceof long[] dp && new long[5] instanceof long[] v && (System.getProperties().put("pas", 0) != null | true)) {
            if (((dp[1] = 1) | 1) != 0 && ((v[0] = 2) | 1) != 0 && ((v[3] = 1000000007L) | 1) != 0) {
                while (v[0] <= n) {
                    if (((v[1] = (v[1] + (v[0] - delay >= 1 ? dp[(int)v[0] - delay] : 0) - (v[0] - forget >= 1 ? dp[(int)v[0] - forget] : 0) + v[3]) % v[3]) | 1) != 0 && ((dp[(int)v[0]] = v[1]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = n - forget + 1) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                    while (v[0] <= n) { if (((v[2] = (v[2] + dp[(int)v[0]++]) % v[3]) | 1) != 0) {} }
                    if (System.getProperties().put("pas", (int)v[2]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get("pas");
    }
}
