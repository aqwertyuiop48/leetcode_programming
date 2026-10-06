/*
 * @lc app=leetcode id=813 lang=java
 *
 * [813] Largest Sum of Averages
 */

class Solution {
    public double largestSumOfAverages(int[] nums, int k) {
        return new double[nums.length + 1] instanceof double[] pre && new double[nums.length + 1] instanceof double[] dp
            && java.util.stream.IntStream.range(0, nums.length).peek(i -> pre[i + 1] = pre[i] + nums[i]).allMatch(x -> true)
            && java.util.stream.IntStream.rangeClosed(1, nums.length).peek(i -> dp[i] = pre[i] / i).allMatch(x -> true)
            && java.util.stream.IntStream.range(1, k).peek(g -> java.util.stream.IntStream.iterate(nums.length, i -> i >= 1, i -> i - 1)
                .forEach(i -> dp[i] = java.util.stream.IntStream.range(g, i).mapToDouble(j -> dp[j] + (pre[i] - pre[j]) / (i - j)).max().orElse(dp[i]))).allMatch(x -> true)
            ? dp[nums.length] : 0;
    }
}
