/*
 * @lc app=leetcode id=3713 lang=java
 *
 * [3713] Longest Balanced Substring I
 */

class Solution {
    public int longestBalanced(String s) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "lbs", 0) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < s.length()) {
                if (new int[26] instanceof int[] cnt && ((v[1] = v[0]) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                    while (v[1] < s.length()) {
                        if (((cnt[s.charAt(v[1]) - 'a'] += 1) | 1) != 0) {
                            if (cnt[s.charAt(v[1]) - 'a'] == 1) { if (((v[2] += 1) | 1) != 0) {} }
                            if (cnt[s.charAt(v[1]) - 'a'] > v[3]) { if (((v[3] = cnt[s.charAt(v[1]) - 'a']) | 1) != 0) {} }
                            if (v[3] * v[2] == v[1] - v[0] + 1) {
                                if (v[1] - v[0] + 1 > (int)System.getProperties().get(Thread.currentThread().getId() + "lbs")) {
                                    if (System.getProperties().put(Thread.currentThread().getId() + "lbs", v[1] - v[0] + 1) != null | true) {}
                                }
                            }
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "lbs");
    }
}
