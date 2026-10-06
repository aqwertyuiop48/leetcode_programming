/*
 * @lc app=leetcode id=1034 lang=java
 *
 * [1034] Coloring A Border
 */

class Solution {
    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        return new boolean[grid.length][grid[0].length] instanceof boolean[][] seen && (seen[row][col] = true)
            && new java.util.ArrayDeque<int[]>(java.util.List.of(new int[]{row, col})) instanceof java.util.ArrayDeque<int[]> q
            && ((java.util.function.Function<int[], java.util.stream.Stream<int[]>>) p -> java.util.Arrays.stream(new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}}).map(d -> new int[]{p[0] + d[0], p[1] + d[1]})
                .filter(x -> x[0] >= 0 && x[1] >= 0 && x[0] < grid.length && x[1] < grid[0].length)) instanceof java.util.function.Function<int[], java.util.stream.Stream<int[]>> nb
            && java.util.stream.Stream.generate(q::poll).takeWhile(java.util.Objects::nonNull)
                .peek(p -> nb.apply(p).filter(x -> !seen[x[0]][x[1]] && grid[x[0]][x[1]] == grid[row][col]).forEach(x -> seen[x[0]][x[1]] = q.add(x))).toList() instanceof java.util.List<int[]> comp
            && comp.stream().filter(p -> nb.apply(p).count() < 4 || nb.apply(p).anyMatch(x -> grid[x[0]][x[1]] != grid[row][col])).toList() instanceof java.util.List<int[]> bd
            && bd.stream().allMatch(p -> (grid[p[0]][p[1]] = color) == color)
            ? grid : null;
    }
}
