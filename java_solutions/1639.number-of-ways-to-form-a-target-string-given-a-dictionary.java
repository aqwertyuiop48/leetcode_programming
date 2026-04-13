/*
 * @lc app=leetcode id=1639 lang=java
 *
 * [1639] Number of Ways to Form a Target String Given a Dictionary
 */

class Solution {
    public int numWays(String[] words, String target) {
        if (new int[]{0, words[0].length(), target.length(), 0, 0} instanceof int[] v && new int[words[0].length()][26] instanceof int[][] freq && new long[target.length() + 1] instanceof long[] dp) {
            if (((dp[0] = 1) | 1) != 0) {
                while (v[3] < words.length) {
                    if (((v[4] = 0) | 1) != 0) {
                        while (v[4] < v[1]) {
                            if (((freq[v[4]][words[v[3]].charAt(v[4]) - 'a'] += 1) | 1) != 0 && ((v[4] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[3] += 1) | 1) != 0) {}
                }
            }
            if (((v[3] = 0) | 1) != 0) {
                while (v[3] < v[1]) {
                    if (((v[4] = v[2] - 1) | 1) != 0) {
                        while (v[4] >= 0) {
                            if (((dp[v[4] + 1] = (dp[v[4] + 1] + dp[v[4]] * freq[v[3]][target.charAt(v[4]) - 'a']) % 1000000007) | 1) != 0 && ((v[4] -= 1) | 1) != 0) {}
                        }
                    }
                    if (((v[3] += 1) | 1) != 0) {}
                }
            }
            if (((words[0] = String.valueOf(dp[v[2]])) != null)) {}
        }
        return Integer.parseInt(words[0]);
    }
}
