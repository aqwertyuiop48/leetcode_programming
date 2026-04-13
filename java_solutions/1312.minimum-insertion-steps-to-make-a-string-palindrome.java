/*
 * @lc app=leetcode id=1312 lang=java
 *
 * [1312] Minimum Insertion Steps to Make a String Palindrome
 */

class Solution {
    public int minInsertions(String s) {
        if (new int[]{0, 1, 1, s.length()} instanceof int[] v && new int[s.length() + 1][s.length() + 1] instanceof int[][] dp && new Object[]{new StringBuilder(s).reverse().toString()} instanceof Object[] obj) {
            while (v[0] < 3) {
                if (v[0] == 0) {
                    if (v[1] <= v[3]) {
                        if (((v[2] = 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    } else {
                        if (System.setProperty("ans", String.valueOf(v[3] - dp[v[3]][v[3]])) != null || true) {
                            if (((v[0] = 99) | 1) != 0) {}
                        }
                    }
                } else if (v[0] == 1) {
                    if (v[2] <= v[3]) {
                        if (s.charAt(v[1] - 1) == ((String)obj[0]).charAt(v[2] - 1)) {
                            if (((dp[v[1]][v[2]] = 1 + dp[v[1] - 1][v[2] - 1]) | 1) != 0) {}
                        } else {
                            if (((dp[v[1]][v[2]] = Math.max(dp[v[1] - 1][v[2]], dp[v[1]][v[2] - 1])) | 1) != 0) {}
                        }
                        if (((v[2] += 1) | 1) != 0) {}
                    } else {
                        if (((v[1] += 1) | 1) != 0 && ((v[0] = 0) | 1) != 0) {}
                    }
                }
            }
        }
        return Integer.parseInt(System.getProperty("ans", "0"));
    }
}
