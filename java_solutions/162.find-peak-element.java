/*
 * @lc app=leetcode id=162 lang=java
 *
 * [162] Find Peak Element
 */

// semicolons : 1
class Solution {
    public int findPeakElement(int[] nums) {
        return IntStream.range(0, nums.length)
            .filter(i -> (i == 0 || nums[i] > nums[i - 1]) && (i == nums.length - 1 || nums[i] > nums[i + 1]))
            .findFirst()
            .orElse(0);
    }
}
