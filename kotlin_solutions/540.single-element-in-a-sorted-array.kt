/*
 * @lc app=leetcode id=540 lang=kotlin
 *
 * [540] Single Element in a Sorted Array
 */

class Solution { fun singleNonDuplicate(nums: IntArray) = generateSequence(0 to nums.lastIndex) { (l, r) -> if (l >= r) null else (l + (r - l) / 2).let { mid -> if ((mid % 2 == 0 && mid + 1 < nums.size && nums[mid] == nums[mid + 1]) || (mid % 2 == 1 && nums[mid] == nums[mid - 1])) mid + 1 to r else l to mid } }.last().let { (l, _) -> nums[l] } }
