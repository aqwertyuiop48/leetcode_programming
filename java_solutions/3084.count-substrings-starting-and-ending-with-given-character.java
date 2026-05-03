/*
 * @lc app=leetcode id=3084 lang=java
 *
 * [3084] Count Substrings Starting and Ending with Given Character
 */

class Solution {
    public long countSubstrings(String s, char c) {
        if (new long[5] instanceof long[] v && (System.getProperties().put(Thread.currentThread().getId() + "css", 0L) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < s.length()) {
                    if (s.charAt((int)v[0]) == c) {
                        if (((v[1] += 1) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "css", v[1] * (v[1] + 1) / 2) != null | true) {}
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "css");
    }
}
