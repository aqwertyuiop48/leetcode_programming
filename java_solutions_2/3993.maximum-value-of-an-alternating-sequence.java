/*
 * @lc app=leetcode id=3993 lang=java
 *
 * [3993] Maximum Value of an Alternating Sequence
 */

class Solution {
    public long maximumValue(int n, int s, int m) {
         return s + (long)n / 2 * (m - 1) + (n > 1 ? 1 : 0);
    }
}
