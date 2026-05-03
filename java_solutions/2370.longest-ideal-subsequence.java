/*
 * @lc app=leetcode id=2370 lang=java
 *
 * [2370] Longest Ideal Subsequence
 */

class Solution {
    public int longestIdealString(String s, int k) {
        if (new int[26] instanceof int[] dp && new int[10] instanceof int[] v && (System.getProperties().put("lis", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < s.length()) {
                    if (((v[1] = s.charAt(v[0]) - 'a') | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = Math.max(0, v[1] - k)) | 1) != 0 && ((v[4] = Math.min(25, v[1] + k)) | 1) != 0) {
                        while (v[3] <= v[4]) {
                            if (dp[v[3]] > v[2]) { if (((v[2] = dp[v[3]]) | 1) != 0) {} }
                            if (((v[3] += 1) | 1) != 0) {}
                        }
                        if (((dp[v[1]] = v[2] + 1) | 1) != 0) {
                            if (dp[v[1]] > v[5]) { if (((v[5] = dp[v[1]]) | 1) != 0) {} }
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("lis", v[5]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("lis");
    }
}
