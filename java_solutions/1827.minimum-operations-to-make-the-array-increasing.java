/*
 * @lc app=leetcode id=1827 lang=java
 *
 * [1827] Minimum Operations to Make the Array Increasing
 */

class Solution {
    public int minOperations(int[] nums) {
        return Arrays.stream(nums)
            .boxed()
            .reduce(new int[]{0, 0}, (state, n) -> new int[]{Math.max(state[0] + 1, n), state[1] + Math.max(0, state[0] + 1 - n)}, (a, b) -> a)[1];
    }
}
