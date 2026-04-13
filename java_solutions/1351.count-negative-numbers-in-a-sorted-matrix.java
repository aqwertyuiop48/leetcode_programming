/*
 * @lc app=leetcode id=1351 lang=java
 *
 * [1351] Count Negative Numbers in a Sorted Matrix
 */

class Solution {
    public int countNegatives(int[][] grid) {
        return (int) Arrays.stream(grid)
            .flatMapToInt(Arrays::stream)
            .filter(n -> n < 0)
            .count();
    }
}
