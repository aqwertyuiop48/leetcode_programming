/*
 * @lc app=leetcode id=934 lang=java
 *
 * [934] Shortest Bridge
 */

class Solution {
    public int shortestBridge(int[][] grid) {
        return ((java.util.function.Function<int[], java.util.stream.Stream<int[]>>) p -> java.util.Arrays.stream(new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}}).map(d -> new int[]{p[0] + d[0], p[1] + d[1]})
                .filter(x -> x[0] >= 0 && x[1] >= 0 && x[0] < grid.length && x[1] < grid.length)) instanceof java.util.function.Function<int[], java.util.stream.Stream<int[]>> nb
            && new java.util.ArrayDeque<int[]>(java.util.stream.IntStream.range(0, grid.length * grid.length).filter(k -> grid[k / grid.length][k % grid.length] == 1).limit(1)
                .mapToObj(k -> new int[]{k / grid.length, k % grid.length}).toList()) instanceof java.util.ArrayDeque<int[]> q
            && q.stream().allMatch(p -> (grid[p[0]][p[1]] = 2) == 2)
            && java.util.stream.Stream.generate(q::poll).takeWhile(java.util.Objects::nonNull)
                .peek(p -> nb.apply(p).filter(x -> grid[x[0]][x[1]] == 1).forEach(x -> grid[x[0]][x[1]] = q.add(x) ? 2 : 2)).toList() instanceof java.util.List<int[]> isl
            ? java.util.stream.Stream.iterate(isl, f -> !f.isEmpty(), f -> f.stream().flatMap(nb).filter(x -> grid[x[0]][x[1]] == 0 && (grid[x[0]][x[1]] = 2) == 2).toList())
                .map(f -> f.stream().flatMap(nb).anyMatch(x -> grid[x[0]][x[1]] == 1)).toList().indexOf(true)
            : -1;
    }
}
