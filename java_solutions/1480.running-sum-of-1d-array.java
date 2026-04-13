/*
 * @lc app=leetcode id=1480 lang=java
 *
 * [1480] Running Sum of 1d Array
 */

class Solution {
    public int[] runningSum(int[] nums) {
        return IntStream.range(0, nums.length)
            .map(i -> nums[i] = (i == 0) ? nums[i] : (nums[i] += nums[i - 1]))
            .toArray();
    }
}
