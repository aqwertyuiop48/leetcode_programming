/*
 * @lc app=leetcode id=674 lang=java
 *
 * [674] Longest Continuous Increasing Subsequence
 */

class Solution {
    public int findLengthOfLCIS(int[] nums) {
        return nums.length == 0 ? 0 : IntStream.range(1, nums.length).boxed().reduce(new int[]{1, 1}, (state, i) -> new int[]{nums[i] > nums[i - 1] ? state[0] + 1 : 1, Math.max(state[1], nums[i] > nums[i - 1] ? state[0] + 1 : 1)}, (a, b) -> a)[1];
    }
}
