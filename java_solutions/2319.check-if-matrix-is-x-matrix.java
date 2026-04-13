/*
 * @lc app=leetcode id=2319 lang=java
 *
 * [2319] Check if Matrix Is X-Matrix
 */

class Solution {
    public boolean checkXMatrix(int[][] grid) {
        return IntStream.range(0, grid.length).allMatch(i -> 
            IntStream.range(0, grid.length).allMatch(j -> 
                (i == j || i + j == grid.length - 1) ? grid[i][j] != 0 : grid[i][j] == 0
            )
        );
    }
}
