/*
 * @lc app=leetcode id=4034 lang=java
 *
 * [4034] Minimum Bishop Moves to Reach Target
 */

class Solution {
    public int minBishopMoves(int[] source, int[] target) {
    return (source[0] + source[1]) % 2 != (target[0] + target[1]) % 2 ? -1
        : Math.abs(source[0] - target[0]) == Math.abs(source[1] - target[1]) ? 1 : 2;
}
}
