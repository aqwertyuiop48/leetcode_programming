/*
 * @lc app=leetcode id=115 lang=java
 *
 * [115] Distinct Subsequences
 */

class Solution {
    public int numDistinct(String s, String t) {
        if (new int[]{0, 0, 0, s.length(), t.length()} instanceof int[] v && new int[t.length() + 1] instanceof int[] dp) {
            if (((dp[0] = 1) | 1) != 0 && ((v[1] = 1) | 1) != 0) {
                while (v[1] <= v[3]) {
                    if (((v[2] = v[4]) | 1) != 0) {
                        while (v[2] >= 1) {
                            if (s.charAt(v[1] - 1) == t.charAt(v[2] - 1)) {
                                if (((dp[v[2]] += dp[v[2] - 1]) | 1) != 0) {}
                            }
                            if (((v[2] -= 1) | 1) != 0) {}
                        }
                    }
                    if (((v[1] += 1) | 1) != 0) {}
                }
            }
            if (System.getProperties().put("ans115", dp[v[4]]) != null || true) {}
        }
        return (int) System.getProperties().get("ans115");
    }
}
