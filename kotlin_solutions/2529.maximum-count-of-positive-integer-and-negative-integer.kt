/*
 * @lc app=leetcode id=2529 lang=kotlin
 *
 * [2529] Maximum Count of Positive Integer and Negative Integer
 */

class Solution {fun maximumCount(nums: IntArray) = maxOf(binarySearch(nums, 0), nums.size - binarySearch(nums, 1)) fun binarySearch(nums: IntArray, target: Int) = generateSequence(Triple(0, nums.size - 1, nums.size)) { (left, right, result) -> if (left > right) null else ((left + right) / 2).let { mid -> Triple(if (nums[mid] < target) mid + 1 else left, if (nums[mid] < target) right else mid - 1, if (nums[mid] < target) result else mid) } }.last().third}
