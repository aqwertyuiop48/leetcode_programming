/*
 * @lc app=leetcode id=2490 lang=java
 *
 * [2490] Circular Sentence
 */

class Solution {
    public boolean isCircularSentence(String s) {
        return s.charAt(0) == s.charAt(s.length() - 1) && 
            IntStream.range(0, s.length())
                .filter(i -> s.charAt(i) == ' ')
                .allMatch(i -> s.charAt(i - 1) == s.charAt(i + 1));
    }
}
