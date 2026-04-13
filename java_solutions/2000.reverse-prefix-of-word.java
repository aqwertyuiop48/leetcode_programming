/*
 * @lc app=leetcode id=2000 lang=java
 *
 * [2000] Reverse Prefix of Word
 */

class Solution {
    public String reversePrefix(String word, char ch) {
        return new StringBuilder(word.substring(0, word.indexOf(ch) + 1))
            .reverse()
            .append(word.substring(word.indexOf(ch) + 1))
            .toString();
    }
}
