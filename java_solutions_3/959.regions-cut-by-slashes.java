/*
 * @lc app=leetcode id=959 lang=java
 *
 * [959] Regions Cut By Slashes
 */

class Solution {
    public int regionsBySlashes(String[] grid) {
        return new int[3 * grid.length][3 * grid.length] instanceof int[][] g
            && java.util.stream.IntStream.range(0, grid.length * grid.length).filter(k -> grid[k / grid.length].charAt(k % grid.length) != ' ')
                .peek(k -> java.util.stream.IntStream.range(0, 3).forEach(r -> g[3 * (k / grid.length) + r][3 * (k % grid.length) + (grid[k / grid.length].charAt(k % grid.length) == '/' ? 2 - r : r)] = 1)).allMatch(x -> true)
            ? (int) java.util.stream.IntStream.range(0, 9 * grid.length * grid.length).filter(k -> g[k / (3 * grid.length)][k % (3 * grid.length)] == 0
                && new java.util.ArrayDeque<int[]>(java.util.List.of(new int[]{k / (3 * grid.length), k % (3 * grid.length)})) instanceof java.util.ArrayDeque<int[]> q
                && (g[k / (3 * grid.length)][k % (3 * grid.length)] = 1) == 1
                && java.util.stream.Stream.generate(q::poll).takeWhile(java.util.Objects::nonNull)
                    .peek(p -> java.util.Arrays.stream(new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}}).map(d -> new int[]{p[0] + d[0], p[1] + d[1]})
                        .filter(x -> x[0] >= 0 && x[1] >= 0 && x[0] < g.length && x[1] < g.length && g[x[0]][x[1]] == 0).forEach(x -> g[x[0]][x[1]] = q.add(x) ? 1 : 1)).allMatch(x -> true)).count()
            : 0;
    }
}
