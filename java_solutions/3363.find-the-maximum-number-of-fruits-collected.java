/*
 * @lc app=leetcode id=3363 lang=java
 *
 * [3363] Find the Maximum Number of Fruits Collected
 */

class Solution { public int maxCollectedFruits(int[][] grid) { return (int) ((Function<Integer, Integer>) n -> IntStream.range(0, n).map(i -> grid[i][i]).sum() + ((Function<Function<int[][], Integer>, Integer>) dp -> dp.apply(grid) + dp.apply(IntStream.range(0, n).mapToObj(i -> IntStream.range(0, n).map(j -> grid[j][i]).toArray()).toArray(int[][]::new))).apply((Function<int[][], Integer>) g -> IntStream.range(1, n - 1).boxed().reduce(IntStream.range(0, n).map(i -> i == n - 1 ? g[0][n - 1] : -1).toArray(), (prev, row) -> IntStream.range(0, n).map(i -> ((Function<Integer, Integer>) m -> m >= 0 ? m + g[row][i] : -1).apply(Math.max(i > 0 ? prev[i - 1] : -1, Math.max(prev[i], i < n - 1 ? prev[i + 1] : -1)))).toArray(), (a, b) -> a)[n - 1])).apply(grid.length); } }
