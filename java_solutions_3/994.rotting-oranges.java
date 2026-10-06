/*
 * @lc app=leetcode id=994 lang=java
 *
 * [994] Rotting Oranges
 */

class Solution {
    public int orangesRotting(int[][] grid) {
        return java.util.stream.IntStream.range(0, grid.length * grid[0].length).filter(k -> grid[k / grid[0].length][k % grid[0].length] == 2)
                .mapToObj(k -> new int[]{k / grid[0].length, k % grid[0].length}).toList() instanceof java.util.List<int[]> r0
            ? java.util.stream.IntStream.of((int) java.util.stream.Stream.iterate(r0, f -> !f.isEmpty(),
                    f -> f.stream().flatMap(p -> java.util.Arrays.stream(new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}}).map(d -> new int[]{p[0] + d[0], p[1] + d[1]}))
                        .filter(x -> x[0] >= 0 && x[1] >= 0 && x[0] < grid.length && x[1] < grid[0].length && grid[x[0]][x[1]] == 1 && (grid[x[0]][x[1]] = 2) == 2).toList()).count())
                .map(L -> java.util.stream.IntStream.range(0, grid.length * grid[0].length).anyMatch(k -> grid[k / grid[0].length][k % grid[0].length] == 1) ? -1 : Math.max(0, L - 1)).findFirst().getAsInt()
            : 0;
    }
}
