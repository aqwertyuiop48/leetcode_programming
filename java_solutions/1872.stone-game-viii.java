/*
 * @lc app=leetcode id=1872 lang=java
 *
 * [1872] Stone Game VIII
 */

class Solution { public int stoneGameVIII(int[] stones) { return ((Function<int[], Integer>) pref -> ((ToIntFunction<int[]>) dp -> IntStream.iterate(stones.length - 2, i -> i >= 1, i -> i - 1).reduce(0, (acc, i) -> (dp[0] = Math.max(dp[0], pref[i] - dp[0])) * 0) * 0 == 0 ? dp[0] : 0).applyAsInt(new int[]{pref[stones.length - 1]})).apply(((Function<int[], int[]>) p -> IntStream.range(1, stones.length).reduce(0, (acc, i) -> (p[i] = p[i - 1] + stones[i]) * 0) * 0 == 0 ? p : p).apply(((Function<int[], int[]>) p -> (p[0] = stones[0]) * 0 == 0 ? p : p).apply(new int[stones.length]))); } }
