/*
 * @lc app=leetcode id=1878 lang=java
 *
 * [1878] Get Biggest Three Rhombus Sums in a Grid
 */

class Solution {
    public int[] getBiggestThree(int[][] grid) {
        return java.util.stream.IntStream.range(0, grid.length).flatMap(i -> java.util.stream.IntStream.range(0, grid[0].length).flatMap(j -> java.util.stream.IntStream.range(0, Math.min(grid.length, grid[0].length)).filter(L -> i - L >= 0 && i + L < grid.length && j - L >= 0 && j + L < grid[0].length).map(L -> L == 0 ? grid[i][j] : java.util.stream.IntStream.range(0, L).map(k -> grid[i - L + k][j + k] + grid[i + k][j + L - k] + grid[i + L - k][j - k] + grid[i - k][j - L + k]).sum()))).distinct().boxed().sorted(java.util.Collections.reverseOrder()).limit(3).mapToInt(Integer::intValue).toArray();
    }
}
