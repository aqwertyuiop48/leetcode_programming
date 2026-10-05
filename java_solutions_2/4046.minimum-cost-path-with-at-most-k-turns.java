/*
 * @lc app=leetcode id=4046 lang=java
 *
 * [4046] Minimum Cost Path With At Most K Turns
 */

class Solution {
public int minCost(int[][] grid, int k) {
    return IntStream.of(grid.length).boxed().flatMap(m ->
           IntStream.of(grid[0].length).boxed().flatMap(n ->
           Stream.of(1_000_000_000_000_000L).map(INF ->
        m == 1 && n == 1 ? grid[0][0] :
        Stream.iterate(
                IntStream.range(0, m)
                    .mapToObj(i -> LongStream.range(0, n).map(j -> i == 0 && j == 0 ? grid[0][0] : INF).toArray())
                    .toArray(long[][]::new),
                e -> Stream.<long[][]>of(IntStream.range(0, m)
                        .mapToObj(i -> LongStream.generate(() -> INF).limit(n).toArray())
                        .toArray(long[][]::new))
                    // right
                    .peek(nx -> IntStream.range(0, m).forEach(i -> Stream.of(new long[]{INF}).forEach(run ->
                        IntStream.range(1, n).forEach(j ->
                            nx[i][j] = Math.min(nx[i][j], run[0] = Math.min(run[0], e[i][j - 1]) + grid[i][j])))))
                    // left
                    .peek(nx -> IntStream.range(0, m).forEach(i -> Stream.of(new long[]{INF}).forEach(run ->
                        IntStream.range(0, n - 1).map(x -> n - 2 - x).forEach(j ->
                            nx[i][j] = Math.min(nx[i][j], run[0] = Math.min(run[0], e[i][j + 1]) + grid[i][j])))))
                    // down
                    .peek(nx -> IntStream.range(0, n).forEach(j -> Stream.of(new long[]{INF}).forEach(run ->
                        IntStream.range(1, m).forEach(i ->
                            nx[i][j] = Math.min(nx[i][j], run[0] = Math.min(run[0], e[i - 1][j]) + grid[i][j])))))
                    // up
                    .peek(nx -> IntStream.range(0, n).forEach(j -> Stream.of(new long[]{INF}).forEach(run ->
                        IntStream.range(0, m - 1).map(x -> m - 2 - x).forEach(i ->
                            nx[i][j] = Math.min(nx[i][j], run[0] = Math.min(run[0], e[i + 1][j]) + grid[i][j])))))
                    .findFirst().get())
            .skip(k + 1L)
            .mapToLong(e -> e[m - 1][n - 1])
            .mapToInt(r -> r >= INF ? -1 : (int) r)
            .findFirst().getAsInt())))
        .findFirst().get();
}
}
