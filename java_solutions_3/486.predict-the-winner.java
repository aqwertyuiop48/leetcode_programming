/*
 * @lc app=leetcode id=486 lang=java
 *
 * [486] Predict the Winner
 */

class Solution {
    public boolean predictTheWinner(int[] nums) {
        return new int[nums.length][nums.length] instanceof int[][] d
            && java.util.stream.IntStream.range(0, nums.length).peek(i -> d[i][i] = nums[i]).allMatch(x -> true)
            && java.util.stream.IntStream.range(1, nums.length).peek(len -> java.util.stream.IntStream.range(0, nums.length - len)
                .forEach(i -> d[i][i + len] = Math.max(nums[i] - d[i + 1][i + len], nums[i + len] - d[i][i + len - 1]))).allMatch(x -> true)
            && d[0][nums.length - 1] >= 0;
    }
}
