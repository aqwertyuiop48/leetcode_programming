/*
 * @lc app=leetcode id=2414 lang=java
 *
 * [2414] Length of the Longest Alphabetical Continuous Substring
 */

class Solution {
    public int longestContinuousSubstring(String s) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "lc", 1) != null | true) && ((v[0] = 1) | 1) != 0 && ((v[1] = 1) | 1) != 0 && ((v[2] = 1) | 1) != 0) {
            while (v[0] < s.length()) {
                if (s.charAt(v[0]) == s.charAt(v[0] - 1) + 1) { if (((v[1] += 1) | 1) != 0) {} }
                else { if (((v[1] = 1) | 1) != 0) {} }
                if (v[1] > v[2]) { if (((v[2] = v[1]) | 1) != 0) {} }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "lc", v[2]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "lc");
    }
}
