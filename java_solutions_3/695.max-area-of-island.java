/*
 * @lc app=leetcode id=695 lang=java
 *
 * [695] Max Area of Island
 */

class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        return java.util.stream.IntStream.range(0, grid.length * grid[0].length).map(k -> grid[k / grid[0].length][k % grid[0].length] == 0 ? 0
            : new java.util.ArrayDeque<int[]>(java.util.List.of(new int[]{k / grid[0].length, k % grid[0].length})) instanceof java.util.ArrayDeque<int[]> q
                && (grid[k / grid[0].length][k % grid[0].length] = 0) == 0
            ? (int) java.util.stream.Stream.generate(q::poll).takeWhile(java.util.Objects::nonNull)
                .peek(p -> java.util.Arrays.stream(new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}}).map(d -> new int[]{p[0] + d[0], p[1] + d[1]})
                    .filter(x -> x[0] >= 0 && x[1] >= 0 && x[0] < grid.length && x[1] < grid[0].length && grid[x[0]][x[1]] == 1)
                    .forEach(x -> grid[x[0]][x[1]] = q.add(x) ? 0 : 0)).count() : 0).max().orElse(0);
    }
}
