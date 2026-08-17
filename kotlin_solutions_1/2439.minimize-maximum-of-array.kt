/*
 * @lc app=leetcode id=2439 lang=kotlin
 *
 * [2439] Minimize Maximum of Array
 */
class Solution { fun minimizeArrayValue(nums: IntArray): Int = nums.foldIndexed(0L to 0L) { i, acc, n -> (acc.first + n).let { s -> s to kotlin.math.max(acc.second, (s + i) / (i + 1)) } }.second.toInt() }