/*
 * @lc app=leetcode id=486 lang=java
 *
 * [486] Predict the Winner
 */

record Solution() {
    public boolean predictTheWinner(int[] nums) {
        return java.util.stream.IntStream.rangeClosed(1, nums.length).boxed().reduce(new int[nums.length][nums.length], (dp, len) -> java.util.stream.IntStream.range(0, nums.length - len + 1).peek(i -> dp[i][i + len - 1] = len == 1 ? nums[i] : Math.max(nums[i] - dp[i + 1][i + len - 1], nums[i + len - 1] - dp[i][i + len - 2])).count() >= 0 ? dp : dp, (a, b) -> a)[0][nums.length - 1] >= 0;
    }
}
