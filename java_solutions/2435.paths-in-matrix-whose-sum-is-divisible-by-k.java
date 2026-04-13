/*
 * @lc app=leetcode id=2435 lang=java
 *
 * [2435] Paths in Matrix Whose Sum Is Divisible by K
 */

class Solution { public int numberOfPaths(int[][] grid, int k) { return ((Function<int[][][], Integer>) dp -> IntStream.range(0, grid.length).map(i -> IntStream.range(0, grid[0].length).map(j -> (i == 0 && j == 0) ? (dp[0][0][grid[0][0] % k] = 1) * 0 : IntStream.range(0, k).map(r -> dp[i % 2][j][(r + grid[i][j]) % k] = ((i > 0 ? dp[1 - i % 2][j][r] : 0) + (j > 0 ? dp[i % 2][j - 1][r] : 0)) % 1000000007).sum() * 0).sum() * 0).sum() * 0 == 0 ? dp[(grid.length - 1) % 2][grid[0].length - 1][0] : 0).apply(new int[2][grid[0].length][k]); } }
