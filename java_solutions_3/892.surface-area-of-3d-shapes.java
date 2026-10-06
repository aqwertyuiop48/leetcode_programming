/*
 * @lc app=leetcode id=892 lang=java
 *
 * [892] Surface Area of 3D Shapes
 */

class Solution {
    public int surfaceArea(int[][] grid) {
        return ((java.util.function.IntUnaryOperator) k -> grid[k / grid.length][k % grid.length]) instanceof java.util.function.IntUnaryOperator g
            ? java.util.stream.IntStream.range(0, grid.length * grid.length).map(k -> (g.applyAsInt(k) > 0 ? 4 * g.applyAsInt(k) + 2 : 0)
                - (k % grid.length + 1 < grid.length ? 2 * Math.min(g.applyAsInt(k), g.applyAsInt(k + 1)) : 0)
                - (k / grid.length + 1 < grid.length ? 2 * Math.min(g.applyAsInt(k), g.applyAsInt(k + grid.length)) : 0)).sum() : 0;
    }
}
