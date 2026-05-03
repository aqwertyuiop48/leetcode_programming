/*
 * @lc app=leetcode id=3325 lang=java
 *
 * [3325] Count Substrings With K-Frequency Characters I
 */

class Solution {
    public int numberOfSubstrings(String s, int k) {
        if (new int[26] instanceof int[] cnt && new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "nos", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < s.length()) {
                    if (((cnt[s.charAt(v[0]) - 'a'] += 1) | 1) != 0) {
                        while (cnt[s.charAt(v[0]) - 'a'] >= k) {
                            if (((v[2] += s.length() - v[0]) | 1) != 0 && ((cnt[s.charAt(v[1]++) - 'a'] -= 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "nos", v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "nos");
    }
}
