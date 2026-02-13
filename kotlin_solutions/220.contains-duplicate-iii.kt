/*
 * @lc app=leetcode id=220 lang=kotlin
 *
 * [220] Contains Duplicate III
 */

class Solution { fun containsNearbyAlmostDuplicate(nums: IntArray, indexDiff: Int, valueDiff: Int): Boolean = nums.indices.fold(TreeSet<Int>()) { treeSet, i -> treeSet.ceiling(nums[i] - valueDiff)?.takeIf { it <= nums[i] + valueDiff }?.let { return true } .run{treeSet.apply { add(nums[i]) }.apply { if (i >= indexDiff) remove(nums[i - indexDiff]) }} }.let { false } }

