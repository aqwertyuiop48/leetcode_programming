/*
 * @lc app=leetcode id=598 lang=java
 *
 * [598] Range Addition II
 */

class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        return Math.min(m, java.util.Arrays.stream(ops).mapToInt(o -> o[0]).min().orElse(m)) * Math.min(n, java.util.Arrays.stream(ops).mapToInt(o -> o[1]).min().orElse(n));
    }
}
