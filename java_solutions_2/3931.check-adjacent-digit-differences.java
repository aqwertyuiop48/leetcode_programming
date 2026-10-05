/*
 * @lc app=leetcode id=3931 lang=java
 *
 * [3931] Check Adjacent Digit Differences
 */

class Solution {
public boolean isAdjacentDiffAtMostTwo(String s) {
    return IntStream.range(0, s.length() - 1).allMatch(i -> Math.abs(s.charAt(i) - s.charAt(i + 1)) <= 2);
}
}
