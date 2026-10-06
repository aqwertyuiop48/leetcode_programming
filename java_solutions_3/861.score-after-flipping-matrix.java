/*
 * @lc app=leetcode id=861 lang=java
 *
 * [861] Score After Flipping Matrix
 */

class Solution {
    public int matrixScore(int[][] grid) {
        return java.util.stream.IntStream.range(0, grid[0].length).map(j -> Math.max((int) java.util.stream.IntStream.range(0, grid.length).filter(i -> grid[i][j] == grid[i][0]).count(),
            (int) java.util.stream.IntStream.range(0, grid.length).filter(i -> grid[i][j] != grid[i][0]).count()) << (grid[0].length - 1 - j)).sum();
    }
}
