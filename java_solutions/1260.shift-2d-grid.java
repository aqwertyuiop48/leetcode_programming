/*
 * @lc app=leetcode id=1260 lang=java
 *
 * [1260] Shift 2D Grid
 */

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        return IntStream.range(0, grid.length)
            .mapToObj(r -> IntStream.range(0, grid[0].length)
                .map(c -> ((r * grid[0].length + c - k % (grid.length * grid[0].length) + (grid.length * grid[0].length)) % (grid.length * grid[0].length)))
                .mapToObj(oldIdx -> grid[oldIdx / grid[0].length][oldIdx % grid[0].length])
                .collect(Collectors.toList()))
            .collect(Collectors.toList());
    }
}
