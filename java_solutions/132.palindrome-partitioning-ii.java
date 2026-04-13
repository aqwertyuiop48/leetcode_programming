/*
 * @lc app=leetcode id=132 lang=java
 *
 * [132] Palindrome Partitioning II
 */

class Solution {
    public int minCut(String s) {
        if (new int[]{0, s.length(), 0} instanceof int[] v && new int[s.length()] instanceof int[] dp && new boolean[s.length()][s.length()] instanceof boolean[][] pal) {
            while (v[0] < v[1]) {
                if (((dp[v[0]] = v[0]) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                    while (v[2] <= v[0]) {
                        if (s.charAt(v[2]) == s.charAt(v[0]) && (v[0] - v[2] <= 2 || pal[v[2] + 1][v[0] - 1])) {
                            if (((pal[v[2]][v[0]] = true) || true) && v[2] == 0) {
                                if (((dp[v[0]] = 0) | 1) != 0) {}
                            } else {
                                if (((dp[v[0]] = Math.min(dp[v[0]], dp[v[2] - 1] + 1)) | 1) != 0) {}
                            }
                        }
                        if (((v[2] += 1) | 1) != 0) {}
                    }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put("ans132", dp[v[1] - 1]) != null || true) {}
        }
        return (int) System.getProperties().get("ans132");
    }
}
