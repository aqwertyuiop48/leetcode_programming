/*
 * @lc app=leetcode id=494 lang=java
 *
 * [494] Target Sum
 */

class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return Math.abs(target) > java.util.Arrays.stream(nums).sum() || (java.util.Arrays.stream(nums).sum() + target) % 2 != 0 ? 0
            : java.util.stream.IntStream.of((java.util.Arrays.stream(nums).sum() + target) / 2).map(S -> new int[S + 1] instanceof int[] dp && (dp[0] = 1) == 1
                && java.util.Arrays.stream(nums).peek(x -> java.util.stream.IntStream.iterate(S, j -> j >= x, j -> j - 1).forEach(j -> dp[j] += dp[j - x])).allMatch(y -> true)
                ? dp[S] : 0).findFirst().getAsInt();
    }
}
