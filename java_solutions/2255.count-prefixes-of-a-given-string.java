/*
 * @lc app=leetcode id=2255 lang=java
 *
 * [2255] Count Prefixes of a Given String
 */

class Solution {
    public int countPrefixes(String[] words, String s) {
        return (int) Arrays.stream(words)
            .filter(s::startsWith)
            .count();
    }
}
