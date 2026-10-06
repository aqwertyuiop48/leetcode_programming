/*
 * @lc app=leetcode id=698 lang=java
 *
 * [698] Partition to K Equal Sum Subsets
 */

class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        return java.util.Arrays.stream(nums).sum() % k == 0 && java.util.stream.IntStream.of(java.util.Arrays.stream(nums).sum() / k).allMatch(T ->
            java.util.Arrays.stream(nums).max().getAsInt() <= T && new int[1 << nums.length] instanceof int[] dp
            && java.util.stream.IntStream.range(0, dp.length).peek(m -> dp[m] = -1).allMatch(x -> true) && (dp[0] = 0) == 0
            && java.util.stream.IntStream.range(0, dp.length).filter(m -> dp[m] >= 0).peek(m -> java.util.stream.IntStream.range(0, nums.length)
                .filter(i -> (m >> i & 1) == 0 && dp[m] + nums[i] <= T).forEach(i -> dp[m | 1 << i] = (dp[m] + nums[i]) % T)).allMatch(x -> true)
            && dp[dp.length - 1] == 0);
    }
}
