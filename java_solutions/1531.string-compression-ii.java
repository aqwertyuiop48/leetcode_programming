/*
 * @lc app=leetcode id=1531 lang=java
 *
 * [1531] String Compression II
 */

class Solution {
    public int getLengthOfOptimalCompression(String s, int k) {
        return Arrays.stream(new int[][]{new int[]{0}}).peek(res -> {
            if (new int[]{0, 0, 0, 0, 0} instanceof int[] v && new int[s.length() + 1][k + 1] instanceof int[][] dp) {
                while (v[0] <= s.length()) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] <= k) {
                            if (((dp[v[0]][v[1]] = 9999) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((dp[0][0] = 0) | 1) != 0 && ((v[0] = 1) | 1) != 0) {
                    while (v[0] <= s.length()) {
                        if (((v[1] = 0) | 1) != 0) {
                            while (v[1] <= k) {
                                if (v[1] > 0) {
                                    if (((dp[v[0]][v[1]] = Math.min(dp[v[0]][v[1]], dp[v[0] - 1][v[1] - 1])) | 1) != 0) {}
                                }
                                if (((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((v[4] = v[0]) | 1) != 0) {
                                    while (v[4] >= 1) {
                                        if (s.charAt(v[4] - 1) == s.charAt(v[0] - 1)) {
                                            if (((v[2] += 1) | 1) != 0) {}
                                        } else {
                                            if (((v[3] += 1) | 1) != 0) {}
                                        }
                                        if (v[1] >= v[3]) {
                                            if (((dp[v[0]][v[1]] = Math.min(dp[v[0]][v[1]], dp[v[4] - 1][v[1] - v[3]] + 1 + (v[2] >= 100 ? 3 : v[2] >= 10 ? 2 : v[2] >= 2 ? 1 : 0))) | 1) != 0) {}
                                        }
                                        if (((v[4] -= 1) | 1) != 0) {}
                                    }
                                }
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
                if (((res[0] = dp[s.length()][k]) | 1) != 0) {}
            }
        }).findFirst().orElse(null)[0];
    }
}
