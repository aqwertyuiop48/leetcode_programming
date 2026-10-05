/*
 * @lc app=leetcode id=4061 lang=java
 *
 * [4061] Minimum Queen Moves to Reach Target
 */

class Solution {
    public int minQueenMoves(int[] s, int[] t) {
        return (s[0] == t[0] && s[1] == t[1]) ? 0 : (s[0] == t[0] || s[1] == t[1] || Math.abs(s[0] - t[0]) == Math.abs(s[1] - t[1]))? 1 : 2;
    }
}
