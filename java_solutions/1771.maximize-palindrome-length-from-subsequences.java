/*
 * @lc app=leetcode id=1771 lang=java
 *
 * [1771] Maximize Palindrome Length From Subsequences
 */

class Solution {
    public int longestPalindrome(String word1, String word2) {
        while (true) {
            if ((word1 + word2).toCharArray() instanceof char[] s && new int[s.length][s.length] instanceof int[][] dp && new int[]{1, 0, 0, 0, 0, word1.length(), s.length} instanceof int[] v) {
                while (v[4] < 2) {
                    if (v[4] == 0) {
                        if (v[0] <= v[6]) {
                            if (((v[1] = 0) | 1) != 0 && ((v[4] = 1) | 1) != 0) {}
                        } else {
                            if (((v[4] = 2) | 1) != 0) {}
                        }
                    } else if (v[4] == 1) {
                        if (v[1] <= v[6] - v[0]) {
                            if (((v[2] = v[1] + v[0] - 1) | 1) != 0) {
                                if (v[1] == v[2]) {
                                    if (((dp[v[1]][v[2]] = 1) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                                } else if (s[v[1]] == s[v[2]]) {
                                    if (((dp[v[1]][v[2]] = dp[v[1] + 1][v[2] - 1] + 2) | 1) != 0) {
                                        if (v[1] < v[5] && v[2] >= v[5]) {
                                            if (((v[3] = Math.max(v[3], dp[v[1]][v[2]])) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                                        } else {
                                            if (((v[1] += 1) | 1) != 0) {}
                                        }
                                    }
                                } else {
                                    if (((dp[v[1]][v[2]] = Math.max(dp[v[1] + 1][v[2]], dp[v[1]][v[2] - 1])) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                                }
                            }
                        } else {
                            if (((v[0] += 1) | 1) != 0 && ((v[4] = 0) | 1) != 0) {}
                        }
                    }
                }
                return v[3];
            }
        }
    }
}
