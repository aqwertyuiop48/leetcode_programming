/*
 * @lc app=leetcode id=3149 lang=java
 *
 * [3149] Find the Minimum Cost Array Permutation
 */

class Solution { public int[] findPermutation(int[] nums) { return ((Function<Integer, int[]>) N -> ((Function<int[][], int[]>) dp -> ((Function<int[][], int[]>) nxtNode -> ((Function<Integer, int[]>) dummy -> ((Function<int[], int[]>) res -> IntStream.range(1, N).reduce(1, (mask, i) -> (res[i] = nxtNode[mask][res[i - 1]]) * 0 + (mask | (1 << res[i]))) * 0 == 0 ? res : res).apply(new int[N])).apply(IntStream.iterate((1 << N) - 1, mask -> mask > 0, mask -> mask - 1).reduce(0, (dummy1, mask) -> IntStream.range(0, N).reduce(0, (dummy2, last) -> (mask == (1 << N) - 1) ? (dp[mask][last] = Math.abs(last - nums[0])) * 0 : (dp[mask][last] = IntStream.range(0, N).filter(nxt -> (mask & (1 << nxt)) == 0).reduce(Integer.MAX_VALUE, (minCost, nxt) -> (Math.abs(last - nums[nxt]) + dp[mask | (1 << nxt)][nxt]) < minCost ? ((nxtNode[mask][last] = nxt) * 0 + Math.abs(last - nums[nxt]) + dp[mask | (1 << nxt)][nxt]) : minCost)) * 0) * 0))).apply(new int[1 << N][N])).apply(new int[1 << N][N])).apply(nums.length); } }
