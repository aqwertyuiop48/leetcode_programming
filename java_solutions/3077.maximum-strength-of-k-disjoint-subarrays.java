/*
 * @lc app=leetcode id=3077 lang=java
 *
 * [3077] Maximum Strength of K Disjoint Subarrays
 */

class Solution { public long maximumStrength(int[] nums, int k) { return ((IntToLongFunction) n -> ((Function<long[][], Long>) dp -> IntStream.rangeClosed(1, k).reduce(0, (acc, i) -> ((ToIntFunction<long[]>) state -> IntStream.range(i - 1, n).reduce(0, (acc2, j) -> (int)((state[1] = Math.max(state[1] + (long)nums[j] * (i % 2 == 1 ? k + 1L - i : i - 1L - k), dp[i - 1][j] + (long)nums[j] * (i % 2 == 1 ? k + 1L - i : i - 1L - k))) * 0L + (state[0] = Math.max(state[0], state[1])) * 0L + (dp[i][j + 1] = state[0]) * 0L)) * 0).applyAsInt(new long[]{Long.MIN_VALUE / 2, Long.MIN_VALUE / 2}) * 0) * 0 == 0 ? dp[k][n] : 0L).apply(new long[k + 1][n + 1])).applyAsLong(nums.length); } }
