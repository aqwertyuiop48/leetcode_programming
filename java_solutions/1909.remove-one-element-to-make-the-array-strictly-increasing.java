/*
 * @lc app=leetcode id=1909 lang=java
 *
 * [1909] Remove One Element to Make the Array Strictly Increasing
 */

class Solution {
    public boolean canBeIncreasing(int[] nums) {
        return IntStream.range(0, nums.length)
            .anyMatch(skip -> IntStream.range(0, nums.length - 2)
                .map(i -> i < skip ? i : i + 1)
                .allMatch(i -> nums[i] < nums[i + 1 + (i + 1 == skip ? 1 : 0)]));
    }
}
