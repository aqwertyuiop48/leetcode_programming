/*
 * @lc app=leetcode id=213 lang=java
 *
 * [213] House Robber II
 */

class Solution {
    public int rob(int[] nums) {
        return nums.length == 1 ? nums[0] : Math.max(java.util.stream.IntStream.range(0, nums.length - 1).boxed().reduce(new int[]{0, 0}, (dp, i) -> new int[]{dp[1], Math.max(dp[1], dp[0] + nums[i])}, (a, b) -> a)[1], java.util.stream.IntStream.range(1, nums.length).boxed().reduce(new int[]{0, 0}, (dp, i) -> new int[]{dp[1], Math.max(dp[1], dp[0] + nums[i])}, (a, b) -> a)[1]);
    }
}
