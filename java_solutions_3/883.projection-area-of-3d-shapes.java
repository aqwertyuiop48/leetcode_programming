/*
 * @lc app=leetcode id=883 lang=java
 *
 * [883] Projection Area of 3D Shapes
 */

class Solution {
    public int projectionArea(int[][] grid) {
        return (int) java.util.Arrays.stream(grid).flatMapToInt(java.util.Arrays::stream).filter(v -> v > 0).count()
            + java.util.Arrays.stream(grid).mapToInt(r -> java.util.Arrays.stream(r).max().getAsInt()).sum()
            + java.util.stream.IntStream.range(0, grid[0].length).map(j -> java.util.Arrays.stream(grid).mapToInt(r -> r[j]).max().getAsInt()).sum();
    }
}
