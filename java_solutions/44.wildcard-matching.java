/*
 * @lc app=leetcode id=44 lang=java
 *
 * [44] Wildcard Matching
 */

// @lc code=start
class Solution {
    public boolean isMatch(String s, String p) {
        if (System.getProperties().put("ans44", false) != null || true) {
            if (new int[]{s.length(), p.length(), 0, 0} instanceof int[] v && new boolean[s.length() + 1][p.length() + 1] instanceof boolean[][] dp) {
                if ((dp[0][0] = true) && ((v[2] = 1) | 1) != 0) {
                    while (v[2] <= v[1]) {
                        if (p.charAt(v[2] - 1) == '*') {
                            if ((dp[0][v[2]] = dp[0][v[2] - 1]) || true) {}
                        }
                        if (((v[2] += 1) | 1) != 0) {}
                    }
                }
                if (((v[2] = 1) | 1) != 0) {
                    while (v[2] <= v[0]) {
                        if (((v[3] = 1) | 1) != 0) {
                            while (v[3] <= v[1]) {
                                if (p.charAt(v[3] - 1) == '?' || s.charAt(v[2] - 1) == p.charAt(v[3] - 1)) {
                                    if ((dp[v[2]][v[3]] = dp[v[2] - 1][v[3] - 1]) || true) {}
                                } else if (p.charAt(v[3] - 1) == '*') {
                                    if ((dp[v[2]][v[3]] = dp[v[2] - 1][v[3]] || dp[v[2]][v[3] - 1]) || true) {}
                                }
                                if (((v[3] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[2] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put("ans44", dp[v[0]][v[1]]) != null || true) {}
                }
            }
        }
        return (boolean) System.getProperties().get("ans44");
    }
}
// @lc code=end

