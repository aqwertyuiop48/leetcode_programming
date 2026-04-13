/*
 * @lc app=leetcode id=1883 lang=java
 *
 * [1883] Minimum Skips to Arrive at Meeting On Time
 */

class Solution { public int minSkips(int[] dist, int speed, int hoursBefore) { return ((Function<int[], Integer>) dp -> IntStream.range(0, dist.length).reduce(0, (acc, i) -> IntStream.iterate(dp.length - 1, j -> j >= 0, j -> j - 1).reduce(0, (acc2, j) -> (dp[j] = i == dist.length - 1 ? dp[j] + dist[i] : Math.min(j - 1 >= 0 ? dp[j-1] + dist[i] : (dp[j] + dist[i] + speed - 1) / speed * speed, (dp[j] + dist[i] + speed - 1) / speed * speed)) * 0) * 0) * 0 == 0 ? IntStream.range(0, dp.length).filter(j -> dp[j] <= (long) hoursBefore * speed).findFirst().orElse(-1) : -1).apply(new int[dist.length + 1]); } }
