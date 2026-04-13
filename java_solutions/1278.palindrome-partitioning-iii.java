/*
 * @lc app=leetcode id=1278 lang=java
 *
 * [1278] Palindrome Partitioning III
 */

class Solution {
    public int palindromePartition(String s, int k) {
        return Arrays.stream(new int[][]{new int[]{0}}).peek(res -> {
            if (new int[]{s.length(), k, 0, 0, 0, 0, 0} instanceof int[] v && new int[s.length()][s.length()] instanceof int[][] cost && new int[s.length() + 1][k + 1] instanceof int[][] dp) {
                while (v[2] < v[0]) {
                    if (((v[3] = 0) | 1) != 0) {
                        while (v[3] <= v[2]) {
                            if (((v[4] = v[3]) | 1) != 0 && ((v[5] = v[2]) | 1) != 0 && ((v[6] = 0) | 1) != 0) {
                                while (v[4] < v[5]) {
                                    if (s.charAt(v[4]) != s.charAt(v[5])) {
                                        if (((v[6] += 1) | 1) != 0) {}
                                    }
                                    if (((v[4] += 1) | 1) != 0 && ((v[5] -= 1) | 1) != 0) {}
                                }
                                if (((cost[v[3]][v[2]] = v[6]) | 1) != 0) {}
                            }
                            if (((v[3] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[2] += 1) | 1) != 0) {}
                }
                if (((v[2] = 0) | 1) != 0) {
                    while (v[2] <= v[0]) {
                        if (((v[3] = 0) | 1) != 0) {
                            while (v[3] <= v[1]) {
                                if (((dp[v[2]][v[3]] = 9999) | 1) != 0 && ((v[3] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[2] += 1) | 1) != 0) {}
                    }
                }
                if (((dp[0][0] = 0) | 1) != 0 && ((v[2] = 1) | 1) != 0) {
                    while (v[2] <= v[0]) {
                        if (((v[3] = 1) | 1) != 0) {
                            while (v[3] <= Math.min(v[2], v[1])) {
                                if (((v[4] = v[3] - 1) | 1) != 0) {
                                    while (v[4] < v[2]) {
                                        if (((dp[v[2]][v[3]] = Math.min(dp[v[2]][v[3]], dp[v[4]][v[3] - 1] + cost[v[4]][v[2] - 1])) | 1) != 0 && ((v[4] += 1) | 1) != 0) {}
                                    }
                                }
                                if (((v[3] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[2] += 1) | 1) != 0) {}
                    }
                }
                if (((res[0] = dp[v[0]][v[1]]) | 1) != 0) {}
            }
        }).findFirst().orElse(null)[0];
    }
}
