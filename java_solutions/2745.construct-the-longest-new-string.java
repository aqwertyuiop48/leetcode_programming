/*
 * @lc app=leetcode id=2745 lang=java
 *
 * [2745] Construct the Longest New String
 */

class Solution {
    public int longestString(int x, int y, int z) {
        return (2 * Math.min(x, y) + (x == y ? 0 : 1) + z) * 2;
    }
}
