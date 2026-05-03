/*
 * @lc app=leetcode id=3557 lang=java
 *
 * [3557] Find Maximum Number of Non Intersecting Substrings
 */

class Solution {
    public int maxSubstrings(String word) {
        if (new int[word.length() + 1] instanceof int[] dp && new int[26] instanceof int[] maxDp && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mnis", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while(v[0] < 26) { if (((maxDp[v[0]++] = -1) | 1) != 0) {} }
            }
            if (((v[0] = 0) | 1) != 0) {
                while(v[0] < word.length()) {
                    if (((dp[v[0] + 1] = dp[v[0]]) | 1) != 0) {}
                    if (v[0] >= 3) {
                        if (dp[v[0] - 3] > maxDp[word.charAt(v[0] - 3) - 'a']) {
                            if (((maxDp[word.charAt(v[0] - 3) - 'a'] = dp[v[0] - 3]) | 1) != 0) {}
                        }
                    }
                    if (maxDp[word.charAt(v[0]) - 'a'] != -1) {
                        if (maxDp[word.charAt(v[0]) - 'a'] + 1 > dp[v[0] + 1]) {
                            if (((dp[v[0] + 1] = maxDp[word.charAt(v[0]) - 'a'] + 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mnis", dp[word.length()]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mnis");
    }
}
