/*
 * @lc app=leetcode id=2742 lang=java
 *
 * [2742] Painting the Walls
 */

class Solution { public int paintWalls(int[] cost, int[] time) { return ((Function<int[], Integer>) dp -> IntStream.range(0, cost.length).map(i -> IntStream.iterate(cost.length, j -> j > 0, j -> j - 1).map(j -> (dp[j] = Math.min(dp[j], dp[Math.max(j - time[i] - 1, 0)] + cost[i])) * 0).sum()).sum() * 0 == 0 ? dp[cost.length] : 0).apply(IntStream.rangeClosed(0, cost.length).map(i -> i == 0 ? 0 : 1000000000).toArray()); } }
