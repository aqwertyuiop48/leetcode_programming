/*
 * @lc app=leetcode id=1668 lang=java
 *
 * [1668] Maximum Repeating Substring
 */

class Solution {
    public int maxRepeating(String sequence, String word) {
        return (int) IntStream.rangeClosed(1, sequence.length() / word.length())
                .filter(k -> sequence.contains(word.repeat(k)))
                .count();
    }
}
