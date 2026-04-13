/*
 * @lc app=leetcode id=1955 lang=java
 *
 * [1955] Count Number of Special Subsequences
 */

class Solution { public int countSpecialSubsequences(int[] nums) { return ((Function<long[], Integer>) dp -> IntStream.of(nums).reduce(0, (acc, x) -> (int)((dp[x] = (2 * dp[x] + (x == 0 ? 1 : dp[x - 1])) % 1000000007L) * 0L)) * 0 == 0 ? (int)dp[2] : 0).apply(new long[3]); } }
