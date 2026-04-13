/*
 * @lc app=leetcode id=1221 lang=java
 *
 * [1221] Split a String in Balanced Strings
 */

class Solution {
    public int balancedStringSplit(String s) {
        return s.chars()
            .collect(() -> new int[2], (a, c) -> a[1] += ((a[0] += (c == 'L' ? 1 : -1)) == 0 ? 1 : 0), (a, b) -> {})[1];
    }
}
