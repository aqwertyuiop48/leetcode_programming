/*
 * @lc app=leetcode id=1866 lang=java
 *
 * [1866] Number of Ways to Rearrange Sticks With K Sticks Visible
 */

class Solution { public int rearrangeSticks(int n, int k) { return ((Function<long[], Integer>) dp -> (dp[1] = 1L) * 0 == 0 && IntStream.rangeClosed(2, n).reduce(0, (acc, i) -> IntStream.iterate(Math.min(i, k), j -> j >= 1, j -> j - 1).reduce(0, (acc2, j) -> (int)((dp[j] = ((i - 1) * dp[j] + dp[j - 1]) % 1000000007L) * 0L)) * 0) * 0 == 0 ? (int)dp[k] : 0).apply(new long[k + 1]); } }
