/*
 * @lc app=leetcode id=87 lang=java
 *
 * [87] Scramble String
 */

class Solution {
    public boolean isScramble(String s1, String s2) {
        if (System.getProperties().put("ans87", false) != null || true) {
            if (new int[]{0, 0, 0, 0, s1.length()} instanceof int[] v && new boolean[s1.length() + 1][s1.length()][s1.length()] instanceof boolean[][][] dp) {
                if (s1.length() == s2.length()) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < v[4]) {
                            if (((v[2] = 0) | 1) != 0) {
                                while (v[2] < v[4]) {
                                    if (((dp[1][v[1]][v[2]] = s1.charAt(v[1]) == s2.charAt(v[2])) || true) && ((v[2] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] = 2) | 1) != 0) {
                        while (v[0] <= v[4]) {
                            if (((v[1] = 0) | 1) != 0) {
                                while (v[1] <= v[4] - v[0]) {
                                    if (((v[2] = 0) | 1) != 0) {
                                        while (v[2] <= v[4] - v[0]) {
                                            if (((v[3] = 1) | 1) != 0) {
                                                while (v[3] < v[0]) {
                                                    if ((dp[v[3]][v[1]][v[2]] && dp[v[0] - v[3]][v[1] + v[3]][v[2] + v[3]]) || (dp[v[3]][v[1]][v[2] + v[0] - v[3]] && dp[v[0] - v[3]][v[1] + v[3]][v[2]])) {
                                                        if (((dp[v[0]][v[1]][v[2]] = true) || true) && ((v[3] = v[0]) | 1) != 0) {}
                                                    }
                                                    if (((v[3] += 1) | 1) != 0) {}
                                                }
                                            }
                                            if (((v[2] += 1) | 1) != 0) {}
                                        }
                                    }
                                    if (((v[1] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[0] += 1) | 1) != 0) {}
                        }
                    }
                    if (System.getProperties().put("ans87", dp[v[4]][0][0]) != null || true) {}
                }
            }
        }
        return (boolean) System.getProperties().get("ans87");
    }
}
