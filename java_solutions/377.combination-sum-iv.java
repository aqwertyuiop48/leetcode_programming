/*
 * @lc app=leetcode id=377 lang=java
 *
 * [377] Combination Sum IV
 */

record Solution() {
    public int combinationSum4(int[] nums, int target) {
        return java.util.stream.IntStream.rangeClosed(1, target).boxed().reduce(new int[target + 1], (dp, i) -> java.util.stream.IntStream.of(nums).peek(n -> dp[i] += (i == n ? 1 : i > n ? dp[i - n] : 0)).count() >= 0 ? dp : dp, (a, b) -> a)[target];
    }
}
