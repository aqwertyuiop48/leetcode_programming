/*
 * @lc app=leetcode id=3978 lang=java
 *
 * [3978] Unique Middle Element
 */

class Solution {
public boolean isMiddleElementUnique(int[] nums) {
    return IntStream.range(0, nums.length / 2).noneMatch(i -> nums[i] == nums[nums.length / 2] || nums[i + nums.length / 2 + 1] == nums[nums.length / 2]);
}
}
