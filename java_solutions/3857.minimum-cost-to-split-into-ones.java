/*
 * @lc app=leetcode id=3857 lang=java
 *
 * [3857] Minimum Cost to Split into Ones
 */

class Solution {
    public int minCost(int n) {
        return n * (n - 1) / 2;
    }
}
