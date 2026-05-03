/*
 * @lc app=leetcode id=2707 lang=java
 *
 * [2707] Extra Characters in a String
 */

class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        if (new int[s.length() + 1] instanceof int[] dp && new int[10] instanceof int[] v && (System.getProperties().put("mec", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] <= s.length()) { if (((dp[v[0]++] = 999999) | 1) != 0) {} }
                if (((dp[0] = 0) | 1) != 0 && ((v[0] = 1) | 1) != 0) {
                    while (v[0] <= s.length()) {
                        if (((dp[v[0]] = dp[v[0] - 1] + 1) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                            while (v[1] < dictionary.length) {
                                if (v[0] >= dictionary[v[1]].length() && s.substring(v[0] - dictionary[v[1]].length(), v[0]).equals(dictionary[v[1]])) {
                                    if (dp[v[0] - dictionary[v[1]].length()] < dp[v[0]]) { if (((dp[v[0]] = dp[v[0] - dictionary[v[1]].length()]) | 1) != 0) {} }
                                }
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put("mec", dp[s.length()]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get("mec");
    }
}
