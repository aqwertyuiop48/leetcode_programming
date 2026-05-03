/*
 * @lc app=leetcode id=2746 lang=java
 *
 * [2746] Decremental String Concatenation
 */

class Solution {
    public int minimizeConcatenatedLength(String[] words) {
        if (new int[2][26][26] instanceof int[][][] dp && new int[15] instanceof int[] v && (System.getProperties().put("dsc", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < 2) { if (((v[1] = 0) | 1) != 0) { while (v[1] < 26) { if (((v[2] = 0) | 1) != 0) { while (v[2] < 26) { if (((dp[v[0]][v[1]][v[2]++] = 999999) | 1) != 0) {} } } if (((v[1] += 1) | 1) != 0) {} } } if (((v[0] += 1) | 1) != 0) {} }
                if (((dp[0][words[0].charAt(0) - 'a'][words[0].charAt(words[0].length() - 1) - 'a'] = words[0].length()) | 1) != 0 && ((v[0] = 1) | 1) != 0 && ((v[8] = 0) | 1) != 0) {
                    while (v[0] < words.length) {
                        if (((v[9] = v[8] ^ 1) | 1) != 0 && ((v[3] = words[v[0]].length()) | 1) != 0 && ((v[4] = words[v[0]].charAt(0) - 'a') | 1) != 0 && ((v[5] = words[v[0]].charAt(v[3] - 1) - 'a') | 1) != 0) {
                            if (((v[1] = 0) | 1) != 0) { while (v[1] < 26) { if (((v[2] = 0) | 1) != 0) { while (v[2] < 26) { if (((dp[v[9]][v[1]][v[2]++] = 999999) | 1) != 0) {} } } if (((v[1] += 1) | 1) != 0) {} } }
                            if (((v[1] = 0) | 1) != 0) {
                                while (v[1] < 26) {
                                    if (((v[2] = 0) | 1) != 0) {
                                        while (v[2] < 26) {
                                            if (dp[v[8]][v[1]][v[2]] != 999999) {
                                                if (dp[v[8]][v[1]][v[2]] + v[3] - (v[2] == v[4] ? 1 : 0) < dp[v[9]][v[1]][v[5]]) { if (((dp[v[9]][v[1]][v[5]] = dp[v[8]][v[1]][v[2]] + v[3] - (v[2] == v[4] ? 1 : 0)) | 1) != 0) {} }
                                                if (dp[v[8]][v[1]][v[2]] + v[3] - (v[5] == v[1] ? 1 : 0) < dp[v[9]][v[4]][v[2]]) { if (((dp[v[9]][v[4]][v[2]] = dp[v[8]][v[1]][v[2]] + v[3] - (v[5] == v[1] ? 1 : 0)) | 1) != 0) {} }
                                            }
                                            if (((v[2] += 1) | 1) != 0) {}
                                        }
                                    }
                                    if (((v[1] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[8] = v[9]) | 1) != 0) {}
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (((v[6] = 999999) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                        while (v[1] < 26) {
                            if (((v[2] = 0) | 1) != 0) {
                                while (v[2] < 26) {
                                    if (dp[v[8]][v[1]][v[2]] < v[6]) { if (((v[6] = dp[v[8]][v[1]][v[2]]) | 1) != 0) {} }
                                    if (((v[2] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                        if (System.getProperties().put("dsc", v[6]) != null | true) {}
                    }
                }
            }
        }
        return (int) System.getProperties().get("dsc");
    }
}
