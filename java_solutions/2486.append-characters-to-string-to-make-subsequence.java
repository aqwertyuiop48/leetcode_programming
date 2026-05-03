/*
 * @lc app=leetcode id=2486 lang=java
 *
 * [2486] Append Characters to String to Make Subsequence
 */

class Solution {
    public int appendCharacters(String s, String t) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ac", 0) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
            while (v[0] < s.length() && v[1] < t.length()) {
                if (s.charAt(v[0]) == t.charAt(v[1])) { if (((v[1] += 1) | 1) != 0) {} }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "ac", t.length() - v[1]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "ac");
    }
}
