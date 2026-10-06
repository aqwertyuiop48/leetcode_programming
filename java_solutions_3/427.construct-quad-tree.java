/*
 * @lc app=leetcode id=427 lang=java
 *
 * [427] Construct Quad Tree
 */

class Solution {
    public Node construct(int[][] grid) {
        return java.util.Arrays.stream(grid).flatMapToInt(java.util.Arrays::stream).distinct().count() == 1
            ? new Node(grid[0][0] == 1, true)
            : ((java.util.function.BiFunction<Integer, Integer, int[][]>) (r, c) -> java.util.Arrays.stream(grid, r * grid.length / 2, (r + 1) * grid.length / 2)
                    .map(row -> java.util.Arrays.copyOfRange(row, c * grid.length / 2, (c + 1) * grid.length / 2)).toArray(int[][]::new))
                instanceof java.util.function.BiFunction<Integer, Integer, int[][]> sub
            ? new Node(true, false, construct(sub.apply(0, 0)), construct(sub.apply(0, 1)), construct(sub.apply(1, 0)), construct(sub.apply(1, 1)))
            : null;
    }
}
