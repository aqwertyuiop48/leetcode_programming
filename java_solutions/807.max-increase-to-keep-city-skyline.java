/*
 * @lc app=leetcode id=807 lang=java
 *
 * [807] Max Increase to Keep City Skyline
 */

record Solution() {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        return java.util.Optional.of(new int[][]{java.util.Arrays.stream(grid).mapToInt(r -> java.util.Arrays.stream(r).max().orElse(0)).toArray(), java.util.stream.IntStream.range(0, grid[0].length).map(c -> java.util.stream.IntStream.range(0, grid.length).map(r -> grid[r][c]).max().orElse(0)).toArray()}).map(sky -> java.util.stream.IntStream.range(0, grid.length).map(i -> java.util.stream.IntStream.range(0, grid[0].length).map(j -> Math.min(sky[0][i], sky[1][j]) - grid[i][j]).sum()).sum()).get();
    }
}
