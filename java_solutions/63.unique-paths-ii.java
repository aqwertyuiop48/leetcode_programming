/*
 * @lc app=leetcode id=63 lang=java
 *
 * [63] Unique Paths II
 */

class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        return grid[0][0] == 1 ? 0 : java.util.stream.Stream.of(new int[grid[0].length]).map(dp -> java.util.stream.IntStream.range(0, grid.length).map(i -> java.util.stream.IntStream.range(0, grid[0].length).map(j -> dp[j] = grid[i][j] == 1 ? 0 : (i == 0 && j == 0 ? 1 : (i == 0 ? dp[j-1] : j == 0 ? dp[j] : dp[j] + dp[j-1]))).max().getAsInt()).max().getAsInt() > -1 ? dp[grid[0].length - 1] : 0).findFirst().get();
    }
}
