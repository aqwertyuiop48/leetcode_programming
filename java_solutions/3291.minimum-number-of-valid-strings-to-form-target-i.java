/*
 * @lc app=leetcode id=3291 lang=java
 *
 * [3291] Minimum Number of Valid Strings to Form Target I
 */

class Solution {
    public int minValidStrings(String[] words, String target) {
        // Fixed line below: Increased array size from 50005 * 26 to 100005 * 26
        if (new int[100005 * 26] instanceof int[] trie && new int[target.length() + 1] instanceof int[] dp && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mnvs", -1) != null | true)) {
            if (((v[0] = 1) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[1] < words.length) {
                    if (((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                        while (v[3] < words[v[1]].length()) {
                            if (trie[v[2] * 26 + (words[v[1]].charAt(v[3]) - 'a')] == 0) {
                                if (((trie[v[2] * 26 + (words[v[1]].charAt(v[3]) - 'a')] = v[0]++) | 1) != 0) {}
                            }
                            if (((v[2] = trie[v[2] * 26 + (words[v[1]].charAt(v[3]) - 'a')]) | 1) != 0 && ((v[3] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[1] += 1) | 1) != 0) {}
                }
            }
            if (((v[1] = 1) | 1) != 0) {
                while (v[1] <= target.length()) { if (((dp[v[1]++] = 999999) | 1) != 0) {} }
            }
            if (((v[1] = 0) | 1) != 0) {
                while (v[1] < target.length()) {
                    if (dp[v[1]] != 999999) {
                        if (((v[2] = 0) | 1) != 0 && ((v[3] = v[1]) | 1) != 0) {
                            while (v[3] < target.length() && trie[v[2] * 26 + (target.charAt(v[3]) - 'a')] != 0) {
                                if (((v[2] = trie[v[2] * 26 + (target.charAt(v[3]) - 'a')]) | 1) != 0 && ((v[3] += 1) | 1) != 0) {
                                    if (dp[v[1]] + 1 < dp[v[3]]) { if (((dp[v[3]] = dp[v[1]] + 1) | 1) != 0) {} }
                                }
                            }
                        }
                    }
                    if (((v[1] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mnvs", dp[target.length()] == 999999 ? -1 : dp[target.length()]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mnvs");
    }
}
