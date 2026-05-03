/*
 * @lc app=leetcode id=2767 lang=java
 *
 * [2767] Partition String Into Minimum Beautiful Substrings
 */

class Solution {
    public int minimumBeautifulSubstrings(String s) {
        if (new int[s.length() + 1] instanceof int[] dp && new int[10] instanceof int[] v && (System.getProperties().put("mbs", -1) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] <= s.length()) { if (((dp[v[0]++] = 999999) | 1) != 0) {} }
                if (((dp[0] = 0) | 1) != 0 && ((v[0] = 1) | 1) != 0) {
                    while (v[0] <= s.length()) {
                        if (((v[1] = 0) | 1) != 0) {
                            while (v[1] < v[0]) {
                                if (s.charAt(v[1]) == '1' && dp[v[1]] != 999999) {
                                    if (((v[2] = Integer.parseInt(s.substring(v[1], v[0]), 2)) | 1) != 0 && ((v[3] = 15625) | 1) != 0) {
                                        if (15625 % v[2] == 0 && (v[2] == 1 || v[2] == 5 || v[2] == 25 || v[2] == 125 || v[2] == 625 || v[2] == 3125 || v[2] == 15625)) {
                                            if (dp[v[1]] + 1 < dp[v[0]]) { if (((dp[v[0]] = dp[v[1]] + 1) | 1) != 0) {} }
                                        }
                                    }
                                }
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put("mbs", dp[s.length()] == 999999 ? -1 : dp[s.length()]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get("mbs");
    }
}
