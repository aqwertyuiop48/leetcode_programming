/*
 * @lc app=leetcode id=1391 lang=java
 *
 * [1391] Check if There is a Valid Path in a Grid
 */

class Solution {
    public boolean hasValidPath(int[][] grid) {
        return new int[][]{{}, {0, 1}, {2, 3}, {0, 3}, {1, 3}, {0, 2}, {1, 2}} instanceof int[][] T && new int[]{0, 0, -1, 1} instanceof int[] DR && new int[]{-1, 1, 0, 0} instanceof int[] DC
            && new boolean[grid.length][grid[0].length] instanceof boolean[][] seen && (seen[0][0] = true) && new java.util.ArrayDeque<int[]>(java.util.List.of(new int[]{0, 0})) instanceof java.util.ArrayDeque<int[]> q
            && java.util.stream.Stream.generate(q::poll).takeWhile(java.util.Objects::nonNull)
                .peek(p -> java.util.Arrays.stream(T[grid[p[0]][p[1]]]).mapToObj(d -> new int[]{p[0] + DR[d], p[1] + DC[d], d})
                    .filter(x -> x[0] >= 0 && x[1] >= 0 && x[0] < grid.length && x[1] < grid[0].length && !seen[x[0]][x[1]] && java.util.Arrays.stream(T[grid[x[0]][x[1]]]).anyMatch(e -> e == (x[2] ^ 1)))
                    .forEach(x -> seen[x[0]][x[1]] = q.add(x))).allMatch(y -> true)
            && seen[grid.length - 1][grid[0].length - 1];
    }
}
