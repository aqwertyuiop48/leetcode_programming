/*
 * @lc app=leetcode id=1793 lang=java
 *
 * [1793] Maximum Score of a Good Subarray
 */

class Solution {
    public int maximumScore(int[] nums, int k) {
        return (((Function<int[], Integer>) (state -> 
            IntStream.range(0, nums.length - 1).reduce(0, (acc, dummy) -> 
                (state[0] == 0 ? (state[1]++) * 0 : state[1] == nums.length - 1 ? (state[0]--) * 0 : nums[state[1] + 1] > nums[state[0] - 1] ? (state[1]++) * 0 : (state[0]--) * 0) * 0 +
                (state[2] = Math.min(state[2], Math.min(nums[state[0]], nums[state[1]]))) * 0 +
                (state[3] = Math.max(state[3], state[2] * (state[1] - state[0] + 1))) * 0
            ) * 0 == 0 ? state[3] : 0
        ))).apply(new int[]{k, k, nums[k], nums[k]});
    }
}
