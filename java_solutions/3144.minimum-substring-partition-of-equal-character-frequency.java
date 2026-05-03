/*
 * @lc app=leetcode id=3144 lang=java
 *
 * [3144] Minimum Substring Partition of Equal Character Frequency
 */

class Solution {
    public int minimumSubstringsInPartition(String s) {
        if (new int[s.length() + 5] instanceof int[] dp && new int[15] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "msp", 0) != null | true)) {
            if (((v[0] = 1) | 1) != 0) {
                while (v[0] <= s.length()) {
                    if (((dp[v[0]] = 9999999) | 1) != 0 && new int[26] instanceof int[] cnt && ((v[1] = v[0]) | 1) != 0) {
                        while (v[1] >= 1) {
                            if (((cnt[s.charAt(v[1] - 1) - 'a'] += 1) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((v[4] = 1) | 1) != 0) {
                                while (v[2] < 26 && v[4] == 1) {
                                    if (cnt[v[2]] > 0) {
                                        if (v[3] == 0) { if (((v[3] = cnt[v[2]]) | 1) != 0) {} }
                                        else if (cnt[v[2]] != v[3]) { if (((v[4] = 0) | 1) != 0) {} }
                                    }
                                    if (((v[2] += 1) | 1) != 0) {}
                                }
                                if (v[4] == 1) {
                                    if (dp[v[1] - 1] + 1 < dp[v[0]]) { if (((dp[v[0]] = dp[v[1] - 1] + 1) | 1) != 0) {} }
                                }
                            }
                            if (((v[1] -= 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "msp", dp[s.length()]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "msp");
    }
}
