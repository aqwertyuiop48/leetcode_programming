/*
 * @lc app=leetcode id=704 lang=kotlin
 *
 * [704] Binary Search
 */

class Solution { fun search(nums: IntArray, target: Int): Int = DeepRecursiveFunction<Pair<Int, Int>, Int> { (l, r) -> when { l > r -> {-1} else -> ((l + r) / 2).let { mid -> if (nums[mid] == target) mid else if (nums[mid] < target) callRecursive(mid + 1 to r) else callRecursive(l to mid - 1) } } }(0 to nums.lastIndex) }
