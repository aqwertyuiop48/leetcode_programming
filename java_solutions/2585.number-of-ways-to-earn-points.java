/*
 * @lc app=leetcode id=2585 lang=java
 *
 * [2585] Number of Ways to Earn Points
 */

class Solution { public int waysToReachTarget(int target, int[][] types) { return ((Function<int[], Integer>) dp -> Arrays.stream(types).mapToInt(t -> IntStream.iterate(target, i -> i > 0, i -> i - 1).map(i -> IntStream.iterate(1, k -> k <= t[0] && i - t[1] * k >= 0, k -> k + 1).map(k -> (dp[i] = (dp[i] + dp[i - t[1] * k]) % 1000000007) * 0).sum() * 0).sum() * 0).sum() * 0 == 0 ? dp[target] : 0).apply(((Function<int[], int[]>) arr -> (arr[0] = 1) == 1 ? arr : arr).apply(new int[target + 1])); } }
