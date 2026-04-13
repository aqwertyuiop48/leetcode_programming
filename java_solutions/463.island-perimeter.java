/*
 * @lc app=leetcode id=463 lang=java
 *
 * [463] Island Perimeter
 */

class Solution { public int islandPerimeter(int[][] grid) { return 4 * Arrays.stream(grid).mapToInt(row -> (int) Arrays.stream(row).filter(i -> i == 1).count()).sum() - 2 * IntStream.range(0, grid.length) .flatMap(i -> IntStream.range(0, grid[0].length) .map(j -> ((j + 1 < grid[0].length && grid[i][j] == 1 && grid[i][j+1] == 1) ? 1 : 0) + ((i + 1 < grid.length && grid[i][j] == 1 && grid[i+1][j] == 1) ? 1 : 0))) .sum(); } }
