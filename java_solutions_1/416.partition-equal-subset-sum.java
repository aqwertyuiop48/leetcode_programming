/*
 * @lc app=leetcode id=416 lang=java
 *
 * [416] Partition Equal Subset Sum
 */

class Solution {
    public boolean canPartition(int[] nums) {
        return java.util.Arrays.stream(nums).sum() % 2 != 0 ? false : java.util.stream.Stream.of(java.util.Arrays.stream(nums).sum() / 2).map(target -> java.util.Arrays.stream(nums).boxed().reduce(java.util.stream.Stream.of(0).map(_v -> new boolean[target + 1]).peek(dp -> dp[0] = true).findFirst().get(), (dp, num) -> java.util.stream.Stream.of(0).map(_v -> dp).peek(d -> java.util.stream.IntStream.iterate(target, i -> i >= num, i -> i - 1).forEach(i -> d[i] |= d[i - num])).findFirst().get(), (a, b) -> b)[target]).findFirst().get();
    }
}
