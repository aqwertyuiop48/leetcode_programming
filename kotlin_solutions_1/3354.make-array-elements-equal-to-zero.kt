/*
 * @lc app=leetcode id=3354 lang=java
 *
 * [3354] Make Array Elements Equal to Zero
 */
class Solution {
    fun countValidSelections(nums: IntArray): Int = nums.sum().let { total -> nums.indices.fold(0 to 0) { (left, count), i -> if (nums[i] == 0) (left to count + (if (left * 2 == total) 2 else if (Math.abs(left * 2 - total) == 1) 1 else 0)) else (left + nums[i] to count) }.second }
}