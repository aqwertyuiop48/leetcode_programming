/*
 * @lc app=leetcode id=724 lang=java
 *
 * [724] Find Pivot Index
 */

class Solution {
    public int pivotIndex(int[] nums) {
        return Optional.of(new int[]{Arrays.stream(nums).sum(), 0}) .map(state -> IntStream.range(0, nums.length) .filter(i -> (state[1] * 2 == state[0] - nums[i]) || (state[1] += nums[i]) * 0 != 0) .findFirst().orElse(-1)).get();
    }
}
