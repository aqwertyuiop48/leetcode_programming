/*
 * @lc app=leetcode id=664 lang=java
 *
 * [664] Strange Printer
 */

class Solution {
    public int strangePrinter(String s) {
        if (System.getProperties().put("ans664", 0) != null || true) {
            if (new int[]{s.length(), 0, 0, 0} instanceof int[] v && new int[s.length()][s.length()] instanceof int[][] dp) {
                if (((v[1] = v[0] - 1) | 1) != 0) {
                    while (v[1] >= 0) {
                        if (((dp[v[1]][v[1]] = 1) | 1) != 0 && ((v[2] = v[1] + 1) | 1) != 0) {
                            while (v[2] < v[0]) {
                                if (((dp[v[1]][v[2]] = dp[v[1]][v[2] - 1] + 1) | 1) != 0 && ((v[3] = v[1]) | 1) != 0) {
                                    while (v[3] < v[2]) {
                                        if (s.charAt(v[3]) == s.charAt(v[2])) {
                                            if (((dp[v[1]][v[2]] = Math.min(dp[v[1]][v[2]], dp[v[1]][v[3]] + (v[3] + 1 <= v[2] - 1 ? dp[v[3] + 1][v[2] - 1] : 0))) | 1) != 0) {}
                                        }
                                        if (((v[3] += 1) | 1) != 0) {}
                                    }
                                }
                                if (((v[2] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[1] -= 1) | 1) != 0) {}
                    }
                }
                if (System.getProperties().put("ans664", s.isEmpty() ? 0 : dp[0][v[0] - 1]) != null || true) {}
            }
        }
        return (int) System.getProperties().get("ans664");
    }
}
