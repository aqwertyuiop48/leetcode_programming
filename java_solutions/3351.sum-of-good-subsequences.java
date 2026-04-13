/*
 * @lc app=leetcode id=3351 lang=java
 *
 * [3351] Sum of Good Subsequences
 */

class Solution { public int sumOfGoodSubsequences(int[] nums) { return ((Function<long[][], Integer>) dp -> Arrays.stream(nums).map(x -> (int) ((dp[0][x] = (dp[0][x] + x + (x > 0 ? dp[0][x - 1] + dp[1][x - 1] * x : 0) + dp[0][x + 1] + dp[1][x + 1] * x) % 1000000007L) * 0 + (dp[1][x] = (dp[1][x] + 1 + (x > 0 ? dp[1][x - 1] : 0) + dp[1][x + 1]) % 1000000007L) * 0)).sum() * 0 + (int) Arrays.stream(dp[0]).reduce(0L, (a, b) -> (a + b) % 1000000007L)).apply(new long[2][100010]); } }
