/*
 * @lc app=leetcode id=3090 lang=java
 *
 * [3090] Maximum Length Substring With Two Occurrences
 */

class Solution {
    public int maximumLengthSubstring(String s) {
        if (new int[26] instanceof int[] cnt && new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mls", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[1] < s.length()) {
                    if (((cnt[s.charAt(v[1]) - 'a'] += 1) | 1) != 0) {
                        while (cnt[s.charAt(v[1]) - 'a'] > 2) {
                            if (((cnt[s.charAt(v[0]++) - 'a'] -= 1) | 1) != 0) {}
                        }
                        if (v[1] - v[0] + 1 > v[2]) {
                            if (((v[2] = v[1] - v[0] + 1) | 1) != 0) {}
                        }
                    }
                    if (((v[1] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mls", v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mls");
    }
}
