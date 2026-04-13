/*
 * @lc app=leetcode id=1320 lang=java
 *
 * [1320] Minimum Distance to Type a Word Using Two Fingers
 */

class Solution {
    public int minimumDistance(String word) {
        if (new int[]{0, word.length() - 1, 0, 0, 0, 0, 0} instanceof int[] v && new int[word.length() + 1][27][27] instanceof int[][][] dp) {
            while (v[0] < 4) {
                if (v[0] == 0) {
                    if (v[1] >= 0) {
                        if (((v[4] = word.charAt(v[1]) - 'A') | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    } else {
                        if (System.setProperty("ans", String.valueOf(dp[0][26][26])) != null || true) {
                            if (((v[0] = 99) | 1) != 0) {}
                        }
                    }
                } else if (v[0] == 1) {
                    if (v[2] <= 26) {
                        if (((v[3] = 0) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                    } else {
                        if (((v[1] -= 1) | 1) != 0 && ((v[0] = 0) | 1) != 0) {}
                    }
                } else if (v[0] == 2) {
                    if (v[3] <= 26) {
                        if (((v[5] = (v[2] == 26 ? 0 : Math.abs(v[2] / 6 - v[4] / 6) + Math.abs(v[2] % 6 - v[4] % 6)) + dp[v[1] + 1][v[4]][v[3]]) | 1) != 0 && ((v[6] = (v[3] == 26 ? 0 : Math.abs(v[3] / 6 - v[4] / 6) + Math.abs(v[3] % 6 - v[4] % 6)) + dp[v[1] + 1][v[2]][v[4]]) | 1) != 0 && ((dp[v[1]][v[2]][v[3]] = Math.min(v[5], v[6])) | 1) != 0 && ((v[3] += 1) | 1) != 0) {}
                    } else {
                        if (((v[2] += 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    }
                }
            }
        }
        return Integer.parseInt(System.getProperty("ans", "0"));
    }
}
