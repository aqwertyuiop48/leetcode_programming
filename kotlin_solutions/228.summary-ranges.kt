/*
 * @lc app=leetcode id=228 lang=kotlin
 *
 * [228] Summary Ranges
 */

class Solution {fun summaryRanges(nums: IntArray) = if (nums.size == 1) listOf("${nums[0]}") else generateSequence(0 to 1) { (l, r) -> if (r > nums.size) null else if (r == nums.size || nums[r - 1] + 1 != nums[r]) (r to r + 1) else (l to r + 1) }.takeWhile { (l, r) -> r <= nums.size }.filter { (l, r) -> r == nums.size || nums[r - 1] + 1 != nums[r] }.map { (l, r) -> if (r - l == 1) "${nums[l]}" else "${nums[l]}->${nums[r - 1]}" }.toList()}
