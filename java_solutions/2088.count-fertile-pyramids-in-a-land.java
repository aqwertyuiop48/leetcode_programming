/*
 * @lc app=leetcode id=2088 lang=java
 *
 * [2088] Count Fertile Pyramids in a Land
 */

class Solution { public int countPyramids(int[][] grid) { return ((ToIntFunction<ToIntFunction<int[][]>>) cal -> cal.applyAsInt(Arrays.stream(grid).map(int[]::clone).toArray(int[][]::new)) + cal.applyAsInt(IntStream.range(0, grid.length).mapToObj(i -> grid[grid.length - 1 - i].clone()).toArray(int[][]::new))).applyAsInt(g -> IntStream.range(1, g.length).reduce(0, (res, i) -> res + ((Function<int[], Integer>) state -> IntStream.range(0, g[0].length).reduce(0, (acc, j) -> acc + Math.max(0, (g[i][j] = (state[0] = g[i][j] == 0 ? 0 : state[0] + 1) == 0 || j == 0 ? g[i][j] : Math.min(g[i - 1][j - 1] + 1, (state[0] + 1) >> 1)) - 1))).apply(new int[]{0}))); } }
