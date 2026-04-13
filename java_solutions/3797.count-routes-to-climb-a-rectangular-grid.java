/*
 * @lc app=leetcode id=3797 lang=java
 *
 * [3797] Count Routes to Climb a Rectangular Grid
 */

class Solution {
    public int numberOfRoutes(String[] grid, int d) {
        return (int) Arrays.stream(IntStream.range(0, grid.length).map(i -> grid.length - 1 - i).boxed().reduce((long[]) null, (dp, i) -> Stream.of(dp == null ? IntStream.range(0, grid[0].length()).mapToLong(x -> 1L).toArray() : dp).map(prev -> Stream.of(new long[grid[0].length() + 1]).peek(p -> IntStream.range(0, grid[0].length()).forEach(k -> p[k + 1] = (p[k] + prev[k]) % 1000000007L)).map(p -> IntStream.range(0, grid[0].length()).mapToLong(j -> grid[i].charAt(j) == '#' ? 0L : (p[Math.min(grid[0].length(), j + (dp == null ? 0 : (int) Math.sqrt((long) d * d - 1)) + 1)] - p[Math.max(0, j - (dp == null ? 0 : (int) Math.sqrt((long) d * d - 1)))] + 1000000007L) % 1000000007L).toArray()).map(dp1 -> Stream.of(new long[grid[0].length() + 1]).peek(p2 -> IntStream.range(0, grid[0].length()).forEach(k -> p2[k + 1] = (p2[k] + dp1[k]) % 1000000007L)).map(p2 -> IntStream.range(0, grid[0].length()).mapToLong(j -> grid[i].charAt(j) == '#' ? 0L : (p2[Math.min(grid[0].length(), j + d + 1)] - p2[Math.max(0, j - d)] + 1000000007L) % 1000000007L).toArray()).findFirst().get()).findFirst().get()).findFirst().get(), (a, b) -> a)).reduce(0L, (a, b) -> (a + b) % 1000000007L);
    }
}
