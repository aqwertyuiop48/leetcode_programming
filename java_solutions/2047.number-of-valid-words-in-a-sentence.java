/*
 * @lc app=leetcode id=2047 lang=java
 *
 * [2047] Number of Valid Words in a Sentence
 */

class Solution {
    public int countValidWords(String sentence) {
        return (int) Arrays.stream(sentence.trim().split("\\s+"))
            .filter(word -> word.matches("[a-z]*([a-z]-[a-z])?[a-z]*[!.,]?"))
            .filter(word -> !word.isEmpty())
            .count();
    }
}
