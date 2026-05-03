/*
 * @lc app=leetcode id=3472 lang=java
 *
 * [3472] Longest Palindromic Subsequence After at Most K Operations
 */

class Solution {
    public int longestPalindromicSubsequence(String s, int k) {
        if (new int[s.length()][s.length()][k + 1] instanceof int[][][] dp && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "lps", 0) != null | true)) {
            if (((v[0] = 1) | 1) != 0) {
                while (v[0] <= s.length()) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] <= s.length() - v[0]) {
                            if (((v[2] = v[1] + v[0] - 1) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                                while (v[3] <= k) {
                                    if (v[0] == 1) {
                                        if (((dp[v[1]][v[2]][v[3]] = 1) | 1) != 0) {}
                                    } else {
                                        if (((v[4] = dp[v[1]+1][v[2]][v[3]]) | 1) != 0 && ((v[5] = dp[v[1]][v[2]-1][v[3]]) | 1) != 0) {
                                            if (((dp[v[1]][v[2]][v[3]] = Math.max(v[4], v[5])) | 1) != 0) {
                                                if (((v[6] = Math.abs(s.charAt(v[1]) - s.charAt(v[2]))) | 1) != 0 && ((v[7] = Math.min(v[6], 26 - v[6])) | 1) != 0) {
                                                    if (v[3] >= v[7]) {
                                                        if (((v[8] = 2 + (v[0] == 2 ? 0 : dp[v[1]+1][v[2]-1][v[3] - v[7]])) | 1) != 0) {
                                                            if (v[8] > dp[v[1]][v[2]][v[3]]) { if (((dp[v[1]][v[2]][v[3]] = v[8]) | 1) != 0) {} }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (((v[3] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "lps", dp[0][s.length() - 1][k]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "lps");
    }
}
