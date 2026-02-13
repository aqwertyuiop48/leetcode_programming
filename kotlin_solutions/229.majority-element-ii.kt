/*
 * @lc app=leetcode id=229 lang=kotlin
 *
 * [229] Majority Element II
 */

class Solution {fun majorityElement(nums: IntArray) = nums.groupBy { it }.filter { it.value.size > nums.size / 3}.keys.toList()}