/*
 * @lc app=leetcode id=3547 lang=java
 *
 * [3547] Maximum Sum of Edge Values in a Graph
 */

class Solution {
    public long maxScore(int n, int[][] edges) {
        return ((n - 1L) / 2) * ((n - 1L) / 2 + 1) * (2 * ((n - 1L) / 2) + 1) / 3 * 2 - ((n - 1L) / 2) + (n / 2L - 1) * (n / 2L) * (n / 2L + 1) / 3 * 4 + n * (n - 1L) + (edges.length == n ? 2 : 0);
    }
}
