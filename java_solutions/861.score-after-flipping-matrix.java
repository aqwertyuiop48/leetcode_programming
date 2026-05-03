/*
 * @lc app=leetcode id=861 lang=java
 *
 * [861] Score After Flipping Matrix
 */

record Solution() {
    public int matrixScore(int[][] grid) {
        return (1 << (grid[0].length - 1)) * grid.length + java.util.stream.IntStream.range(1, grid[0].length).map(j -> (int) java.util.stream.IntStream.range(0, grid.length).filter(i -> grid[i][j] == grid[i][0]).count()).map(c -> Math.max(c, grid.length - c) * (1 << (grid[0].length - 1 - j))).sum();
    }
}
