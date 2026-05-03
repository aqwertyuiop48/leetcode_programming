/*
 * @lc app=leetcode id=64 lang=java
 *
 * [64] Minimum Path Sum
 */

class Solution {
    public int minPathSum(int[][] grid) {
        return java.util.stream.Stream.of(new int[grid[0].length]).map(dp -> java.util.stream.IntStream.range(0, grid.length).map(i -> java.util.stream.IntStream.range(0, grid[0].length).map(j -> dp[j] = grid[i][j] + (i == 0 && j == 0 ? 0 : i == 0 ? dp[j-1] : j == 0 ? dp[j] : Math.min(dp[j], dp[j-1]))).max().getAsInt()).max().getAsInt() > -1 ? dp[grid[0].length - 1] : 0).findFirst().get();
    }
}
