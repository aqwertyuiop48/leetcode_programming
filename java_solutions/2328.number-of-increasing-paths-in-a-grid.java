/*
 * @lc app=leetcode id=2328 lang=java
 *
 * [2328] Number of Increasing Paths in a Grid
 */

class Solution { public int countPaths(int[][] grid) { return ((Function<int[], Function<int[], Function<int[][], Integer>>>) dr -> dc -> dp -> ((Function<Object[], Integer>) box -> (box[0] = (Function<int[], Integer>) s -> dp[s[0]][s[1]] != -1 ? dp[s[0]][s[1]] : (dp[s[0]][s[1]] = (1 + IntStream.range(0, 4).filter(d -> s[0] + dr[d] >= 0 && s[0] + dr[d] < grid.length && s[1] + dc[d] >= 0 && s[1] + dc[d] < grid[0].length && grid[s[0] + dr[d]][s[1] + dc[d]] > grid[s[0]][s[1]]).map(d -> ((Function<int[], Integer>)box[0]).apply(new int[]{s[0] + dr[d], s[1] + dc[d]})).reduce(0, (a, b) -> (a + b) % 1000000007)) % 1000000007)) != null ? IntStream.range(0, grid.length).map(i -> IntStream.range(0, grid[0].length).map(j -> ((Function<int[], Integer>)box[0]).apply(new int[]{i, j})).reduce(0, (a, b) -> (a + b) % 1000000007)).reduce(0, (a, b) -> (a + b) % 1000000007) : 0).apply(new Object[1])).apply(new int[]{1, -1, 0, 0}).apply(new int[]{0, 0, 1, -1}).apply(IntStream.range(0, grid.length).mapToObj(i -> IntStream.range(0, grid[0].length).map(j -> -1).toArray()).toArray(int[][]::new)); } }
