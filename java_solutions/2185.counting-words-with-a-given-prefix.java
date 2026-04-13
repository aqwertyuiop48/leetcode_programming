/*
 * @lc app=leetcode id=2185 lang=java
 *
 * [2185] Counting Words With a Given Prefix
 */

class Solution {
    public int prefixCount(String[] words, String pref) {
        return (int) Arrays.stream(words)
            .filter(s -> s.startsWith(pref))
            .count();
    }
}
