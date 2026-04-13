/*
 * @lc app=leetcode id=2460 lang=java
 *
 * [2460] Apply Operations to an Array
 */

class Solution {
    public int[] applyOperations(int[] nums) {
        return IntStream.concat(
            IntStream.range(0, nums.length)
                .map(i -> (i < nums.length - 1 && nums[i] == nums[i + 1]) ? (nums[i + 1] = 0) == 0 ? nums[i] * 2 : 0 : nums[i])
                .filter(n -> n != 0),
            IntStream.generate(() -> 0)
        ).limit(nums.length).toArray();
    }
}
