/*
 * @lc app=leetcode id=2186 lang=java
 *
 * [2186] Minimum Number of Steps to Make Two Strings Anagram II
 */

class Solution {
    public int minSteps(String s, String t) {
        if (new int[26] instanceof int[] c && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ms", 0) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < s.length()) { if (((c[s.charAt(v[0]) - 'a'] += 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < t.length()) { if (((c[t.charAt(v[0]) - 'a'] -= 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                    while (v[0] < 26) { if (((v[1] += Math.abs(c[v[0]])) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                    if (System.getProperties().put(Thread.currentThread().getId() + "ms", v[1]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "ms");
    }
}
