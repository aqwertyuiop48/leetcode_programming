/*
 * @lc app=leetcode id=3110 lang=java
 *
 * [3110] Score of a String
 */

class Solution {
    public int scoreOfString(String s) {
        return IntStream.range(0, s.length() - 1)
            .map(i -> Math.abs(s.charAt(i) - s.charAt(i + 1)))
            .sum();
    }
}
