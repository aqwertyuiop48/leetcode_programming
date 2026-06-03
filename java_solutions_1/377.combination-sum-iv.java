/*
 * @lc app=leetcode id=377 lang=java
 *
 * [377] Combination Sum IV
 */

// @lc code=start
class Solution {
    public int combinationSum4(int[] nums, int target) {
        return java.util.stream.IntStream.rangeClosed(1, target).boxed().reduce(java.util.stream.Stream.of(0).map(_v -> new int[target + 1]).peek(dp -> dp[0] = 1).findFirst().get(), (dp, i) -> java.util.stream.Stream.of(0).map(_v -> dp).peek(d -> d[i] = java.util.Arrays.stream(nums).filter(num -> i - num >= 0).map(num -> d[i - num]).sum()).findFirst().get(), (a, b) -> b)[target];
    }
}
// @lc code=end
